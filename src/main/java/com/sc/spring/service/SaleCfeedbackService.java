package com.sc.spring.service;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleCfeedback;
import java.math.BigDecimal;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SaleCfeedbackService {
    public PageInfo<SaleCfeedback> selectpage(BigDecimal clientnum, int pageNum, int pageSize, SaleCfeedback saleCfeedback,String datemin,String datemax,String search);

    public void add(SaleCfeedback saleCfeedback);

    public void del(BigDecimal backnum);

    public void update(SaleCfeedback saleCfeedback);

    public SaleCfeedback get(BigDecimal backnum);
}