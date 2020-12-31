package com.sc.spring.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.service.OfficeTaskdetservice;
import com.sc.spring.service.OfficeTasktestservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 类名：OfficeTaskdetController
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:49
 * 版本：V1.0
 */
@Controller/*控制器注解*/
@RequestMapping("/OfficeTaskdetctl")  /*控制器类的请求映射url*/
public class OfficeTaskdetController {
    @Autowired
    OfficeTaskdetservice officeTaskdetservice;

    @Autowired
    OfficeTasktestservice officeTasktestservice;


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

        PageInfo<OfficeTaskdet> pageInfo = officeTaskdetservice.selectpage(iDisplayStart/iDisplayLength+1, iDisplayLength, null,datemin,datemax,search);


        ResultNew resultNew=new ResultNew();
        resultNew.setsEcho(sEcho);// 当前第几页
        resultNew.setiTotalDisplayRecords(pageInfo.getTotal());//获取总条数
        resultNew.setiTotalRecords(pageInfo.getList().size());//每页显示的行数
        resultNew.setAaData(pageInfo.getList());//集合数据

        return resultNew;
    }

    @RequestMapping("/selectmy.do")
    @ResponseBody
    public ResultNew selectmy(@RequestParam String aoData, HttpSession session){//定义aoData，用来传输的，别写错了就行了
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
        SysUseraccount nowuser = (SysUseraccount) session.getAttribute("nowuser");
        OfficeTaskdet officeTaskdet=new OfficeTaskdet();
        officeTaskdet.setAcceptUserNumber(nowuser.getUserId()+"");

        PageInfo<OfficeTaskdet> pageInfo = officeTaskdetservice.selectpagemy(iDisplayStart/iDisplayLength+1, iDisplayLength, officeTaskdet,datemin,datemax,search);


        ResultNew resultNew=new ResultNew();
        resultNew.setsEcho(sEcho);// 当前第几页
        resultNew.setiTotalDisplayRecords(pageInfo.getTotal());//获取总条数
        resultNew.setiTotalRecords(pageInfo.getList().size());//每页显示的行数
        resultNew.setAaData(pageInfo.getList());//集合数据

        return resultNew;
    }

    @RequestMapping("/selectdet.do")
    @ResponseBody
    public ResultNew selectdet(@RequestParam String aoData, HttpSession session){//定义aoData，用来传输的，别写错了就行了
        System.out.println("+++++++++++++++++++++++++"+aoData);

        JSONArray jsonarray = JSONArray.parseArray(aoData);
        int sEcho = 1; //当前第几页

        String datemin = null; //开始日期
        String datemax = null; //结束日期
        String search = null; // 搜索
        String taskId = null;

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

            if (obj.get("name").equals("taskId"))
            {
                taskId = obj.getString("value");
            }
        }
        SysUseraccount nowuser = (SysUseraccount) session.getAttribute("nowuser");
        OfficeTaskdet officeTaskdet=new OfficeTaskdet();
        officeTaskdet.setTaskId(taskId);

        PageInfo<OfficeTaskdet> pageInfo = officeTaskdetservice.selectpagedet(iDisplayStart/iDisplayLength+1, iDisplayLength, officeTaskdet,datemin,datemax,search);


        ResultNew resultNew=new ResultNew();
        resultNew.setsEcho(sEcho);// 当前第几页
        resultNew.setiTotalDisplayRecords(pageInfo.getTotal());//获取总条数
        resultNew.setiTotalRecords(pageInfo.getList().size());//每页显示的行数
        resultNew.setAaData(pageInfo.getList());//集合数据

        return resultNew;
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public R add(OfficeTaskdet officeTaskdet) {
        System.out.println("---"+officeTaskdet);
        if(officeTaskdet!=null&&officeTaskdet.getOfficeId()!=null&&!officeTaskdet.getOfficeId().equals("")){
            return new R(200,"修改成功！！！");
        }
        else{
            this.officeTaskdetservice.add(officeTaskdet);
            return new R(200,"添加成功");
        }

    }
    @RequestMapping("/del.do")
    @ResponseBody
    public R del(Long officeId){
        System.out.println("--=======--"+officeId);

        this.officeTaskdetservice.del(officeId);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/ok.do")
    @ResponseBody
    public R ok(Long officeId){
        System.out.println("--=======--"+officeId);

        OfficeTaskdet officeTaskdet = this.officeTaskdetservice.get(officeId);
        officeTaskdet.setItIsCompeleted("已完成");
        officeTaskdet.setState("已结束");
        this.officeTaskdetservice.update(officeTaskdet);
        return new R(200,"设置已完成成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public OfficeTaskdet get(Long officeId) {
        System.out.println("--================--"+officeId);
        OfficeTaskdet officeTaskdet=this.officeTaskdetservice.get(officeId);
        officeTaskdet.setState("已接受");
        this.officeTaskdetservice.update(officeTaskdet);
        OfficeTasktest officeTasktest1 = this.officeTasktestservice.get(officeTaskdet.getTaskId().toString());
        officeTaskdet.setOfficeTasktest(officeTasktest1);

        return officeTaskdet;

    }

    @RequestMapping("/selectRoles.do")
    @ResponseBody
    public List<OfficeTaskdet> selectRoles() {
        return this.officeTaskdetservice.selectRoles();
    }


}
