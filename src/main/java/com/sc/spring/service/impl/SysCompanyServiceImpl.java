package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.mapper.SaleClientlossMapper;
import com.sc.spring.mapper.SysCompanyMapper;
import com.sc.spring.service.SaleClientlossService;
import com.sc.spring.service.SysCompanyService;
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
public class SysCompanyServiceImpl implements SysCompanyService {
    @Autowired
    SysCompanyMapper sysCompanyMapper;

    @Override
    public PageInfo<SysCompany> selectpage(int pageNum, int pageSize, SysCompany sysCompany,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SysCompanyExample example=new SysCompanyExample();
        SysCompanyExample.Criteria criteria= example.createCriteria();
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
                criteria.andLasttimeGreaterThanOrEqualTo(sdf.parse(datemax));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(search!=null&&!search.equals("")){
            SysCompanyExample.Criteria criteria1= example.createCriteria();
            criteria1.andSysCompanyNameLike("%"+search+"%");
            example.or(criteria1);
        }
        if(search!=null&&!search.equals("")){
            SysCompanyExample.Criteria criteria2= example.createCriteria();
            criteria2.andSysCompanyHongLike("%"+search+"%");
            example.or(criteria2);
        }

        if(search!=null&&!search.equals("")){
            SysCompanyExample.Criteria criteria3= example.createCriteria();
            criteria3.andSysCompanyYphoneLike("%"+search+"%");
            example.or(criteria3);
        }
        if(search!=null&&!search.equals("")){
            SysCompanyExample.Criteria criteria4= example.createCriteria();
            criteria4.andSysCompanyPhoneLike("%"+search+"%");
            example.or(criteria4);
        }

        example.setOrderByClause("SYS_COMPANY_ID DESC");
        List<SysCompany> list=sysCompanyMapper.selectByExample(example);
        PageInfo<SysCompany>   pageInfo=new PageInfo<SysCompany>(list);
        return pageInfo;
    }

    @Override
    public void add(SysCompany sysCompany) {
        this.sysCompanyMapper.insert(sysCompany);
    }

    @Override
    public void del(BigDecimal sysCompanyId) {
        this.sysCompanyMapper.deleteByPrimaryKey(sysCompanyId);
    }

    @Override
    public void update(SysCompany sysCompany) {
        this.sysCompanyMapper.updateByPrimaryKey(sysCompany);
    }

    @Override
    public SysCompany get(BigDecimal sysCompanyId) {
        return this.sysCompanyMapper.selectByPrimaryKey(sysCompanyId);
    }
    @Override
    public List<SysCompany> selectRoles() {
        return this.sysCompanyMapper.selectByExample(null);
    }

}

