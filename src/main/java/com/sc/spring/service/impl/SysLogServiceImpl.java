package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.mapper.SysLogMapper;
import com.sc.spring.mapper.SysUsermesMapper;
import com.sc.spring.service.SysLogService;
import com.sc.spring.service.SysUsermesService;
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
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    SysLogMapper sysLogMapper;

    @Override
    public PageInfo<SysLog> selectpage(int pageNum, int pageSize, SysLog sysLog,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SysLogExample example=new SysLogExample();
        SysLogExample.Criteria criteria= example.createCriteria();
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
            SysLogExample.Criteria criteria1= example.createCriteria();
            criteria1.andLimitLike("%"+search+"%");
            example.or(criteria1);
        }
        if(search!=null&&!search.equals("")){
            SysLogExample.Criteria criteria2= example.createCriteria();
            criteria2.andFromipLike("%"+search+"%");
            example.or(criteria2);
        }

        if(search!=null&&!search.equals("")){
            SysLogExample.Criteria criteria3= example.createCriteria();
            criteria3.andLimitLike("%"+search+"%");
            example.or(criteria3);
        }
//        if(search!=null&&!search.equals("")){
//            SysLogExample.Criteria criteria4= example.createCriteria();
//            criteria4.andPaywayLike("%"+search+"%");
//            example.or(criteria4);
//        }

        example.setOrderByClause("LOG_NUM DESC");
        List<SysLog> list=sysLogMapper.selectByExample(example);
        PageInfo<SysLog>   pageInfo=new PageInfo<SysLog>(list);
        return pageInfo;
    }

    @Override
    public void add(SysLog sysLog) {
        this.sysLogMapper.insert(sysLog);
    }

    @Override
    public void del(BigDecimal logNum) {
        this.sysLogMapper.deleteByPrimaryKey(logNum);
    }

    @Override
    public void update(SysLog sysLog) {
        this.sysLogMapper.updateByPrimaryKey(sysLog);
    }

    @Override
    public SysLog get(BigDecimal logNum) {
        return this.sysLogMapper.selectByPrimaryKey(logNum);
    }


}
