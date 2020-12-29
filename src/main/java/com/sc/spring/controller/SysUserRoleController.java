package com.sc.spring.controller;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.service.SaleClientlossService;
import com.sc.spring.service.SysUserRoleService;
import com.sun.deploy.panel.ITreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.SortedSet;

/**
 * 类名：SaleClientlossController
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:07
 * 版本：V1.0
 */
@Controller         /*控制器注解*/
@RequestMapping("/systemuserrole")   /*控制器类的请求映射url*/
public class SysUserRoleController {

    @Autowired
    SysUserRoleService sysUserRoleService;

    @RequestMapping("/select.do")
    @ResponseBody
    public Result select(@RequestParam(defaultValue = "1") int iDisplayStart,
                         @RequestParam(defaultValue = "10") int iDisplayLength){
        PageInfo<SysUserRole> pageInfo = sysUserRoleService.selectpage(iDisplayStart, iDisplayLength, null);

        Result r=new Result();
        r.setAaData(pageInfo.getList());
        r.setRecordsTotal(14);
        r.setRecordsFiltered(14);


        return r;
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SysUserRole sysUserRole, HttpSession session) {
        System.out.println("----"+sysUserRole);
        if(sysUserRole!=null&&sysUserRole.getId()!=null){
            this.sysUserRoleService.update(sysUserRole);
            SysUseraccount nowuser=(SysUseraccount)session.getAttribute("nowuser");
            sysUserRole.setOperatorId(nowuser.getUserId());//当前操作员编号，添加修改页面不再显示此输入框
            return new R(200,"修改成功！");
        }else {
            String roleIds = sysUserRole.getRoleIds();//1,2,3,
            if(roleIds!=null&&!roleIds.equals("")){
                String[] s = roleIds.split(",");
                if(s!=null&&s.length>0){
                    //添加之前先删除之前所有权限
                    this.sysUserRoleService.delByRoleId(sysUserRole.getUserId());

                    for (int i = 0; i <s.length ; i++) {
                        sysUserRole.setRoleId(Long.valueOf(s[i]));
                        SysUseraccount nowuser=(SysUseraccount)session.getAttribute("nowuser");
                        sysUserRole.setOperatorId(nowuser.getUserId());//当前操作员编号，添加修改页面不再显示此输入框
                        //sysUserRole.setCompanyId(nowuser.getCompanyId());//当前操作员的公司编号，添加修改页面不再显示此输入框
                        this.sysUserRoleService.add(sysUserRole);
                    }
                }
            }
            return new R(200, "添加成功！");
        }
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public R del(Long id) {
        System.out.println("--=======--"+id);
        this.sysUserRoleService.del(id);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public SysUserRole get(Long id) {
        System.out.println("--=======--"+id);
        return this.sysUserRoleService.get(id);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                Long id=new Long(s[i]);
                this.sysUserRoleService.del(id);
            }
        }

        return new R(200,"删除成功！");
    }
}
