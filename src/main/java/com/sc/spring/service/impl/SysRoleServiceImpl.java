package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysRole;
import com.sc.spring.entity.SysRoleExample;
import com.sc.spring.entity.SysUserRole;
import com.sc.spring.entity.SysUserRoleExample;
import com.sc.spring.mapper.SysRoleMapper;
import com.sc.spring.mapper.SysUserRoleMapper;
import com.sc.spring.service.SysRoleService;
import com.sc.spring.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 类名：SysUseraccountServiceImpl
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/8 16:38
 * 版本：V1.0
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    SysRoleMapper sysRoleMapper;



    @Override
    public PageInfo<SysRole> selectpage(int pageNum, int pageSize, SysRole sysRole,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SysRoleExample example=new SysRoleExample();
        SysRoleExample.Criteria criteria = example.createCriteria();
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
                criteria.andLastchangeTimeLessThanOrEqualTo(sdf.parse(datemax));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(search!=null&&!search.equals("")){
            criteria.andRoleNameLike("%"+search+"%");
        }


        example.setOrderByClause("ROLE_ID DESC");
        List<SysRole> list=sysRoleMapper.selectByExample(example);
        PageInfo<SysRole>   pageInfo=new PageInfo<SysRole>(list);
        return pageInfo;
    }

    @Override
    public void add(SysRole sysRole) {
        this.sysRoleMapper.insert(sysRole);
    }

    @Override
    public void del(Long roleId) {
        this.sysRoleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public void update(SysRole sysRole) {
        this.sysRoleMapper.updateByPrimaryKey(sysRole);
    }

    @Override
    public SysRole get(Long roleId) {
      return this.sysRoleMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public List<SysRole> selectRoles() {
        return this.sysRoleMapper.selectByExample(null);
    }


}
