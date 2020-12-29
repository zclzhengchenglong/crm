package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.Officemes;
import com.sc.spring.entity.OfficemesExample;
import com.sc.spring.entity.SysUseraccount;
import com.sc.spring.mapper.OfficemesMapper;
import com.sc.spring.mapper.SysUseraccountMapper;
import com.sc.spring.service.OfficeMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 类名：
 * 描述：一段话描述类的信息
 * 作者:谢齐
 * 日期：2020/12/11 19:04
 * 版本：V1.0
 */
@Service
public class OfficeMesServiceImpl implements OfficeMesService {
    @Autowired
    OfficemesMapper officemesMapper;

    @Autowired
    SysUseraccountMapper sysUseraccountMapper;

    @Override
    public PageInfo<Officemes> selectpage(int pageNum, int pageSize, Officemes officemes,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        OfficemesExample example=new OfficemesExample();


        OfficemesExample.Criteria criteria = example.createCriteria();
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
            OfficemesExample.Criteria criteria1 = example.createCriteria();
            criteria1.andTitleLike("%"+search+"%");
            example.or(criteria1);
        }

        if(search!=null&&!search.equals("")){
            OfficemesExample.Criteria criteria2 = example.createCriteria();
            criteria2.andSenderLike("%"+search+"%");
            example.or(criteria2);
        }


        example.setOrderByClause("OFFICE_ID DESC");
        List<Officemes> list=officemesMapper.selectByExample(example);
        PageInfo<Officemes>   pageInfo=new PageInfo<Officemes>(list);
        return pageInfo;
    }

    @Override
    public void add(Officemes officemes) {
        this.officemesMapper.insert(officemes);
    }

    @Override
    public void del(Long officeId) {
        this.officemesMapper.deleteByPrimaryKey(officeId);
    }

    @Override
    public void update(Officemes officemes) {
        this.officemesMapper.updateByPrimaryKey(officemes);
    }

    @Override
    public Officemes get(Long officeId) {
        return this.officemesMapper.selectByPrimaryKey(officeId);
    }

    @Override
    public List<SysUseraccount> selectUsers() {
        return sysUseraccountMapper.selectByExample(null);
    }
}
