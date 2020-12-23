package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleDetails;
import com.sc.spring.entity.SaleDetailsExample;
import com.sc.spring.entity.SaleList;
import com.sc.spring.mapper.SaleDetailsMapper;
import com.sc.spring.service.SaleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“何昱珩
 * 日期：2020/12/11 19:04
 * 版本：V1.0
 */
@Service
public class SaleDetailsServiceImpl implements SaleDetailsService {
    @Autowired
    SaleDetailsMapper saleDetailsMapper;


    @Override
    public PageInfo<SaleDetails> selectpage(int pageNum, int pageSize, SaleDetails SaleDetails) {
        PageHelper.startPage(pageNum,pageSize);
        SaleDetailsExample example=new SaleDetailsExample();
        example.setOrderByClause("SALE_DID DESC");
        List<SaleDetails> list=saleDetailsMapper.selectByExample(example);
        PageInfo<SaleDetails>   pageInfo=new PageInfo<SaleDetails>(list);
        return pageInfo;
    }

    @Override
    public void add(SaleDetails SaleDetails) {

        this.saleDetailsMapper.insert(SaleDetails);
    }

    @Override
    public void del(String saleDid) {

        this.saleDetailsMapper.deleteByPrimaryKey(saleDid);
    }

    @Override
    public void update(SaleDetails SaleDetails) {

        this.saleDetailsMapper.updateByPrimaryKey(SaleDetails);
    }


    @Override
    public SaleDetails get(String saleDid) {
        return this.saleDetailsMapper.selectByPrimaryKey(saleDid);
    }


}
