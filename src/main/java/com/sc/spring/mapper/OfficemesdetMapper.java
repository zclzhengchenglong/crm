package com.sc.spring.mapper;

import com.sc.spring.entity.Officemesdet;
import com.sc.spring.entity.OfficemesdetExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficemesdetMapper {
    long countByExample(OfficemesdetExample example);

    int deleteByExample(OfficemesdetExample example);

    int deleteByPrimaryKey(Long detailNo);

    int insert(Officemesdet record);

    int insertSelective(Officemesdet record);



    List<Officemesdet> selectByExample(OfficemesdetExample example);

    List<Officemesdet> selectOfficeMesdetAndMes(Officemesdet officemesdet);

    Officemesdet selectByPrimaryKey(Long detailNo);

    int updateByExampleSelective(@Param("record") Officemesdet record, @Param("example") OfficemesdetExample example);

    int updateByExample(@Param("record") Officemesdet record, @Param("example") OfficemesdetExample example);

    int updateByPrimaryKeySelective(Officemesdet record);

    int updateByPrimaryKey(Officemesdet record);
}