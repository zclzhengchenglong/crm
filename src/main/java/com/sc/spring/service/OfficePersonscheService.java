package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.OfficePersonsche;
import com.sc.spring.entity.SysUseraccount;

import java.util.List;


/**
 * 类名：OfficePersonscheService
 * 描述：一段话描述类的信息
 * 作者：谢齐
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface OfficePersonscheService {
    public PageInfo<OfficePersonsche> selectpage(int pageNum, int pageSize, OfficePersonsche officePersonsche,String datemin,String datemax,String search);

    public void add(OfficePersonsche officePersonsche);

    public void del(Long seId);

    public void update(OfficePersonsche officePersonsche);

    public OfficePersonsche get(Long seId);

    public List<SysUseraccount> selectUsers(); //显示下拉框的负责人
}
