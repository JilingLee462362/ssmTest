package com.tzhu.ssm.service;

import com.tzhu.ssm.domain.Member;

import java.util.List;

/**
 * Created by Administrator on 2018/9/30.
 */
public interface MemberBizI {

    List<Member> searchAll();

    List<Member> pageSearch(int pageNum, int pageSize);
}
