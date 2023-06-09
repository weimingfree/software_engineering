<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>联想-欢迎注册</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/register/register.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/register/register2.css">

</head>
<body style="background: #f6f6f6;">
    <SCRIPT TYPE="text/javascript"> 
        function popup(temp) {
            alert(temp);
        }
    </SCRIPT>

    <div class="header">
        <div class="word">
            <ul>
                <li>联想首页</li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
            </ul>
        </div>
    </div>
    <div class="regist">
        <div class="regist_title">注册联想会员</div>
		<div class="regist_userphoto">
            <img src="${pageContext.request.contextPath}/register/add.png" alt="">
        </div>
        
    <form action="${pageContext.request.contextPath}/login/register.action" class="form-signin" method="post">
        <div class="regist_main">
            <div class="regist_info_person">
                <div class="regist_item">
                    <input type="text" class="phone_person" placeholder="输入用户名" name="mobile">
                    <i class="icon-clear"></i>
                </div>
                <div class="regist_item">
                    <input type="text" class="phone_person" placeholder="输入邮箱" name="email">
                    <i class="icon-clear"></i>
                </div>
                <div id="slider_person" class="slider"></div>

                <!-- <div class="regist_item clearfix">
                    <input type="text" id="captcha_person"  placeholder="输入验证码">
                    <a href="javascript:;" class="captcha_person_btn">获取验证码</a>
                </div> -->
                <div class="regist_item">
                    <input type="password" class="pwd" placeholder="密码由8-20位字母、数字和符号组合" name="pwd">
                    <i class="icon-clear"></i>
                </div>
                <div class="regist_item">
                    <input type="password" class="repwd" placeholder="再次输入密码" name="password_c">
                    <i class="icon-clear"></i>
                </div>
            </div>
            
            <!-- <div class="regist-error">
                <i class="icon-error"></i>
                <p class="regist_msg" >用户名不正确</p>
            </div> -->

            
                <div class="regist_agreement_info">
                    <span class="persistent"></span>
                    <span class="agreementInfo">已阅读并同意联想 <a href="https://shop.lenovo.com.cn/investor/html/legal.html" target="_blank">使用条款</a> 和 <a href="https://www.lenovo.com.cn/statement/privacy.html" target="_blank">隐私政策</a></span>
                </div>
			
            
            <button class="regist_button" type="submit">注册</button>
            
			
			
				<div class="regist_agreement_new">
                    <span class="regist_agreement_new_line"></span>
					<p class="go_other"><span class="go_login">已有账号 <a href="javascript:;" class="go-login">点此登录></a></span><span class="go_companyRegist"><a href="javascript:;" class="go-companyRegist">企业会员注册></a></span></p>
				</div>
			
        </div>
			<input type="hidden" id='ticket' value="e40e7004-4c8a-4963-8564-31271a8337d8" />
	    	<input type="hidden" id="ru" value="http://www.lenovo.com.cn"/>
    </form>
    <!--div>
    {% if data %}
    {% for key,value in data.items %}
    <BODY onLoad="popup('{{value}}')">
    {% endfor%}
    {% endif %}
    </div-->
</body>
</html>
