package com.sc.spring.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.service.OfficeTaskdetservice;
import com.sc.spring.service.OfficeTestservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

/**
 * 类名：OfficeTaskdetController
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:49
 * 版本：V1.0
 */
@Controller/*控制器注解*/
@RequestMapping("/OfficeTestctl")  /*控制器类的请求映射url*/
public class OfficeTestController {
    @Autowired
    OfficeTestservice officeTestservice;


    @RequestMapping("/select.do")
    @ResponseBody
    public ResultNew select(@RequestParam String aoData){//定义aoData，用来传输的，别写错了就行了
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

        PageInfo<OfficeTest> pageInfo = officeTestservice.selectpage(iDisplayStart/iDisplayLength+1, iDisplayLength, null,datemin,datemax,search);


        ResultNew resultNew=new ResultNew();
        resultNew.setsEcho(sEcho);// 当前第几页
        resultNew.setiTotalDisplayRecords(pageInfo.getTotal());//获取总条数
        resultNew.setiTotalRecords(pageInfo.getList().size());//每页显示的行数
        resultNew.setAaData(pageInfo.getList());//集合数据

        return resultNew;
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public R add(OfficeTest officeTest, HttpSession session ) {
        System.out.println("11111111111111111111111111111"+officeTest);
        SysUseraccount nowuser = (SysUseraccount) session.getAttribute("nowuser");
        officeTest.setCompanyNumber(nowuser.getCompanyId()+"");//从session中获取当前登录人的部门编号

        if(officeTest!=null&&officeTest.getIndexId()!=null&&!officeTest.getIndexId().equals("")){
            this.officeTestservice.update(officeTest);
            return new R(200,"修改成功！！！");
        }
        else{
            this.officeTestservice.add(officeTest);
            return new R(200,"添加成功");
        }

    }
    @RequestMapping("/del.do")
    @ResponseBody
    public R del(String indexId){
        System.out.println("--=======--"+indexId);
        this.officeTestservice.del(indexId);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public OfficeTest get(String indexId) {
        System.out.println("--=======--"+indexId);
        return this.officeTestservice.get(indexId);
    }


    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        //String indexId
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                String indexId=new String(s[i]);
                this.officeTestservice.del(indexId);
            }
        }

        return new R(200,"删除成功！");
    }
    @RequestMapping("/selectRoles.do")
    @ResponseBody
    public List<OfficeTest> selectRoles() {
        return this.officeTestservice.selectRoles();
    }

}
