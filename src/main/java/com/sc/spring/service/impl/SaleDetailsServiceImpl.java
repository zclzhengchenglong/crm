package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleDetails;
import com.sc.spring.entity.SaleDetailsExample;
import com.sc.spring.mapper.SaleDetailsMapper;
import com.sc.spring.service.SaleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public PageInfo<SaleDetails> selectpage(String saleDid,int pageNum, int pageSize, SaleDetails SaleDetails,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SaleDetailsExample example=new SaleDetailsExample();

        SaleDetailsExample.Criteria criteria = example.createCriteria();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("2222222222222222"+sdf);
        if(datemin!=null&&!datemin.equals("")){
            try {
                criteria.andSaleLastdateGreaterThanOrEqualTo(sdf.parse(datemin));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(datemax!=null&&!datemax.equals("")){
            try {
                criteria.andSaleLastdateLessThanOrEqualTo(sdf.parse(datemax));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(search!=null&&!search.equals("")){
            criteria.andSaleComidLike("%"+search+"%");
        }

        criteria.andSaleIdEqualTo(saleDid);


        example.setOrderByClause("SALE_DID DESC");
        List<SaleDetails> list=saleDetailsMapper.selectByExample(example);
        PageInfo<SaleDetails>   pageInfo=new PageInfo<SaleDetails>(list);
        return pageInfo;
    }

    @Override
    public List<SaleDetails> select(String saleDid) {
        SaleDetailsExample example=new SaleDetailsExample();

        SaleDetailsExample.Criteria criteria = example.createCriteria();
        if(saleDid!=null&&!saleDid.equals("")){
            criteria.andSaleIdEqualTo(saleDid);
        }
        List<SaleDetails> list=saleDetailsMapper.selectByExample(example);
        return list;
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
