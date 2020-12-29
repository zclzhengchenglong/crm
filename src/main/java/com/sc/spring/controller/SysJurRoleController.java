package com.sc.spring.controller;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.service.SysJurRoleService;
import com.sc.spring.service.SysRoleService;
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
@RequestMapping("/systemjurrole")   /*控制器类的请求映射url*/
public class SysJurRoleController {

    @Autowired
    SysJurRoleService sysJurRoleService;

    @RequestMapping("/select.do")
    @ResponseBody
    public Result select(@RequestParam(defaultValue = "1") int iDisplayStart,
                         @RequestParam(defaultValue = "10") int iDisplayLength){
        PageInfo<SysJurRole> pageInfo = sysJurRoleService.selectpage(iDisplayStart, iDisplayLength, null);

        Result r=new Result();
        r.setAaData(pageInfo.getList());
        r.setRecordsTotal(14);
        r.setRecordsFiltered(14);


        return r;
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public R add(SysJurRole sysJurRole, HttpSession session) {
        System.out.println("----"+sysJurRole);
        if(sysJurRole!=null&&sysJurRole.getId()!=null){
            this.sysJurRoleService.update(sysJurRole);
            SysUseraccount nowuser=(SysUseraccount)session.getAttribute("nowuser");
            sysJurRole.setOperatorId(nowuser.getUserId());//当前操作员编号，添加修改页面不再显示此输入框
            //sysUserRole.setCompanyId(nowuser.getCompanyId());//当前操作员的公司编号，添加修改页面不再显示此输入框
            return new R(200,"修改成功！");
        }else {
            String roleIds = sysJurRole.getRoleIds();//1,2,3,
            if(roleIds!=null&&!roleIds.equals("")){
                String[] s = roleIds.split(",");
                if(s!=null&&s.length>0){
                    //添加之前先删除之前所有权限
                    this.sysJurRoleService.delByRoleId(sysJurRole.getPowerId());

                    for (int i = 0; i <s.length ; i++) {
                        sysJurRole.setRoleId(Long.valueOf(s[i]));
                        SysUseraccount nowuser=(SysUseraccount)session.getAttribute("nowuser");
                        sysJurRole.setOperatorId(nowuser.getUserId());//当前操作员编号，添加修改页面不再显示此输入框
                        //sysUserRole.setCompanyId(nowuser.getCompanyId());//当前操作员的公司编号，添加修改页面不再显示此输入框
                        this.sysJurRoleService.add(sysJurRole);
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
        this.sysJurRoleService.del(id);
        return new R(200,"删除成功！");
    }

    @RequestMapping("/get.do")
    @ResponseBody
    public SysJurRole get(Long id) {
        System.out.println("--=======--"+id);
        return this.sysJurRoleService.get(id);
    }

    @RequestMapping("/delAll.do")
    @ResponseBody
    public R delAll(String ids) {
        if(ids!=null&&ids.length()>0){
            String[] s = ids.split(",");
            for (int i = 0; i <s.length ; i++) {
                System.out.println("--=======--"+s[i]);
                Long id=new Long(s[i]);
                this.sysJurRoleService.del(id);
            }
        }

        return new R(200,"删除成功！");
    }


}
