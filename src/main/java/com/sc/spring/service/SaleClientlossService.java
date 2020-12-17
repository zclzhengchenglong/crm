package com.sc.spring.service;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleClientloss;
import java.math.BigDecimal;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SaleClientlossService {
    public PageInfo<SaleClientloss> selectpage(int pageNum, int pageSize, SaleClientloss saleClientloss);

    public void add(SaleClientloss saleClientloss);

    public void del(BigDecimal lossnum);

    public void update(SaleClientloss saleClientloss);

    public SaleClientloss get(BigDecimal lossnum);
}
