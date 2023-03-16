package cn.xj.service;

import cn.xj.pojo.Member;

import java.util.List;

public interface MemberService {
    public Member queryById(int id);
    public List<Member> queryByMobile(String mobile);
    public int add(String mobile,String pwd);
}
