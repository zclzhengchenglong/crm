package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.mapper.OfficeTestMapper;
import com.sc.spring.service.OfficeTestservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 类名：OfficeTaskdetServiceImpl
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:15
 * 版本：V1.0
 */
@Service
public class OfficeTestServiceImpl implements OfficeTestservice {
    @Autowired
    OfficeTestMapper officeTestMapper;


    @Override
    //这里主要是搜索，排序的查询
    public PageInfo<OfficeTest> selectpage(int pageNum, int pageSize, OfficeTest OfficeTest, String datemin, String datemax, String search) {
        PageHelper.startPage(pageNum,pageSize);
        OfficeTestExample example=new OfficeTestExample();


        OfficeTestExample.Criteria criteria = example.createCriteria();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        if(datemin!=null&&!datemin.equals("")){
            try {

                criteria.andLastModificationTimeGreaterThanOrEqualTo(sdf.parse(datemin));//上次修改时间大于或等于
                //criteria.aszttimeGreaterThanOrEqualTo(sdf.parse(datemin));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(datemax!=null&&!datemax.equals("")){
            try {
               criteria.andLastModificationTimeLessThanOrEqualTo(sdf.parse(datemax));//上次修改时间超过或等于

            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(search!=null&&!search.equals("")){
            criteria.andAssessmentIndexLike("%"+search+"%");//通过AssessmentIndex属性来搜索
        }

        example.setOrderByClause("INDEX_ID DESC");//这个是表的主键来降序
        List<OfficeTest> list = officeTestMapper.selectByExample(example);
        PageInfo<OfficeTest> pageInfo = new PageInfo<OfficeTest>(list);
        return pageInfo;
    }

    @Override
    //分页
    public PageInfo<OfficeTest> selectpage1(int pageNum, int pageSize, OfficeTest officeTest) {
        return null;
    }

    @Override
    public void add(OfficeTest officeTest) {
        this.officeTestMapper.insert(officeTest);
    }

    @Override
    public void del(String indexId) {
        this.officeTestMapper.deleteByPrimaryKey(indexId);
    }

    @Override
    public void update(OfficeTest officeTest) {
        this.officeTestMapper.updateByPrimaryKey(officeTest);
    }

    @Override
    public OfficeTest get(String indexId) {
       return this.officeTestMapper.selectByPrimaryKey(indexId);
    }

    @Override
    public List<OfficeTest> selectRoles() {
        return this.officeTestMapper.selectByExample(null);
    }

}
