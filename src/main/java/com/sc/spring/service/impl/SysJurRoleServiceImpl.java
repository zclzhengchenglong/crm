package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysJurRole;
import com.sc.spring.entity.SysJurRoleExample;
import com.sc.spring.entity.SysRole;
import com.sc.spring.entity.SysRoleExample;
import com.sc.spring.mapper.SysJurRoleMapper;
import com.sc.spring.mapper.SysRoleMapper;
import com.sc.spring.service.SysJurRoleService;
import com.sc.spring.service.SysRoleService;
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
public class SysJurRoleServiceImpl implements SysJurRoleService {
    @Autowired
    SysJurRoleMapper sysJurRoleMapper;



    @Override
    public PageInfo<SysJurRole> selectpage(int pageNum, int pageSize, SysJurRole sysJurRole) {
        PageHelper.startPage(pageNum,pageSize);
        SysJurRoleExample example=new SysJurRoleExample();
        example.setOrderByClause("ROLE_ID DESC");
        List<SysJurRole> list=sysJurRoleMapper.selectByExample(example);
        PageInfo<SysJurRole>   pageInfo=new PageInfo<SysJurRole>(list);
        return pageInfo;
    }

    @Override
    public void add(SysJurRole sysJurRole) {
        this.sysJurRoleMapper.insert(sysJurRole);
    }

    @Override
    public void del(Long id) {
        this.sysJurRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delByRoleId(Long powerId) {
        SysJurRoleExample example=new SysJurRoleExample();
        SysJurRoleExample.Criteria criteria = example.createCriteria();
        criteria.andPowerIdEqualTo(powerId);
        this.sysJurRoleMapper.deleteByExample(example);
    }

    @Override
    public void update(SysJurRole sysJurRole) {
        this.sysJurRoleMapper.updateByPrimaryKey(sysJurRole);
    }

    @Override
    public SysJurRole get(Long id) {
      return this.sysJurRoleMapper.selectByPrimaryKey(id);
    }


}
