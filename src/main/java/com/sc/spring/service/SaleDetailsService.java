package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleDetails;

import java.util.List;


/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“何昱珩
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SaleDetailsService {
    public PageInfo<SaleDetails> selectpage(String saleDid,int pageNum, int pageSize, SaleDetails SaleDetails,String datemin,String datemax,String search);

    public List<SaleDetails> select(String saleDid);

    public void add(SaleDetails SaleDetails);

    public void del(String saleDid);

    public void update(SaleDetails SaleDetails);

    public SaleDetails get(String saleDid);
}
