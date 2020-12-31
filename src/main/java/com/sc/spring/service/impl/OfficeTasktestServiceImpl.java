package com.sc.spring.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.spring.entity.*;
import com.sc.spring.mapper.OfficeTaskdetMapper;
import com.sc.spring.mapper.OfficeTasktestMapper;
import com.sc.spring.mapper.SysUseraccountMapper;
import com.sc.spring.service.OfficeTasktestservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类名：OfficeTaskdetServiceImpl
 * 描述：一段话描述类的信息
 * 作者：劫恋李
 * 日期：2020/12/15 19:15
 * 版本：V1.0
 */
@Service
public class OfficeTasktestServiceImpl implements OfficeTasktestservice {
    @Autowired
    OfficeTasktestMapper officeTasktestMapper;

    @Autowired
    OfficeTaskdetMapper officeTaskdetMapper;

    @Autowired
    SysUseraccountMapper sysUseraccountMapper;


    @Override
    public PageInfo<OfficeTasktest> selectpage(int pageNum, int pageSize, OfficeTaskdet officeTaskdet, String datemin, String datemax, String search) {
        PageHelper.startPage(pageNum, pageSize);

           /* officeTaskdet=new OfficeTaskdet();

            if(search!=null&&!search.equals("")){
                officeTaskdet.setCompanyNumber("%"+search+"%");
            }
            List<OfficeTaskdet> list = officeTaskdetMapper.selectofficeTaskdetAndMes(officeTaskdet);
*/

            OfficeTasktestExample example=new OfficeTasktestExample();
            OfficeTasktestExample.Criteria criteria = example.createCriteria();

            if(search!=null&&!search.equals("")){
                criteria.andTaskTitleLike("%"+search+"%");
            }
            List<OfficeTasktest> list = officeTasktestMapper.selectByExample(example);

            PageInfo<OfficeTasktest> pageInfo = new PageInfo<OfficeTasktest>(list);
            return pageInfo;
        }


        @Override
        public void add (OfficeTasktest officeTasktest){
            this.officeTasktestMapper.insert(officeTasktest);
        }

        @Override
        public void del (String taskId){
            this.officeTasktestMapper.deleteByPrimaryKey(taskId);
        }

        @Override
        public void update (OfficeTasktest officeTasktest){
            this.officeTasktestMapper.updateByPrimaryKey(officeTasktest);
        }

    @Override
    public OfficeTasktest get(String indexId) {
        return this.officeTasktestMapper.selectByPrimaryKey(indexId);
    }

    @Override
    public List<SysUseraccount> selectUsers() {
        return sysUseraccountMapper.selectByExample(null);
    }


    @Override
    public List<OfficeTasktest> selectRoles() {
        return this.officeTasktestMapper.selectByExample(null);
    }

}
