package cn.xj.controller;

import cn.xj.pojo.Member;
import cn.xj.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/login")
public class login {
    @Autowired
    MemberService memberService;

    @RequestMapping("/memberlogin")
    public String memberlogin(HttpServletRequest request, HttpSession session){
        String mobile = request.getParameter("mobile");
        String pwd = request.getParameter("pwd");
        System.out.println("mobile="+mobile);
        System.out.println("pwd="+pwd);
        List<Member> members = memberService.queryByMobile(mobile);
        if(members.size() == 0){
            request.setAttribute("msg","无此用户");
            return "login.jsp";
        }else if(!members.get(0).getPwd().equals(pwd)){
            request.setAttribute("msg","密码错误");
            return "login.jsp";
        }else {
            session.setAttribute("user",members.get(0));
            request.setAttribute("msg","登录成功");
            return "main.jsp";
        }
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request){
        String mobile = request.getParameter("mobile");
        String pwd = request.getParameter("pwd");
        System.out.println("电话号码:"+mobile);
        System.out.println("密码"+pwd);
        List<Member> members = memberService.queryByMobile(mobile);
        if(members.size() != 0){
            request.setAttribute("msg","此账号已被注册");
            return "register.jsp";
        }else{
            memberService.add(mobile,pwd);
            request.setAttribute("msg","注册成功");
            return "login.jsp";
        }
    }

}
