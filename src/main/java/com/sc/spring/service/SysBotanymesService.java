package com.sc.spring.service;

import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.SysBotanymes;
import com.sc.spring.entity.SysCompany;
import com.sc.spring.entity.SysUsermes;

import java.util.List;

/**
 * 类名：SaleClientlossService
 * 描述：一段话描述类的信息
 * 作者“郑成龙
 * 日期：2020/12/11 19:03
 * 版本：V1.0
 */
public interface SysBotanymesService {
    public PageInfo<SysBotanymes> selectpage(int pageNum, int pageSize, SysBotanymes sysBotanymes,String datemin,String datemax,String search);

    public void add(SysBotanymes sysBotanymes);

    public void del(Long postId);


    public void update(SysBotanymes sysBotanymes);

    public SysBotanymes get(Long postId);
//    public List<SysBotanymes> selectRoles();
}
