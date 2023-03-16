package cn.xj.service.impl;

import cn.xj.mapper.MemberMapper;
import cn.xj.pojo.Member;
import cn.xj.pojo.MemberExample;
import cn.xj.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberMapper memberMapper;

    @Override
    public Member queryById(int id) {
        return memberMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Member> queryByMobile(String mobile) {
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andMobileEqualTo(mobile);
        return memberMapper.selectByExample(memberExample);
    }

    @Override
    public int add(String mobile, String pwd) {
        Member member = new Member();
        member.setMobile(mobile);
        member.setPwd(pwd);
        return memberMapper.insert(member);
    }
}
