package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.Officemes;
import com.sc.spring.entity.SaleClientloss;
import com.sc.spring.entity.SysUseraccount;

import java.math.BigDecimal;
import java.util.List;

/**
 * 类名：OfficeMesService
 * 描述：一段话描述类的信息
 * 作者：谢齐
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface OfficeMesService {
    public PageInfo<Officemes> selectpage(int pageNum, int pageSize, Officemes officemes,String datemin,String datemax,String search);

    public void add(Officemes officemes);

    public void del(Long officeId);

    public void update(Officemes officemes);

    public Officemes get(Long officeId);

    public List<SysUseraccount> selectUsers(); //显示下拉框的发送人
}
