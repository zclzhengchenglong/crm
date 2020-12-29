package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysRole;
import com.sc.spring.entity.SysRoleExample;
import com.sc.spring.entity.SysUseraccount;
import com.sc.spring.entity.SysUseraccountExample;
import com.sc.spring.mapper.SysRoleMapper;
import com.sc.spring.mapper.SysUseraccountMapper;
import com.sc.spring.service.SysAccountService;
import com.sc.spring.service.SysRoleService;
import com.sc.spring.service.SysUseraccountService;
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
public class SysAccountServiceImpl implements SysAccountService {
    @Autowired
    SysUseraccountMapper sysUseraccountMapper;



    @Override
    public PageInfo<SysUseraccount> selectpage(int pageNum, int pageSize, SysUseraccount sysUseraccount,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SysUseraccountExample example=new SysUseraccountExample();

        SysUseraccountExample.Criteria criteria = example.createCriteria();
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
            criteria.andUserNameLike("%"+search+"%");
        }

        example.setOrderByClause("USER_ID DESC");
        List<SysUseraccount> list=sysUseraccountMapper.selectByExample(example);
        PageInfo<SysUseraccount>   pageInfo=new PageInfo<SysUseraccount>(list);
        return pageInfo;
    }

    @Override
    public void add(SysUseraccount sysUseraccount) {
        this.sysUseraccountMapper.insert(sysUseraccount);
    }

    @Override
    public void del(Long userId) {
        this.sysUseraccountMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public void update(SysUseraccount sysUseraccount) {
        this.sysUseraccountMapper.updateByPrimaryKey(sysUseraccount);
    }

    @Override
    public SysUseraccount get(Long userId) {
      return this.sysUseraccountMapper.selectByPrimaryKey(userId);
    }


}
