package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysJur;
import com.sc.spring.entity.SysJurExample;
import com.sc.spring.entity.SysJurRole;
import com.sc.spring.entity.SysJurRoleExample;
import com.sc.spring.mapper.SysJurMapper;
import com.sc.spring.mapper.SysJurRoleMapper;
import com.sc.spring.service.SysJurRoleService;
import com.sc.spring.service.SysJurService;
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
public class SysJurServiceImpl implements SysJurService {
    @Autowired
    SysJurMapper sysJurMapper;



    @Override
    public PageInfo<SysJur> selectpage(int pageNum, int pageSize, SysJur sysJur,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        SysJurExample example=new SysJurExample();

        SysJurExample.Criteria criteria = example.createCriteria();
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
            criteria.andColumnNameLike("%"+search+"%");
        }



        example.setOrderByClause("COLUMN_ID DESC");
        List<SysJur> list=sysJurMapper.selectByExample(example);
        PageInfo<SysJur> pageInfo=new PageInfo<SysJur>(list);
        return pageInfo;
    }

    @Override
    public void add(SysJur sysJur) {
        this.sysJurMapper.insert(sysJur);
    }

    @Override
    public void del(Long columnId) {
        this.sysJurMapper.deleteByPrimaryKey(columnId);
    }

    @Override
    public void update(SysJur sysJur) {
        this.sysJurMapper.updateByPrimaryKey(sysJur);
    }

    @Override
    public SysJur get(Long columnId) {
      return this.sysJurMapper.selectByPrimaryKey(columnId);
    }


}
