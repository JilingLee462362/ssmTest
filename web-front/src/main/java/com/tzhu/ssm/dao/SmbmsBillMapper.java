package com.tzhu.ssm.dao;

import com.tzhu.ssm.domain.SmbmsBill;
import com.tzhu.ssm.domain.SmbmsBillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmbmsBillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsBill record);

    int insertSelective(SmbmsBill record);

    List<SmbmsBill> selectByExample(SmbmsBillExample example);

    SmbmsBill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmbmsBill record, @Param("example") SmbmsBillExample example);

    int updateByExample(@Param("record") SmbmsBill record, @Param("example") SmbmsBillExample example);

    int updateByPrimaryKeySelective(SmbmsBill record);

    int updateByPrimaryKey(SmbmsBill record);

    int pageSearch(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);


}