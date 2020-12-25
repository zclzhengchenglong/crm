package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleList;
import com.sc.spring.entity.SaleListExample;
import com.sc.spring.mapper.SaleListMapper;
import com.sc.spring.service.SaleListService;
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
public class SaleListServiceImpl implements SaleListService {
    @Autowired
    SaleListMapper saleListMapper;

    @Override
    public PageInfo<SaleList> selectpage(int pageNum, int pageSize, SaleList SaleList,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SaleListExample example=new SaleListExample();


        SaleListExample.Criteria criteria = example.createCriteria();
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
