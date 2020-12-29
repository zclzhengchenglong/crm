package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysCompany;
import com.sc.spring.entity.SysUsermes;

import java.math.BigDecimal;
import java.util.List;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SysCompanyService {
    public PageInfo<SysCompany> selectpage(int pageNum, int pageSize, SysCompany sysCompany,String datemin,String datemax,String search);

    public void add(SysCompany sysCompany);

    public void del(BigDecimal sysCompanyId);


    public void update(SysCompany sysCompany);

    public SysCompany get(BigDecimal sysCompanyId);
    public List<SysCompany> selectRoles();
}
