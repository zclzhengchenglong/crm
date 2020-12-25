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
public class SaleClientcontServiceImpl implements SaleClientcontService {
    @Autowired
    SaleClientcontMapper saleClientcontMapper;

    @Override
    public PageInfo<SaleClientcont> selectpage(BigDecimal clientnum, int pageNum, int pageSize, SaleClientcont saleClientcont,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SaleClientcontExample example=new SaleClientcontExample();
        SaleClientcontExample.Criteria criteria=example.createCriteria();
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
            SaleClientcontExample.Criteria criteria1=example.createCriteria();
            criteria1.andContnameLike("%"+search+"%");
            example.or(criteria1);
        }
        if(search!=null&&!search.equals("")){
            SaleClientcontExample.Criteria criteria2=example.createCriteria();
            criteria2.andAdressLike("%"+search+"%");
            example.or(criteria2);
        }
        else {
            criteria.andClientnumEqualTo(clientnum);
        }


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
