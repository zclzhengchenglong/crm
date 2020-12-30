package com.sc.spring.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.service.OfficeMesDetService;
import com.sc.spring.service.OfficeMesService;
import com.sc.spring.service.SaleClientlossService;
import com.sc.spring.service.SysUseraccountService;
import com.sc.spring.service.impl.OfficeMesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 类名：OfficeMesController
 * 描述：一段话描述类的信息
 * 作者：谢齐
 * 日期：2020/12/11 19:07
 * 版本：V1.0
 */
@Controller         /*控制器注解*/
@RequestMapping("/officemes")   /*控制器类的请求映射url*/
public class OfficeMesController {

    @Autowired
    OfficeMesService officeMesService;

    @Autowired
    OfficeMesDetService officeMesDetService;

    @Autowired
    SysUseraccountService sysUseraccountService;

    @RequestMapping("/select.do")
    @ResponseBody
    public ResultNew select(@RequestParam String aoData){
            System.out.println("+++++++++++++++++++++++++"+aoData);

            JSONArray jsonarray = JSONArray.parseArray(aoData);
            int sEcho = 1; //当前第几页

            String datemin = null; //开始日期
            String datemax = null; //结束日期
            String search = null; // 搜索

            int iDisplayStart = 0; // 起始索引
            int iDisplayLength = 0; // 每页显示的行数

            for (int i = 0; i < jsonarray.size(); i++) {
                JSONObject obj = (JSONObject) jsonarray.get(i);
                if (obj.get("name").equals("sEcho"))
                {
                    sEcho = obj.getIntValue("value");
                }
                if (obj.get("name").equals("iDisplayStart"))
                {
                    iDisplayStart = obj.getIntValue("value");
                }
                if (obj.get("name").equals("iDisplayLength"))
                {
                    iDisplayLength = obj.getIntValue("value");
                }
                if (obj.get("name").equals("search"))
                {
                    search = obj.getString("value");
                }
                if (obj.get("name").equals("datemin"))
                {
                    datemin = obj.getString("value");
                }

                if (obj.get("name").equals("datemax"))
                {
                    datemax = obj.getString("value");
                }
            }

        PageInfo<Officemes> pageInfo = officeMesService.selectpage(iDisplayStart/iDisplayLength+1, iDisplayLength, null,datemin,datemax,search);


        ResultNew resultNew=new ResultNew();
        resultNew.setsEcho(sEcho);// 当前第几页
        resultNew.setiTotalDisplayRecords(pageInfo.getTotal());//获取总条数
        resultNew.setiTotalRecords(pageInfo.getList().size());//每页显示的行数
        resultNew.setAaData(pageInfo.getList());//集合数据

        return resultNew;
    }


    @RequestMapping("/add.do")
    @ResponseBody
    public R add(Officemes officemes, HttpSession session) {
        System.out.println("----"+officemes);

        String[] recevier=null;

        if(officemes.getSender()!=null&&!officemes.getSender().equals("")){
            recevier=officemes.getSender().split(",");
        }

        if(officemes!=null&&officemes.getOfficeId()!=null){
            this.officeMesService.update(officemes);
            return new R(200,"修改成功！");
        }else {

            SysUseraccount nowuser = (SysUseraccount)session.getAttribute("nowuser");
            officemes.setCompanyNumber(new BigDecimal(nowuser.getCompanyId()));//从session中获取当前登录人的部门编号
            officemes.setSender(nowuser.getUserName());//从session中获取当前登录人

            this.officeMesService.add(officemes);
            System.out.println("=================="+officemes);
            if(recevier!=null&&recevier.length>0){
                for (int i = 0; i <recevier.length ; i++) {
                    System.out.println("========接收者编号======"+recevier[i]);
                    Officemesdet officemesdet=new Officemesdet();
                    officemesdet.setMessageStatus("未读");
                    officemesdet.setCompanyNumber(new BigDecimal(nowuser.getCompanyId()));//从session中获取当前登录人的部门编号
                    officemesdet.setLasttime(new Date());
                    officemesdet.setReceiverNumber(new BigDecimal(recevier[i]));
                    officemesdet.setSmsNumner(new BigDecimal(officemes.getOfficeId()));
                    this.officeMesDetService.add(officemesdet);
                }

            }
            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(Long officeId) {
        System.out.println("--=======--"+officeId);
        this.officeMesService.del(officeId);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public Officemes get(Long officeId) {
        System.out.println("--=======--"+officeId);
        return this.officeMesService.get(officeId);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");  //split()：拆分字符串   split分裂，拆分
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                Long officeId=new Long(s[i]);
                this.officeMesService.del(officeId);
            }
        }

        return new R(200,"删除成功！");
    }

    @RequestMapping("/selectUsers.do")
    @ResponseBody
    public List<SysUseraccount> selectUsers() {
        return officeMesService.selectUsers();
    }
}
