package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.sc.spring.entity.SysUseraccount;
import com.sc.spring.entity.SysUseraccountExample;
import com.sc.spring.mapper.SysUseraccountMapper;
import com.sc.spring.service.SysUseraccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类名：SysUseraccountServiceImpl
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/8 16:38
 * 版本：V1.0
 */
@Service
public class SysUseraccountServiceImpl implements SysUseraccountService {
    @Autowired
    SysUseraccountMapper sysUseraccountMapper;

    @Override
    public SysUseraccount login(String userName) {
        SysUseraccountExample example=new SysUseraccountExample();
        SysUseraccountExample.Criteria criteria = example.createCriteria();

        if(userName!=null){
            criteria.andUserNameEqualTo(userName);
            List<SysUseraccount> list = sysUseraccountMapper.selectByExample(example);
            if(list!=null&&list.size()>0){
                return list.get(0);
            }

        }

        return null;
    }

    @Override
    public PageInfo<SysUseraccount> selectpage(int pageNum, int pageSize, SysUseraccount sysUseraccount) {
        PageHelper.startPage(pageNum,pageSize);
        List<SysUseraccount> list=sysUseraccountMapper.selectByExample(null);
        PageInfo<SysUseraccount>   pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
}