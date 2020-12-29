package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysUserRole;
import com.sc.spring.entity.SysUseraccount;
import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

import java.math.BigDecimal;

/**
 * 类名：UserinfoService
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/10/19 16:06
 * 版本：V1.0
 */
public interface SysUserRoleService {


    //分页方法
    public PageInfo<SysUserRole> selectpage(int pageNum, int pageSize, SysUserRole SysUserRole);

    public void add(SysUserRole sysUserRole);

    public void del(Long id);

    public void delByRoleId(Long userId);

    public void update(SysUserRole sysUserRole);

    public SysUserRole get(Long id);
}
