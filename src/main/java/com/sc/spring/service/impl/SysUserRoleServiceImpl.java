package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysUserRole;
import com.sc.spring.entity.SysUserRoleExample;
import com.sc.spring.entity.SysUseraccount;
import com.sc.spring.entity.SysUseraccountExample;
import com.sc.spring.mapper.SysUserRoleMapper;
import com.sc.spring.mapper.SysUseraccountMapper;
import com.sc.spring.service.SysUserRoleService;
import com.sc.spring.service.SysUseraccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.math.BigDecimal;
import java.util.List;

/**
 * 类名：SysUseraccountServiceImpl
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/8 16:38
 * 版本：V1.0
 */
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Autowired
    SysUserRoleMapper sysUserRoleMapper;



    @Override
    public PageInfo<SysUserRole> selectpage(int pageNum, int pageSize, SysUserRole sysUserRole) {
        PageHelper.startPage(pageNum,pageSize);
        SysUserRoleExample example=new SysUserRoleExample();
        example.setOrderByClause("ID DESC");
        List<SysUserRole> list=sysUserRoleMapper.selectByExample(example);
        PageInfo<SysUserRole>   pageInfo=new PageInfo<SysUserRole>(list);
        return pageInfo;
    }

    @Override
    public void add(SysUserRole sysUserRole) {
        this.sysUserRoleMapper.insert(sysUserRole);
    }

    @Override
    public void del(Long id) {
        this.sysUserRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delByRoleId(Long userId) {
        SysUserRoleExample example=new SysUserRoleExample();
        SysUserRoleExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        this.sysUserRoleMapper.deleteByExample(example);

    }

    @Override
    public void update(SysUserRole sysUserRole) {
        this.sysUserRoleMapper.updateByPrimaryKey(sysUserRole);
    }

    @Override
    public SysUserRole get(Long id) {
      return this.sysUserRoleMapper.selectByPrimaryKey(id);
    }


}
