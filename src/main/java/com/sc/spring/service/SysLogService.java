package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysLog;
import com.sc.spring.entity.SysUsermes;

import java.math.BigDecimal;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SysLogService {
    public PageInfo<SysLog> selectpage(int pageNum, int pageSize, SysLog sysLog,String datemin,String datemax,String search);

    public void add(SysLog sysLog);

    public void del(BigDecimal logNum);


    public void update(SysLog sysLog);

    public SysLog get(BigDecimal logNum);

}
