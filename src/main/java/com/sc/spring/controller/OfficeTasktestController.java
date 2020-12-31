package com.sc.spring.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.service.OfficeTaskdetservice;
import com.sc.spring.service.OfficeTasktestservice;
import com.sc.spring.service.SysUseraccountService;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.java2d.opengl.OGLContext;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * 类名：OfficeTaskdetController
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:49
 * 版本：V1.0
 */
@Controller/*控制器注解*/
@RequestMapping("/OfficeTasktestctl")  /*控制器类的请求映射url*/
public class OfficeTasktestController {
    @Autowired
    OfficeTasktestservice officeTasktestservice;

    @Autowired
    OfficeTaskdetservice officeTaskdetservice;

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
            if (obj.get("name").equals("search"))
            {
                datemax = obj.getString("search");
            }
        }

        PageInfo<OfficeTasktest> pageInfo = officeTasktestservice.selectpage(iDisplayStart/iDisplayLength+1, iDisplayLength, null,datemin,datemax,search);


        ResultNew resultNew=new ResultNew();
        resultNew.setsEcho(sEcho);// 当前第几页
        resultNew.setiTotalDisplayRecords(pageInfo.getTotal());//获取总条数
        resultNew.setiTotalRecords(pageInfo.getList().size());//每页显示的行数
        resultNew.setAaData(pageInfo.getList());//集合数据

        return resultNew;
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public R add(OfficeTasktest officeTasktest,HttpSession session ) {
           SysUseraccount nowuser = (SysUseraccount) session.getAttribute("nowuser");
           officeTasktest.setCompanyNumber(nowuser.getCompanyId()+"");//从session中获取当前登录人的部门编号
           officeTasktest.setTaskPublisher(nowuser.getUserName());//从session中获取当前登录人
           Date d=new Date();
           officeTasktest.setLastModificationTime(d);

        // if(officeTest!=null&&officeTest.getIndexId()!=null&&!officeTest.getIndexId().equals("")){
        if (officeTasktest!= null && officeTasktest.getTaskId() != null&& !officeTasktest.getTaskId().equals("")) {
            this.officeTasktestservice.update(officeTasktest);
            return new R(200, "修改成功！！！");
        } else {
            String[] recevier = null;

            if (officeTasktest.getRecevier() != null && !officeTasktest.getRecevier().equals("")) {//判断发布者不为空
                recevier = officeTasktest.getRecevier().split(",");
            }

           if (recevier != null && recevier.length > 0) {
               this.officeTasktestservice.add(officeTasktest);
                for (int i = 0; i < recevier.length; i++) {
                    System.out.println("========接受任务的编号======" + recevier[i]);

                    OfficeTaskdet officeTaskdet = new OfficeTaskdet();
                    officeTaskdet.setState("已分配");
                    officeTaskdet.setItIsCompeleted("未完成");
                    officeTaskdet.setLastModificationTime(new Date());
                    officeTaskdet.setTaskId(new String(officeTasktest.getTaskId()));
                    officeTaskdet.setAcceptUserNumber(recevier[i]);
                    officeTaskdet.setCompanyNumber(nowuser.getCompanyId()+"");//从session中获取当前登录人的部门编号
                    officeTaskdet.setLastModificationTime(d);
                    this.officeTaskdetservice.add(officeTaskdet);
                }
            }

            return new R(200, "添加成功");
        }
    }


    @RequestMapping("/del.do")
    @ResponseBody
    public R del(String taskId){
        System.out.println("--=======--"+taskId);
        this.officeTasktestservice.del(taskId);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public OfficeTasktest get(String taskId) {
        System.out.println("--=======--"+taskId);
        return this.officeTasktestservice.get(taskId);
    }


    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        //String indexId
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                String taskId=new String(s[i]);
                this.officeTasktestservice.del(taskId);
            }
        }

        return new R(200,"删除成功！");
    }
    @RequestMapping("/selectRoles.do")
    @ResponseBody
    public List<OfficeTasktest> selectRoles() {
        return this.officeTasktestservice.selectRoles();
    }

}
