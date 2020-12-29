package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysJur;
import com.sc.spring.entity.SysJurRole;

/**
 * 类名：UserinfoService
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/10/19 16:06
 * 版本：V1.0
 */
public interface SysJurService {


    //分页方法
    public PageInfo<SysJur> selectpage(int pageNum, int pageSize, SysJur SysJur,String datemin,String datemax,String search);


    public void add(SysJur sysJur);

    public void del(Long columnId);

    public void update(SysJur sysJur);

    public SysJur get(Long columnId);
}
