package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.dao.TeamMapper;
import com.tzhu.ssm.domain.Team;
import com.tzhu.ssm.service.TeamBizI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "teamDaoI")
public class TeamBizImpl implements TeamBizI {

    @Resource  //属性注入（入侵式注入）   set注入  属性注入  构造注入
    private TeamMapper teamMapper;


    @Override
    public List<Team> search() {


        return teamMapper.selectByExample(null);


    }


}

