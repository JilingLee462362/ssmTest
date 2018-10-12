package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.appcomm.BaseSpringJunit;
import com.tzhu.ssm.domain.Member;
import com.tzhu.ssm.service.MemberBizI;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/30.
 */

public class MemberBizImplTest extends BaseSpringJunit {
    @Resource
    MemberBizI dao;

    @Test
    public void testSearchAll() throws Exception {
        List<Member> members = dao.searchAll();
        //    for ( Member m : members){
        //       System.out.println(m.toString());
        //   }
        log.info("member.size......................" + members.size());
    }

    @Test
    public void testPage() {

        List<Member> members = dao.pageSearch(1, 2);
        for (Member m : members) {
            System.out.println(m.toString());
        }
    }
}