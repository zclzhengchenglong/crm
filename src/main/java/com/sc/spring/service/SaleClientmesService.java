package com.sc.spring.service;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleClientmes;
import java.math.BigDecimal;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SaleClientmesService {
    public PageInfo<SaleClientmes> selectpage(int pageNum, int pageSize, SaleClientmes saleClientmes);

    public void add(SaleClientmes saleClientmes);

    public void del(BigDecimal clientnum);

    public void update(SaleClientmes saleClientmes);

    public SaleClientmes get(BigDecimal clientnum);
}
