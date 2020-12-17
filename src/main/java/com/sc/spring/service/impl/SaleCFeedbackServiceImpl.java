package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleCfeedback;

import com.sc.spring.entity.SaleCfeedbackExample;
import com.sc.spring.mapper.SaleCfeedbackMapper;

import com.sc.spring.service.SaleCfeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 类名：SaleCFeedbackServiceImpl
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/15 18:01
 * 版本：V1.0
 */
@Service
public class SaleCFeedbackServiceImpl implements SaleCfeedbackService {
    @Autowired
    SaleCfeedbackMapper saleCfeedbackMapper;


    @Override
    public PageInfo<SaleCfeedback> selectpage(int pageNum, int pageSize, SaleCfeedback saleCfeedback) {
        PageHelper.startPage(pageNum,pageSize);
        SaleCfeedbackExample example=new SaleCfeedbackExample();
        example.setOrderByClause("BACKNUM DESC");
        List<SaleCfeedback> list=saleCfeedbackMapper.selectByExample(example);
        PageInfo<SaleCfeedback>   pageInfo=new PageInfo<SaleCfeedback>(list);
        return pageInfo;
    }

    @Override
    public void add(SaleCfeedback saleCfeedback) {
        this.saleCfeedbackMapper.insert(saleCfeedback);
    }

    @Override
    public void del(BigDecimal backnum) {
        this.saleCfeedbackMapper.deleteByPrimaryKey(backnum);
    }

    @Override
    public void update(SaleCfeedback saleCfeedback) {
        this.saleCfeedbackMapper.updateByPrimaryKey(saleCfeedback);
    }

    @Override
    public SaleCfeedback get(BigDecimal backnum) {
        return this.saleCfeedbackMapper.selectByPrimaryKey(backnum);
    }
}
