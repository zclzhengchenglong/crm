package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleClientcont;

import java.math.BigDecimal;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SaleClientcontService {
    public PageInfo<SaleClientcont> selectpage(BigDecimal clientnum, int pageNum, int pageSize, SaleClientcont saleClientcont,String datemin,String datemax,String search) ;

    public void add(SaleClientcont saleClientcont);

    public void del(BigDecimal contnum);

    public void update(SaleClientcont saleClientloss);

    public SaleClientcont get(BigDecimal contnum);
}
