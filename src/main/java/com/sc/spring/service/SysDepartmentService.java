package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysDepartment;
import com.sc.spring.entity.SysUsermes;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SysDepartmentService {
    public PageInfo<SysDepartment> selectpage(int pageNum, int pageSize, SysDepartment sysDepartment,String datemin,String datemax,String search);

    public void add(SysDepartment sysDepartment);

    public void del(Long departId);


    public void update(SysDepartment sysDepartment);

    public SysDepartment get(Long departId);

}
