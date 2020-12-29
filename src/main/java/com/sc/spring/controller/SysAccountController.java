package com.sc.spring.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.service.SysAccountService;
import com.sc.spring.service.SysRoleService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 类名：SaleClientlossController
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:07
 * 版本：V1.0
 */
@Controller         /*控制器注解*/
@RequestMapping("/systemuseraccount")   /*控制器类的请求映射url*/
public class SysAccountController {

    @Autowired
    SysAccountService sysAccountService;

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
        PageInfo<SysUseraccount> pageInfo = sysAccountService.selectpage(iDisplayStart/iDisplayLength+1, iDisplayLength, null,datemin,datemax,search);


        ResultNew resultNew=new ResultNew();
        resultNew.setsEcho(sEcho);// 当前第几页
        resultNew.setiTotalDisplayRecords(pageInfo.getTotal());//获取总条数
        resultNew.setiTotalRecords(pageInfo.getList().size());//每页显示的行数
        resultNew.setAaData(pageInfo.getList());//集合数据

        return resultNew;
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SysUseraccount sysUseraccount,HttpSession session) {
        System.out.println("----"+sysUseraccount);
        if(sysUseraccount!=null&&sysUseraccount.getUserId()!=null){
            String userPassword=sysUseraccount.getUserPassword();
            String salt="qwerty";
            int count=3;
            Md5Hash md5Hash=new Md5Hash(userPassword,salt,count);
            sysUseraccount.setUserPassword(md5Hash.toString());
            this.sysAccountService.update(sysUseraccount);
            return new R(200,"修改成功！");
        }else {

            String userPassword=sysUseraccount.getUserPassword();
            String salt="qwerty";
            int count=3;
            Md5Hash md5Hash=new Md5Hash(userPassword,salt,count);
            sysUseraccount.setUserPassword(md5Hash.toString());
            this.sysAccountService.add(sysUseraccount);

            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(Long userId) {
        System.out.println("--=======--"+userId);
        this.sysAccountService.del(userId);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public SysUseraccount get(Long userId) {
        System.out.println("--=======--"+userId);
        return this.sysAccountService.get(userId);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                Long id=new Long(s[i]);
                this.sysAccountService.del(id);
            }
        }

        return new R(200,"删除成功！");
    }

    @RequestMapping("/updatepassword.do")
    @ResponseBody
    public R updatepassword(HttpSession session,SysUseraccount sysUseraccount) {
        System.out.println("--=======--------"+sysUseraccount);
        String pass = sysUseraccount.getUserName();//原始密码
        SysUseraccount nowuser = (SysUseraccount)session.getAttribute("nowuser");
        if(nowuser!=null){
            String pass1 = nowuser.getUserPassword();
            Md5Hash md5Hash=new Md5Hash(pass,nowuser.getUserSalt(),3);
            pass=md5Hash.toString();
            if(!pass.equals(pass1)){
                return new R(100,"原密码不正确！");
            }else{
                Md5Hash md5Hash1=new Md5Hash(sysUseraccount.getUserPassword(),nowuser.getUserSalt(),3);
                nowuser.setUserPassword(md5Hash1.toString());
                this.sysAccountService.update(nowuser);
                return new R(200,"密码修改成功！");
            }
        }
        return new R(300,"密码修改失败！");
    }

}
