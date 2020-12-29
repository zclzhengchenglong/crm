package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysJurmes;
import com.sc.spring.entity.SysRole;

import java.util.List;

/**
 * 类名：UserinfoService
 * 描述：一段话描述类的信息
 * 作者：陈龙
 * 日期：2020/10/19 16:06
 * 版本：V1.0
 */
public interface SysJurmesService {


    //分页方法
    public PageInfo<SysJurmes> selectpage(int pageNum, int pageSize, SysJurmes SysJurmes,String datemin,String datemax,String search);

    public void add(SysJurmes sysJurmes);

    public void del(Long powerId);

    public void update(SysJurmes sysJurmes);

    public SysJurmes get(Long powerId);

    public List<SysJurmes> selectByURL(String url);

}
