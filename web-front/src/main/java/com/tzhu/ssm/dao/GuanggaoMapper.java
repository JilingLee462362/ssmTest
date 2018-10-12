package com.tzhu.ssm.dao;

import com.tzhu.ssm.domain.Guanggao;
import com.tzhu.ssm.domain.GuanggaoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuanggaoMapper {
    int deleteByPrimaryKey(Integer ggid);

    int insert(Guanggao record);

    int insertSelective(Guanggao record);

    List<Guanggao> selectByExample(GuanggaoExample example);

    Guanggao selectByPrimaryKey(Integer ggid);

    int updateByExampleSelective(@Param("record") Guanggao record, @Param("example") GuanggaoExample example);

    int updateByExample(@Param("record") Guanggao record, @Param("example") GuanggaoExample example);

    int updateByPrimaryKeySelective(Guanggao record);

    int updateByPrimaryKey(Guanggao record);
}