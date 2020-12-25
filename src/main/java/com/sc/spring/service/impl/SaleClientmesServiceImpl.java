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
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public PageInfo<SaleClientmes> selectpage(int pageNum, int pageSize, SaleClientmes saleClientmes,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SaleClientmesExample example=new SaleClientmesExample();

        SaleClientmesExample.Criteria criteria= example.createCriteria();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        if(datemin!=null&&!datemin.equals("")){
            try {
                criteria.andLasttimeGreaterThanOrEqualTo(sdf.parse(datemin));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(datemax!=null&&!datemax.equals("")){
            try {
                criteria.andLasttimeLessThanOrEqualTo(sdf.parse(datemax));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(search!=null&&!search.equals("")){
            SaleClientmesExample.Criteria criteria1= example.createCriteria();
            criteria1.andClientnameLike("%"+search+"%");
            example.or(criteria1);
        }
        if(search!=null&&!search.equals("")){
            SaleClientmesExample.Criteria criteria2= example.createCriteria();
            criteria2.andOwnerLike("%"+search+"%");
            example.or(criteria2);
        }

        if(search!=null&&!search.equals("")){
            SaleClientmesExample.Criteria criteria3= example.createCriteria();
            criteria3.andBankLike("%"+search+"%");
            example.or(criteria3);
        }
        if(search!=null&&!search.equals("")){
            SaleClientmesExample.Criteria criteria4= example.createCriteria();
            criteria4.andPaywayLike("%"+search+"%");
            example.or(criteria4);
        }

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
