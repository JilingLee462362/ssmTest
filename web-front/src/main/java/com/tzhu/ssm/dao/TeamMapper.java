package com.tzhu.ssm.dao;

import com.tzhu.ssm.domain.Team;
import com.tzhu.ssm.domain.TeamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Team record);

    int insertSelective(Team record);

    List<Team> selectByExample(TeamExample example);

    Team selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}