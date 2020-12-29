package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysJurRole;
import com.sc.spring.entity.SysRole;

/**
 * 类名：UserinfoService
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/10/19 16:06
 * 版本：V1.0
 */
public interface SysJurRoleService {


    //分页方法
    public PageInfo<SysJurRole> selectpage(int pageNum, int pageSize, SysJurRole SysJurRole);

    public void add(SysJurRole sysJurRole);

    public void del(Long id);

    public void delByRoleId(Long userId);

    public void update(SysJurRole sysJurRole);

    public SysJurRole get(Long id);
}
