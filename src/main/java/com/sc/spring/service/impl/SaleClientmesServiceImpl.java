package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleClientloss;
import com.sc.spring.entity.SaleClientlossExample;
import com.sc.spring.entity.SaleClientmes;
import com.sc.spring.entity.SaleClientmesExample;
import com.sc.spring.mapper.SaleClientlossMapper;
import com.sc.spring.mapper.SaleClientmesMapper;
import com.sc.spring.service.SaleClientlossService;
import com.sc.spring.service.SaleClientmesService;
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
public class SaleClientmesServiceImpl implements SaleClientmesService {
    @Autowired
    SaleClientmesMapper saleClientmesMapper;

    @Override
    public PageInfo<SaleClientmes> selectpage(int pageNum, int pageSize, SaleClientmes saleClientmes) {
        PageHelper.startPage(pageNum,pageSize);
        SaleClientmesExample example=new SaleClientmesExample();
        example.setOrderByClause("CLIENTNUM DESC");
        List<SaleClientmes> list=saleClientmesMapper.selectByExample(example);
        PageInfo<SaleClientmes>   pageInfo=new PageInfo<SaleClientmes>(list);
        return pageInfo;
    }

    @Override
    public void add(SaleClientmes saleClientmes) {
        this.saleClientmesMapper.insert(saleClientmes);
    }

    @Override
    public void del(BigDecimal clientnum) {
        this.saleClientmesMapper.deleteByPrimaryKey(clientnum);
    }

    @Override
    public void update(SaleClientmes saleClientmes) {
        this.saleClientmesMapper.updateByPrimaryKey(saleClientmes);
    }

    @Override
    public SaleClientmes get(BigDecimal clientnum) {
        return this.saleClientmesMapper.selectByPrimaryKey(clientnum);
    }
}
