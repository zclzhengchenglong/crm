package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.OfficeTaskdet;
import com.sc.spring.entity.OfficeTaskdetExample;
import com.sc.spring.mapper.OfficeTaskdetMapper;
import com.sc.spring.service.OfficeTaskdetservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 类名：OfficeTaskdetServiceImpl
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:15
 * 版本：V1.0
 */
@Service
public class OfficeTaskdetServiceImpl implements OfficeTaskdetservice {
    @Autowired
    OfficeTaskdetMapper officeTaskdetMapper;


    @Override
    public PageInfo<OfficeTaskdet> selectpage(int pageNum, int pageSize, OfficeTaskdet officeTaskdet, String datemin, String datemax, String search) {
        PageHelper.startPage(pageNum,pageSize);

        officeTaskdet=new OfficeTaskdet();
        //判断 模糊查询的 search 为空，走全部显示；若 模糊查询的 search 有值，则走模糊查询
        if (search!=null&&!search.equals("")){
            officeTaskdet.setAcceptUserNumber("%"+search+"%");
        }

        //关联查询 定义的 集合
        List<OfficeTaskdet> list=officeTaskdetMapper.selectofficeTaskdetAndMes(officeTaskdet);
        PageInfo<OfficeTaskdet>   pageInfo=new PageInfo<OfficeTaskdet>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<OfficeTaskdet> selectpagemy(int pageNum, int pageSize, OfficeTaskdet officeTaskdet, String datemin, String datemax, String search) {
        PageHelper.startPage(pageNum,pageSize);

        //判断 模糊查询的 search 为空，走全部显示；若 模糊查询的 search 有值，则走模糊查询
        if (search!=null&&!search.equals("")){
            //officeTaskdet.setAcceptUserNumber("%"+search+"%");
            officeTaskdet.setState("%"+search+"%");
        }

        //关联查询 定义的 集合
        List<OfficeTaskdet> list=officeTaskdetMapper.selectofficeTaskdetMy(officeTaskdet);
        PageInfo<OfficeTaskdet>   pageInfo=new PageInfo<OfficeTaskdet>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<OfficeTaskdet> selectpagedet(int pageNum, int pageSize, OfficeTaskdet officeTaskdet, String datemin, String datemax, String search) {
        PageHelper.startPage(pageNum,pageSize);

        //判断 模糊查询的 search 为空，走全部显示；若 模糊查询的 search 有值，则走模糊查询
        if (search!=null&&!search.equals("")){
            //officeTaskdet.setAcceptUserNumber("%"+search+"%");
            officeTaskdet.setState("%"+search+"%");
        }

        //关联查询 定义的 集合
        List<OfficeTaskdet> list=officeTaskdetMapper.selectofficeTaskdet(officeTaskdet);
        PageInfo<OfficeTaskdet>   pageInfo=new PageInfo<OfficeTaskdet>(list);
        return pageInfo;
    }


    @Override
    public void add(OfficeTaskdet officeTaskdet) {
        this.officeTaskdetMapper.insert(officeTaskdet);
    }

    @Override
    public void del(Long officeId) {
        this.officeTaskdetMapper.deleteByPrimaryKey(officeId);
    }

    @Override
    public void update(OfficeTaskdet officeTaskdet) {
        this.officeTaskdetMapper.updateByPrimaryKey(officeTaskdet);
    }

    @Override
    public OfficeTaskdet get(Long officeId) {
        return this.officeTaskdetMapper.selectByPrimaryKey(officeId);
    }

    @Override
    public List<OfficeTaskdet> selectRoles() {
        return this.officeTaskdetMapper.selectByExample(null);
    }
}
