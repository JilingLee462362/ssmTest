package com.tzhu.ssm.dao;

import com.tzhu.ssm.domain.SmbmsRole;
import com.tzhu.ssm.domain.SmbmsRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmbmsRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmbmsRole record);

    int insertSelective(SmbmsRole record);

    List<SmbmsRole> selectByExample(SmbmsRoleExample example);

    SmbmsRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmbmsRole record, @Param("example") SmbmsRoleExample example);

    int updateByExample(@Param("record") SmbmsRole record, @Param("example") SmbmsRoleExample example);

    int updateByPrimaryKeySelective(SmbmsRole record);

    int updateByPrimaryKey(SmbmsRole record);
}