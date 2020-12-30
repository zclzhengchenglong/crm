package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.OfficePersonsche;
import com.sc.spring.entity.OfficePersonscheExample;
import com.sc.spring.entity.OfficemesExample;
import com.sc.spring.entity.SysUseraccount;
import com.sc.spring.mapper.OfficePersonscheMapper;
import com.sc.spring.mapper.SysUseraccountMapper;
import com.sc.spring.service.OfficePersonscheService;
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
public class OfficePersonscheServiceImpl implements OfficePersonscheService {
    @Autowired
    OfficePersonscheMapper officePersonscheMapper;

    @Autowired
    SysUseraccountMapper sysUseraccountMapper;


    @Override
    public PageInfo<OfficePersonsche> selectpage(int pageNum, int pageSize, OfficePersonsche officePersonsche,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);
        OfficePersonscheExample example=new OfficePersonscheExample();


        OfficePersonscheExample.Criteria criteria = example.createCriteria();
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
            OfficePersonscheExample.Criteria criteria1 = example.createCriteria();
            criteria1.andArrangeTheThemeLike("%"+search+"%");
            example.or(criteria1);
        }

        if(search!=null&&!search.equals("")){
            OfficePersonscheExample.Criteria criteria2 = example.createCriteria();
            criteria2.andArrangementCategroyLike("%"+search+"%");
            example.or(criteria2);
        }


        example.setOrderByClause("SE_ID DESC");
        List<OfficePersonsche> list=officePersonscheMapper.selectByExample(example);
        PageInfo<OfficePersonsche>   pageInfo=new PageInfo<OfficePersonsche>(list);
        return pageInfo;
    }

    @Override
    public void add(OfficePersonsche officePersonsche) {
        this.officePersonscheMapper.insert(officePersonsche);
    }


    @Override
    public void del(Long seId) {
        this.officePersonscheMapper.deleteByPrimaryKey(seId);
    }

    @Override
    public void update(OfficePersonsche officePersonsche) {
        this.officePersonscheMapper.updateByPrimaryKey(officePersonsche);
    }

    @Override
    public OfficePersonsche get(Long seId) {
        return this.officePersonscheMapper.selectByPrimaryKey(seId);
    }

    @Override
    public List<SysUseraccount> selectUsers() {
        return sysUseraccountMapper.selectByExample(null);
    }
}
