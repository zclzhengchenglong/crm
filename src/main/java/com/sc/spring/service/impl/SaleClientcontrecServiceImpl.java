package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleClientcontrec;
import com.sc.spring.entity.SaleClientcontrecExample;
import com.sc.spring.entity.SaleClientlossExample;
import com.sc.spring.mapper.SaleClientcontrecMapper;
import com.sc.spring.service.SaleClientcontrecService;
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
public class SaleClientcontrecServiceImpl implements SaleClientcontrecService {
    @Autowired
    SaleClientcontrecMapper saleClientcontrecMapper;

    @Override
    public PageInfo<SaleClientcontrec> selectpage(BigDecimal clientnum, int pageNum, int pageSize, SaleClientcontrec saleClientcontrec,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SaleClientcontrecExample example=new SaleClientcontrecExample();

        SaleClientcontrecExample.Criteria criteria=example.createCriteria();
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
            SaleClientcontrecExample.Criteria criteria1=example.createCriteria();

            criteria1.andDetailsLike("%"+search+"%");
            example.or(criteria1);
        }else {
            criteria.andClientnumEqualTo(clientnum);
        }

        example.setOrderByClause("RECNUM DESC");
        List<SaleClientcontrec> list=saleClientcontrecMapper.selectByExample(example);
        PageInfo<SaleClientcontrec>   pageInfo=new PageInfo<SaleClientcontrec>(list);
        return pageInfo;
    }

    @Override
    public void add(SaleClientcontrec saleClientcontrec) {
        this.saleClientcontrecMapper.insert(saleClientcontrec);
    }

    @Override
    public void del(BigDecimal contnum) {
        this.saleClientcontrecMapper.deleteByPrimaryKey(contnum);
    }

    @Override
    public void update(SaleClientcontrec saleClientcontrec) {
        this.saleClientcontrecMapper.updateByPrimaryKey(saleClientcontrec);
    }

    @Override
    public SaleClientcontrec get(BigDecimal contnum) {
        return this.saleClientcontrecMapper.selectByPrimaryKey(contnum);
    }
}
