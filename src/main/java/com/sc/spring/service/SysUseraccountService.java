package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysUseraccount;
import org.springframework.stereotype.Repository;

/**
 * 类名：UserinfoService
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/10/19 16:06
 * 版本：V1.0
 */


public interface SysUseraccountService {

    public SysUseraccount login(String userName);

    //分页方法
    public PageInfo<SysUseraccount> selectpage(int pageNum, int pageSize, SysUseraccount sysUseraccount);
}