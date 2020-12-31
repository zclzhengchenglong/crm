package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.OfficeTaskdet;

import java.util.List;

/**
 * 类名：OfficeTaskdetservice
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:09
 * 版本：V1.0
 */
public interface OfficeTaskdetservice {

  public PageInfo<OfficeTaskdet> selectpage(int pageNum, int pageSize, OfficeTaskdet officeTaskdet, String datemin, String datemax, String search);//搜索

  public PageInfo<OfficeTaskdet> selectpagemy(int pageNum, int pageSize, OfficeTaskdet officeTaskdet, String datemin, String datemax, String search);//搜索

  public PageInfo<OfficeTaskdet> selectpagedet(int pageNum, int pageSize, OfficeTaskdet officeTaskdet, String datemin, String datemax, String search);//搜索


  void add(OfficeTaskdet officeTaskdet);//t添加

    void del( Long officeId);//删除

    void update(OfficeTaskdet officeTaskdet);//修改


    OfficeTaskdet get(Long officeId);
    public List<OfficeTaskdet> selectRoles();
}
