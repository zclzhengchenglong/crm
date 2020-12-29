package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysBotanymes;
import com.sc.spring.entity.SysBotanymesExample;
import com.sc.spring.entity.SysUsermes;
import com.sc.spring.entity.SysUsermesExample;
import com.sc.spring.mapper.SysBotanymesMapper;
import com.sc.spring.mapper.SysCompanyMapper;
import com.sc.spring.mapper.SysUsermesMapper;
import com.sc.spring.service.SysBotanymesService;
import com.sc.spring.service.SysUsermesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class SysBotanymesServiceImpl implements SysBotanymesService {
    @Autowired
    SysBotanymesMapper sysBotanymesMapper;

    @Override
    public PageInfo<SysBotanymes> selectpage(int pageNum, int pageSize, SysBotanymes sysBotanymes,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SysBotanymesExample example=new SysBotanymesExample();
        SysBotanymesExample.Criteria criteria= example.createCriteria();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        if(datemin!=null&&!datemin.equals("")){
            try {
                criteria.andLastchangeTimeGreaterThanOrEqualTo(sdf.parse(datemin));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(datemax!=null&&!datemax.equals("")){
            try {
                criteria.andLastchangeTimeGreaterThanOrEqualTo(sdf.parse(datemax));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(search!=null&&!search.equals("")){
            SysBotanymesExample.Criteria criteria1= example.createCriteria();
            criteria1.andPostNameLike("%"+search+"%");
            example.or(criteria1);
        }
        if(search!=null&&!search.equals("")){
            SysBotanymesExample.Criteria criteria2= example.createCriteria();
            criteria2.andRemarksLike("%"+search+"%");
            example.or(criteria2);
        }

//        if(search!=null&&!search.equals("")){
//            SysBotanymesExample.Criteria criteria3= example.createCriteria();
//            criteria3.andHomeAddressLike("%"+search+"%");
//            example.or(criteria3);
//        }
        if(search!=null&&!search.equals("")){
            SysBotanymesExample.Criteria criteria4= example.createCriteria();
            criteria4.andRemarksLike("%"+search+"%");
            example.or(criteria4);
        }

        example.setOrderByClause("POST_ID DESC");
        List<SysBotanymes> list=sysBotanymesMapper.selectByExample(example);
        PageInfo<SysBotanymes>   pageInfo=new PageInfo<SysBotanymes>(list);
        return pageInfo;
    }

    @Override
    public void add(SysBotanymes sysBotanymes) {
        this.sysBotanymesMapper.insert(sysBotanymes);
    }

    @Override
    public void del(Long postId) {
        this.sysBotanymesMapper.deleteByPrimaryKey(postId);
    }

    @Override
    public void update(SysBotanymes sysBotanymes) {
        this.sysBotanymesMapper.updateByPrimaryKey(sysBotanymes);
    }

    @Override
    public SysBotanymes get(Long postId) {
        return this.sysBotanymesMapper.selectByPrimaryKey(postId);
    }

//    @Override
//    public void add(SysUsermes sysUsermes) {
//        this.sysUsermesMapper.insert(sysUsermes);
//    }
//
//    @Override
//    public void del(Long workerId) {
//        this.sysUsermesMapper.deleteByPrimaryKey(workerId);
//    }
//
//
//    @Override
//    public void update(SysUsermes sysUsermes) {
//        this.sysUsermesMapper.updateByPrimaryKey(sysUsermes);
//    }
//
//    @Override
//    public SysUsermes get(Long workerId) {
//        return this.sysUsermesMapper.selectByPrimaryKey(workerId);
//    }
//


}
