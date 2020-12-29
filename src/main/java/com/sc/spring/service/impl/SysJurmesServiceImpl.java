package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysJurmes;
import com.sc.spring.entity.SysJurmesExample;
import com.sc.spring.entity.SysRole;
import com.sc.spring.entity.SysRoleExample;
import com.sc.spring.mapper.SysJurmesMapper;
import com.sc.spring.mapper.SysRoleMapper;
import com.sc.spring.service.SysJurmesService;
import com.sc.spring.service.SysRoleService;
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
public class SysJurmesServiceImpl implements SysJurmesService {
    @Autowired
    SysJurmesMapper sysJurmesMapper;
    @Autowired
    SysRoleMapper sysRoleMapper;



    @Override
    public PageInfo<SysJurmes> selectpage(int pageNum, int pageSize, SysJurmes sysRole,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SysJurmesExample example=new SysJurmesExample();

        SysJurmesExample.Criteria criteria = example.createCriteria();
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
            criteria.andPowerNameLike("%"+search+"%");
        }

        example.setOrderByClause("POWER_ID DESC");
        List<SysJurmes> list=sysJurmesMapper.selectByExample(example);
        PageInfo<SysJurmes>   pageInfo=new PageInfo<SysJurmes>(list);
        return pageInfo;
    }

    @Override
    public void add(SysJurmes sysJurmes) {
        this.sysJurmesMapper.insert(sysJurmes);
    }

    @Override
    public void del(Long powerId) {
        this.sysJurmesMapper.deleteByPrimaryKey(powerId);
    }

    @Override
    public void update(SysJurmes sysJurmes) {
        this.sysJurmesMapper.updateByPrimaryKey(sysJurmes);
    }

    @Override
    public SysJurmes get(Long powerId) {
      return this.sysJurmesMapper.selectByPrimaryKey(powerId);
    }

    @Override
    public List<SysJurmes> selectByURL(String url) {
        SysJurmesExample example=new SysJurmesExample();

        SysJurmesExample.Criteria criteria = example.createCriteria();
        criteria.andRemarksEqualTo(url);
        return  sysJurmesMapper.selectByExample(example);
    }


}
