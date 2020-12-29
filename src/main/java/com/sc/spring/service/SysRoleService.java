package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysRole;
import com.sc.spring.entity.SysUserRole;

import java.util.List;

/**
 * 类名：UserinfoService
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/10/19 16:06
 * 版本：V1.0
 */
public interface SysRoleService {


    //分页方法
    public PageInfo<SysRole> selectpage(int pageNum, int pageSize, SysRole SysRole,String datemin,String datemax,String search);

    public void add(SysRole sysRole);

    public void del(Long roleId);

    public void update(SysRole sysRole);

    public SysRole get(Long roleId);

    public List<SysRole> selectRoles();
}
