<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>联想-欢迎登录</title>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/login/images/favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/login/css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/login/css/login.css" />
</head>

<body>
    <SCRIPT TYPE="text/javascript">
        function popup(msg) {
            alert(msg);
        }
        if ("${msg}" != "") {
           popup("${msg}");
       }
    </SCRIPT>

    <header>
      <!--index.html为主页链接-->
        <div class="logo"><a href="index.jsp"></a></div>
        <b></b>
        <a href="#" class="questionnaire">
            登录页面，调查问卷
            <b></b>
        </a>
    </header>
    <div class="loginarea">
        <div class="tips-wrapper">
            <i></i>
            依据《网络安全法》，为保障您的账户安全和正常使用，请尽快完成手机号验证！ 新版<span style="color: #333;">《隐私政策》</span>已上线，将更有利于保护您的个人隐私。
        </div>
        <div class="login-wrap">
            <div class="login-bg">
                <div class="login_form">
                    <div class="login-tips">
                        <i></i>
                        联想不会以任何理由要求您转账汇款，谨防诈骗。
                    </div>
                    <ul class="login-tab">
                        <li class="login-tab-r">
                            <a href="#">账号登录</a>
                        </li>
                    </ul>
                    <div class="login-w">
                        <div class="mc1">
                            <form action="${pageContext.request.contextPath}/login//memberlogin.action" method="post">
                                <div class="conner">
                                <div class="login_uname">
                                    <label for="uname"></label>
                                    <input type="text" name="mobile" id="uname" placeholder="用户名">
                                </div>
                                <div class="login_password">
                                    <label for="password"></label>
                                    <input type="password" name="pwd" id="password" placeholder="密码">
                                </div>
                                <div class="forgot"><a href="#">忘记密码</a></div>
                                <input type="submit" value="登录" class="over">
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="login-bd">
                        <a href="#"><i class="qqwx-ico"></i><span>QQ</span></a>
                        <span class="line">|</span>
                        <a href="#"><i class="qqwx-ico login-bd-last"></i><span>微信</span></a>
                        <a href="register.jsp" class="gotoregist"><i></i>立即注册</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="footer">
        <p class="links">
            <a href="#">关于我们  |</a>
            <a href="#">联系我们  |</a>
            <a href="#">人才招聘  |</a>
            <a href="#">商家入驻  |</a>
            <a href="#">广告服务  |</a>
            <a href="#">友情链接  |</a>
            <a href="#">销售联盟  |</a>
            <a href="#">English Site  |</a>
        </p>
    </div>
<!--后端接口-->
    <!-- <div>
        {{data}}
        {% if data %}
        {% for key,value in data.items %}
        <BODY onLoad="popup('{{ value }}')">
        {% endfor%}
        {% endif %}
    </div> -->

</body>
</html>