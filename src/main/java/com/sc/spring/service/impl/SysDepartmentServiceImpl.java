package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.mapper.SysDepartmentMapper;
import com.sc.spring.service.SysDepartmentService;
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
public class SysDepartmentServiceImpl implements SysDepartmentService {
    @Autowired
    SysDepartmentMapper sysDepartmentMapper;

    @Override
    public PageInfo<SysDepartment> selectpage(int pageNum, int pageSize, SysDepartment sysDepartment,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SysDepartmentExample example=new SysDepartmentExample();
        SysDepartmentExample.Criteria criteria= example.createCriteria();
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
            SysDepartmentExample.Criteria criteria1= example.createCriteria();
            criteria1.andDepartmentNameLike("%"+search+"%");
            example.or(criteria1);
        }
        if(search!=null&&!search.equals("")){
            SysDepartmentExample.Criteria criteria2= example.createCriteria();
            criteria2.andRemarksLike("%"+search+"%");
            example.or(criteria2);
        }

//        if(search!=null&&!search.equals("")){
////            SysDepartmentExample.Criteria criteria3= example.createCriteria();
////            criteria3.andBankLike("%"+search+"%");
////            example.or(criteria3);
////        }
////        if(search!=null&&!search.equals("")){
////            SysDepartmentExample.Criteria criteria4= example.createCriteria();
////            criteria4.andPaywayLike("%"+search+"%");
////            example.or(criteria4);
////        }

        example.setOrderByClause("DEPART_ID DESC");
        List<SysDepartment> list=sysDepartmentMapper.selectByExample(example);
        PageInfo<SysDepartment>   pageInfo=new PageInfo<SysDepartment>(list);
        return pageInfo;
    }
    @Override
    public void add(SysDepartment sysDepartment) {
        this.sysDepartmentMapper.insert(sysDepartment);
    }

    @Override
    public void del(Long departId) {
        this.sysDepartmentMapper.deleteByPrimaryKey(departId);
    }

    @Override
    public void update(SysDepartment sysDepartment) {
        this.sysDepartmentMapper.updateByPrimaryKey(sysDepartment);
    }

    @Override
    public SysDepartment get(Long departId) {
        return this.sysDepartmentMapper.selectByPrimaryKey(departId);
    }
//
//    @Override
//    public void add(SysDepartment sysDepartment) {
//        this.sysDepartmentMapper.insert(sysDepartment);
//    }
//
//    @Override
//    public void del(Long departId) {
//        this.sysDepartmentMapper.deleteByPrimaryKey(departId);
//    }
//
//
//    @Override
//    public void update(SysDepartment sysDepartment) {
//        this.sysDepartmentMapper.updateByPrimaryKey(sysDepartment);
//    }
//
//    @Override
//    public SysDepartment get(Long departId) {
//        return this.sysDepartmentMapper.selectByPrimaryKey(departId);
//    }


    @Override
    public List<SysDepartment> selectRoles() {
        return this.sysDepartmentMapper.selectByExample(null);
    }
}
