package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleClientcont;
import com.sc.spring.entity.SaleClientcontExample;
import com.sc.spring.entity.SaleClientlossExample;
import com.sc.spring.mapper.SaleClientcontMapper;
import com.sc.spring.service.SaleClientcontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:04
 * 版本：V1.0
 */
@Service
public class SaleClientcontServiceImpl implements SaleClientcontService {
    @Autowired
    SaleClientcontMapper saleClientcontMapper;

    @Override
    public PageInfo<SaleClientcont> selectpage(int pageNum, int pageSize, SaleClientcont saleClientcont) {
        PageHelper.startPage(pageNum,pageSize);
        SaleClientcontExample example=new SaleClientcontExample();
        example.setOrderByClause("CONTNUM DESC");
        List<SaleClientcont> list=saleClientcontMapper.selectByExample(example);
        PageInfo<SaleClientcont>   pageInfo=new PageInfo<SaleClientcont>(list);
        return pageInfo;
    }

    @Override
    public void add(SaleClientcont saleClientcont) {
        this.saleClientcontMapper.insert(saleClientcont);
    }

    @Override
    public void del(BigDecimal contnum) {
        this.saleClientcontMapper.deleteByPrimaryKey(contnum);
    }

    @Override
    public void update(SaleClientcont saleClientcont) {
        this.saleClientcontMapper.updateByPrimaryKey(saleClientcont);
    }

    @Override
    public SaleClientcont get(BigDecimal contnum) {
        return this.saleClientcontMapper.selectByPrimaryKey(contnum);
    }
}
