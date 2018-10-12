package com.tzhu.ssm.dao;

import com.tzhu.ssm.domain.SmbmsAddress;
import com.tzhu.ssm.domain.SmbmsAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmbmsAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsAddress record);

    int insertSelective(SmbmsAddress record);

    List<SmbmsAddress> selectByExample(SmbmsAddressExample example);

    SmbmsAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmbmsAddress record, @Param("example") SmbmsAddressExample example);

    int updateByExample(@Param("record") SmbmsAddress record, @Param("example") SmbmsAddressExample example);

    int updateByPrimaryKeySelective(SmbmsAddress record);

    int updateByPrimaryKey(SmbmsAddress record);
}