package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.Officemes;
import com.sc.spring.entity.OfficemesExample;
import com.sc.spring.entity.Officemesdet;
import com.sc.spring.entity.OfficemesdetExample;
import com.sc.spring.mapper.OfficemesMapper;
import com.sc.spring.mapper.OfficemesdetMapper;
import com.sc.spring.service.OfficeMesDetService;
import com.sc.spring.service.OfficeMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 类名：
 * 描述：一段话描述类的信息
 * 作者:谢齐
 * 日期：2020/12/11 19:04
 * 版本：V1.0
 */
@Service
public class OfficeMesDetServiceImpl implements OfficeMesDetService {
    @Autowired
    OfficemesdetMapper officemesdetMapper;



    @Override
    public PageInfo<Officemesdet> selectpage(int pageNum, int pageSize, Officemesdet officemesdet,String datemin,String datemax,String search) {
        PageHelper.startPage(pageNum,pageSize);

        officemesdet=new Officemesdet();

        //判断 模糊查询的 search 为空，走全部显示；若 模糊查询的 search 有值，则走模糊查询
        if (search!=null&&!search.equals("")){
            officemesdet.setMessageStatus("%"+search+"%");
        }


        //关联查询 定义的 集合
        List<Officemesdet> list=officemesdetMapper.selectOfficeMesdetAndMes(officemesdet);
        PageInfo<Officemesdet>   pageInfo=new PageInfo<Officemesdet>(list);
        return pageInfo;
    }


    @Override
    public void add(Officemesdet officemesdet) {
        this.officemesdetMapper.insert(officemesdet);
    }

    @Override
    public void del(Long detailNo) {
        this.officemesdetMapper.deleteByPrimaryKey(detailNo);
    }

    @Override
    public void update(Officemesdet officemesdet) {
        this.officemesdetMapper.updateByPrimaryKey(officemesdet);
    }

    @Override
    public Officemesdet get(Long officeId) {
        return this.officemesdetMapper.selectByPrimaryKey(officeId);
    }



}
