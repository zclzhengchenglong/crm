package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.mapper.SysUsermesMapper;
import com.sc.spring.mapper.SysUsermesMapper;
import com.sc.spring.service.SaleClientlossService;
import com.sc.spring.service.SysUsermesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
public class SysUsermesServiceImpl implements SysUsermesService {
    @Autowired
    SysUsermesMapper sysUsermesMapper;

    @Override
    public PageInfo<SysUsermes> selectpage(int pageNum, int pageSize, SysUsermes sysUsermes,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SysUsermesExample example=new SysUsermesExample();
        SysUsermesExample.Criteria criteria= example.createCriteria();
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
            SysUsermesExample.Criteria criteria1= example.createCriteria();
            criteria1.andWorkerNameLike("%"+search+"%");
            example.or(criteria1);
        }
        if(search!=null&&!search.equals("")){
            SysUsermesExample.Criteria criteria2= example.createCriteria();
            criteria2.andWorkerSexLike("%"+search+"%");
            example.or(criteria2);
        }

        if(search!=null&&!search.equals("")){
            SysUsermesExample.Criteria criteria3= example.createCriteria();
            criteria3.andHomeAddressLike("%"+search+"%");
            example.or(criteria3);
        }
        if(search!=null&&!search.equals("")){
            SysUsermesExample.Criteria criteria4= example.createCriteria();
            criteria4.andRemarksLike("%"+search+"%");
            example.or(criteria4);
        }

        example.setOrderByClause("WORKER_ID DESC");
        List<SysUsermes> list=sysUsermesMapper.selectByExample(example);
        PageInfo<SysUsermes>   pageInfo=new PageInfo<SysUsermes>(list);
        return pageInfo;
    }

    @Override
    public void add(SysUsermes sysUsermes) {
        this.sysUsermesMapper.insert(sysUsermes);
    }

    @Override
    public void del(Long workerId) {
        this.sysUsermesMapper.deleteByPrimaryKey(workerId);
    }


    @Override
    public void update(SysUsermes sysUsermes) {
        this.sysUsermesMapper.updateByPrimaryKey(sysUsermes);
    }

    @Override
    public SysUsermes get(Long workerId) {
        return this.sysUsermesMapper.selectByPrimaryKey(workerId);
    }

//    @Override
//    public List<SysUsermes> selectRoles() {
//        return this.sysUsermesMapper.selectByExample(null);
//@Bean
//public HandlerInterceptor getMyInterceptor(){
//    return new LoginInterceptor();
//}
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(getMyInterceptor());
//
//    }
//    }

}
