package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysRole;
import com.sc.spring.entity.SysUseraccount;

/**
 * 类名：UserinfoService
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/10/19 16:06
 * 版本：V1.0
 */
public interface SysAccountService {


    //分页方法
    public PageInfo<SysUseraccount> selectpage(int pageNum, int pageSize, SysUseraccount SysUseraccount,String datemin,String datemax,String search);

    public void add(SysUseraccount sysUseraccount);

    public void del(Long userId);

    public void update(SysUseraccount sysUseraccount);

    public SysUseraccount get(Long userId);
}
