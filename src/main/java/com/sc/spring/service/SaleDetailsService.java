package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleDetails;


/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“何昱珩
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SaleDetailsService {
    public PageInfo<SaleDetails> selectpage(int pageNum, int pageSize, SaleDetails SaleDetails);

    public void add(SaleDetails SaleDetails);

    public void del(String saleDid);

    public void update(SaleDetails SaleDetails);

    public SaleDetails get(String saleDid);
}
