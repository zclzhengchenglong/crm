package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SaleClientloss;
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
public interface SysUsermesService {
    public PageInfo<SysUsermes> selectpage(int pageNum, int pageSize, SysUsermes sysUsermes,String datemin,String datemax,String search);

    public void add(SysUsermes sysUsermes);

    public void del(Long workerId);


    public void update(SysUsermes sysUsermes);

    public SysUsermes get(Long workerId);
//    public SysUsermes list()
//  public List<SysUsermes> selectRoles();

}
