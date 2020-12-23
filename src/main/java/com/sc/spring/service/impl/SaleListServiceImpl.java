package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleList;
import com.sc.spring.entity.SaleListExample;
import com.sc.spring.mapper.SaleListMapper;
import com.sc.spring.service.SaleListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“何昱珩
 * 日期：2020/12/11 19:04
 * 版本：V1.0
 */
@Service
public class SaleListServiceImpl implements SaleListService {
    @Autowired
    SaleListMapper saleListMapper;

    @Override
    public PageInfo<SaleList> selectpage(int pageNum, int pageSize, SaleList SaleList) {
        PageHelper.startPage(pageNum,pageSize);
        SaleListExample example=new SaleListExample();
        example.setOrderByClause("SALE_ID DESC");
        List<SaleList> list=saleListMapper.selectByExample(example);
        PageInfo<SaleList>   pageInfo=new PageInfo<SaleList>(list);
        return pageInfo;
    }

    @Override
    public void add(SaleList SaleList) {

        this.saleListMapper.insert(SaleList);
    }

    @Override
    public void del(String saleId) {

        this.saleListMapper.deleteByPrimaryKey(saleId);
    }

    @Override
    public void update(SaleList SaleList) {

        this.saleListMapper.updateByPrimaryKey(SaleList);
    }

    @Override
    public SaleList get(String saleId) {
        return this.saleListMapper.selectByPrimaryKey(saleId);
    }


}
