package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.OfficeTaskdet;
import com.sc.spring.entity.OfficeTasktest;
import com.sc.spring.entity.SysUseraccount;

import java.util.List;

/**
 * 类名：OfficeTaskdetservice
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:09
 * 版本：V1.0
 */
public interface OfficeTasktestservice {
    public PageInfo<OfficeTasktest> selectpage(int pageNum, int pageSize, OfficeTaskdet officeTaskdet, String datemin, String datemax, String search);//搜索


    void add(OfficeTasktest officeTasktest);//t添加

    void del(String taskId);//删除

    void update(OfficeTasktest officeTasktest);//修改

    public List<OfficeTasktest> selectRoles();

    OfficeTasktest get(String taskId);

    public List<SysUseraccount> selectUsers(); //显示下拉框的发送人
}
