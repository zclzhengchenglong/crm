package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleClientcontrec;

import java.math.BigDecimal;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SaleClientcontrecService {
    public PageInfo<SaleClientcontrec> selectpage(BigDecimal clientnum, int pageNum, int pageSize, SaleClientcontrec saleClientcontrec,String datemin,String datemax,String search);

    public void add(SaleClientcontrec saleClientcontrec);

    public void del(BigDecimal recnum);

    public void update(SaleClientcontrec saleClientcontrec);

    public SaleClientcontrec get(BigDecimal recnum);
}
