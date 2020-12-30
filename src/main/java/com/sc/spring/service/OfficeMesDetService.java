package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.Officemes;
import com.sc.spring.entity.Officemesdet;
import com.sc.spring.entity.SysUseraccount;

import java.util.List;

/**
 * 类名：OfficeMesService
 * 描述：一段话描述类的信息
 * 作者：谢齐
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface OfficeMesDetService {
    public PageInfo<Officemesdet> selectpage(int pageNum, int pageSize, Officemesdet officemesdet,String datemin,String datemax,String search);

    public void add(Officemesdet officemesdet);

    public void del(Long detailNo);

    public void update(Officemesdet officemesdet);

    public Officemesdet get(Long detailNo);

    public List<SysUseraccount> selectUsers(); //显示下拉框的负责人
}
