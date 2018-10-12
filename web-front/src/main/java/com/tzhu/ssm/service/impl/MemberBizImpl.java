package com.tzhu.ssm.service.impl;

import com.tzhu.ssm.dao.MemberMapper;
import com.tzhu.ssm.domain.Member;
import com.tzhu.ssm.domain.MemberExample;
import com.tzhu.ssm.service.MemberBizI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/30.
 */
@Service("memDaoI")
public class MemberBizImpl implements MemberBizI {

    MemberMapper memberMapper;

    @Resource
    public void setMemberMapper(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public List<Member> searchAll() {


        return memberMapper.selectByExample(null);
    }

    @Override
    public List<Member> pageSearch(int pageNum, int pageSize) {
        MemberExample ex = new MemberExample();
        int turePageNum = (pageNum - 1) * pageSize;
        ex.setPageNum(turePageNum);
        ex.setPageSize(pageSize);
        List<Member> members = memberMapper.selectByExample(ex);
        return members;
    }
}
