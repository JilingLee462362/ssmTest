package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.appcomm.BaseSpringJunit;
import com.tzhu.ssm.domain.Team;
import com.tzhu.ssm.service.TeamBizI;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TeamDaoImplTest extends BaseSpringJunit {

    @Resource()
    TeamBizI teamBizI;


    @Test
    public void search() {


        List<Team> teamList = teamBizI.search();

        log.info("  teamList  : " + teamList.size());

    }
}