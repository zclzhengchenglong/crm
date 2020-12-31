package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.OfficeTest;

import java.util.List;

/**
 * 类名：OfficeTaskdetservice
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:09
 * 版本：V1.0
 */
public interface OfficeTestservice {

    public PageInfo<OfficeTest> selectpage(int pageNum, int pageSize, OfficeTest OfficeTest, String datemin, String datemax, String search);//搜索

    PageInfo<OfficeTest> selectpage1(int pageNum, int pageSize, OfficeTest officeTest);//查询

    void add(OfficeTest officeTest);//添加

    void del(String indexId);//删除

    void update(OfficeTest officeTest);//修改

    OfficeTest get(String indexId);

    public List<OfficeTest> selectRoles();
}
