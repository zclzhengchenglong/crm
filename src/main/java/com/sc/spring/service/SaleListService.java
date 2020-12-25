package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleList;

import java.math.BigDecimal;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“何昱珩
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SaleListService {
    public PageInfo<SaleList> selectpage(int pageNum, int pageSize, SaleList SaleList,String datemin,String datemax,String search);

    public void add(SaleList SaleList);

    public void del(String saleId);

    public void update(SaleList SaleList);

    public SaleList get(String saleId);
}
