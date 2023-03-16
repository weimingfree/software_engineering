<%--
  Created by IntelliJ IDEA.
  User: remhusband
  Date: 2022/12/19
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>个人信息</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">



    <link href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.bundle.min.js"></script>

    <link href="${pageContext.request.contextPath}/css/permsg.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/js/permsg.js" defer></script>
</head>
<body style="height:1000px">


<!--固定头部导航栏-->
<div class="container">
    <nav class="navbar navbar-expand-sm bg-light navbar-light fixed-top">

        <!--前面一堆文字-->
        <div class="logo__text">
            <ul class="navbar-nav">
                <a class="navbar-brand" href="#">
                    <img decoding="async" src="${pageContext.request.contextPath}/images/permsg/logo.png" alt="Logo"
                         style="width:120px;">
                </a>

                <li class="nav-item">
                    <a class="nav-link" href="#">新品</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">定制</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">尾货特卖</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">学生</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">游戏</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">直播</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">试用</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">乐豆购</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link " href="#">0元购</a>
                </li>


            </ul>
        </div>


        <!--搜索栏-->
        <div class="search think_search_header" style="margin-top: 13px; display: block;" >
            <div class="logo_text">
                <div class="search_box think_search_header">
                    <div class="search_input_bg"></div>

                    <a tag="searchButton" class="serch_box_img" latag="latag_pc_search_搜索框_框_直接输入_"
                       style="margin-right: 0px;"><span></span></a>

                    <input type="text" latag="latag_pc_search_keyword" placeholder="燃情赛事 暖冬钜惠"
                           placeholder-key="燃情赛事 暖冬钜惠" placeholder-url="https://activity.lenovo.com.cn/2022/gwptdc/dong.html?pmf_group=in-push&amp;pmf_medium=gwsj-pc&amp;pmf_source=Z00035283T004"
                           class="">
                </div>

            </div>



        </div>

        </ul>


    </nav>
</div>



<br/>
<br/>
<br/>
<!--次导航栏-->
<div class="user_location">
    <a href="https://www.lenovo.com.cn" title="">首页</a>
    &gt;
    <a href="https://i.lenovo.com.cn/info/center.jhtml?sts=e40e7004-4c8a-4963-8564-31271a8337d8">我的商城</a>
    &gt;
    <span>个人信息</span>
</div>

<!-- 个人信息 -->
<div class="user_main clearfix">
    <!-- 左侧导航栏 -->
    <div class="user_leftbar">
        <style type="text/css">
            #user_leftbar {
                width: 150px;
                font-family: arial, "微软雅黑", sans-serif;
                font-size: 12px;
                color: #000;
            }

            #user_leftbar * {
                margin: 0;
                padding: 0;
            }

            #user_leftbar ul, #user_leftbar li {
                list-style: none;
            }

            #user_leftbar a {
                text-decoration: none;
            }

            #user_leftbar .user_logo {
                padding: 13px 0;
                text-align: center;
            }

            #user_leftbar .user_logo img {
                width: 106px;
                height: 106px;
                border-radius: 106px;
            }

            #user_leftbar .user_logo p {
                color: #959595;
                height: 16px;
                line-height: 16px;
                overflow: hidden;
                margin-top: 8px;
            }

            #user_leftbar h3 {
                border-top: 1px solid #d9d8d6;
                height: 32px;
                line-height: 32px;
                background: #eee;
                padding-left: 32px;
                font-size: 14px;
                font-weight: normal;
                cursor: pointer;
            }

            #user_leftbar h3 span {
                float: left;
                display: block;
                height: 32px;
                line-height: 32px;
            }

            #user_leftbar h3 i {
                float: left;
                display: block;
                width: 9px;
                height: 6px;
                background-image: url(https://m4.lefile.cn/cerp_member/static/icons/usericon.png);
                margin: 13px 0 0 10px;
            }

            #user_leftbar h3 .user_up {
                background-position: -3px -3px;
            }

            #user_leftbar h3 .user_down {
                background-position: -16px -3px;
            }

            #user_leftbar ul {
                cursor: pointer;
            }

            #user_leftbar li {
                height: 31px;
                line-height: 31px;
                padding-left: 32px;
                font-size: 13px;
                border-top: 1px solid #d9d8d6;
            }

            #user_leftbar li a {
                color: #6f7170;
            }

            #user_leftbar .red_bg a {
                color: #fff;
            }

            #user_leftbar .red_bg {
                background-color: #d62f26;
            }

            body {
                background: #fff
            }
        </style>
        <div id="user_leftbar">
            <div class="user_list">
                <h3 class="clearfix1"><span>账户中心</span><i class="user_up"></i></h3>
                <ul style="display: block;">
                    <li class="red_bg"><a
                            href=""
                            mcode="611f8c79c4dc">个人信息</a></li>
                </ul>
                <ul style="display: block;">
                    <li>
                        <a href="${pageContext.request.contextPath}/changepassword.jsp"
                           mcode="b472d7371a91">修改密码</a></li>
                </ul>
            </div>
            <div class="user_list">
                <h3 class="clearfix1"><span>订单中心</span><i class="user_down"></i></h3>
                <ul style="display: none;">
                    <li><a href="${pageContext.request.contextPath}/address.jsp" mcode="f212417cda71">收货地址</a></li>
                </ul>
            </div>

            <div class="user_list">
                <h3 class="clearfix1"><span>我的信箱</span><i class="user_down"></i></h3>
            </div>

            <div class="user_list">
                <h3 class="clearfix1"><span>资产中心</span><i class="user_down"></i></h3>
            </div>

            <div class="user_list">
                <h3 class="clearfix1"><span>我的合伙人</span><i class="user_down"></i></h3>
            </div>
        </div>

    </div>

    <!-- 右侧个人资料 -->
    <div class="msg_right" style="display: block;">
        <div class="msg_box">
            <!--框头-->
            <div class="msg_title">
                <p>个人信息</p>
            </div>

            <!--框体-->
            <div class="msg_main clearfix">

                <form id="infoform" method="post">
                    <ul class="clearfix msg_ul">
                        <!--input-->
                        <!--会员账号-->
                        <li class="clearfix msg_li">
                            <p class="msg_name">会员账号：</p>
                            <p>&{user.account}</p>
                            <a href="" class="msg_toRegist">升级为企业会员
                                &gt;</a>
                        </li>

                        <!--会员类型-->
                        <li class="clearfix msg_li">
                            <p class="msg_name">会员类型：</p>
                            <p>&{user.type}</p>
                            <p>个人用户</p>
                        </li>

                        <!--会员昵称-->
                        <li class="clearfix msg_li">
                            <p class="msg_name"><span class="msg_red">* </span>会员昵称：</p>
                            <p><input type="text" id="username" name="username" class="msg_input_w"
                                      value=&{user.name}></p>
                            <p class="msg_text">4-20个字符，可由中英文、数字、“_”、“-”组成</p>
                        </li>

                        <!--性别-->
                        <li class="clearfix msg_sex msg_li">
                            <p class="msg_name"><span class="msg_red">* </span>性别：</p>
                            <p>
                                <input type="radio" name="gender" id="sex-man" value="1">
                                <label for="sex-man">男</label>

                                <input type="radio" name="gender" id="sex-woman" value="2">
                                <label for="sex-woman">女</label>

                                <input type="radio" name="gender" checked="checked" value="0" id="sex">
                                <label for="sex">保密</label>
                            </p>
                        </li>

                        <!--生日-->
                        <li class="clearfix msg_li">
                            <p class="msg_name"><span class="msg_red">* </span>生日：</p>
                            <p>
                                <input type="text" name="birthday" id="birthday" class="msg_input_w"
                                       value=&{user.birthday} readonly="readonly">
                                <!--&{user.birthday}最开始应为空,即value=""-->
                            </p>
                        </li>

                        <li class="clearfix msg_li imgCaptcha" style="display:none">
                            <p class="msg_name"><span class="msg_red"> </span>图片验证码：</p>
                            <p><input type="text" name="captcha" id="captcha" class="msg_input_w" style="width:112px;"
                                      maxlength="100"><!---->
                                <img id="imgCaptcha" class="imgCaptcha" style="cursor: pointer;" alt=""
                                     src="//captcha.lenovo.com.cn/img?1668839534451">
                            </p>
                        </li>
                    </ul>
                </form>

                <dl>
                    <dt><a href="javascript:void(0);" onclick="toggleHeadSet();" style="cursor: pointer;"><img
                            src="//i.app.lefile.cn/head/picdefault1477559405444/sdefault1477559405444.png?t=1477559406103"
                            alt="修改头像" title="修改头像"></a></dt>
                    <dd style="width: 420px; float: right;"><a href="javascript:void(0);" onclick="toggleHeadSet();"
                                                               style="cursor: pointer;">修改头像</a></dd>
                </dl>
            </div>

            <!--框体按钮-->
            <div class="msg_likes_mains">
                <div class="msg_likes_main clearfix">
                    <div class="msg_likes_mainl">
                        <p>&nbsp;</p>
                    </div>

                    <div class="msg_likes_btn">
                        <ul>
                            <li id="pushedit" onmouseover="this.style.background='#FF3030'"
                                onmouseout="this.style.background='#c9c9c9'"
                                onclick="updateMsg()" style="font-size: 14px;cursor: pointer;">
                                修改
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!-- 个人用户成为企业会员提示 -->


        <!-- 企业信息结束 -->
        <!-- 兴趣资料 -->
    </div>

    <!-- 头像处理 -->
    <div class="uphead_right" style="display: none;">
        <div class="uphead_box">
            <div class="uphead_title">
                <p>修改头像</p>
            </div>

            <form id="coordForm" method="post">
                <!-- 选择图片 -->
                <input type="hidden" id="dataX" name="dataX" value="0" placeholder="x">
                <input type="hidden" id="dataY" name="dataY" value="0" placeholder="y">
                <input type="hidden" id="dataWidth" name="dataWidth" value="-1" placeholder="width">
                <input type="hidden" id="dataHeight" name="dataHeight" value="-1" placeholder="height">
                <input type="hidden" id="sts" name="sts" value="e40e7004-4c8a-4963-8564-31271a8337d8">
                <input type="hidden" id="imgurl" name="imgurl">
            </form>

            <div class="uphead_hd clearfix" style="height: 40px">
                <div class="uphead_img">

                    <div class="uphead_lt">
                        <form id="imgForm" method="post" enctype="multipart/form-data">
                            <a href="javascript:void(0);" class="a-upload">
                                <input type="file" id="inputImage" name="file" accept="image/*"
                                       onchange="showImg(this)">
                                <em></em>
                                上传头像
                            </a>
                            <input type="hidden" name="sts" value="e40e7004-4c8a-4963-8564-31271a8337d8">
                        </form>
                        <!-- <p><em></em>上传头像</p> -->
                        <h2>请选择一张您电脑中的图片，支持JPG、PNG或JPEG图片类型，图片大小不能大于4M</h2>
                    </div>



                    <div class="img-container" style="display: none">
                        <img id="image" src="" alt="Picture">
                    </div>
                </div>

                <div class="uphead_c"></div>

                <div class="uphead_rt">
                    <div>
                        <p><strong>效果预览</strong></p>
                        <div style="width:260px; font-size: 13px;color: #B0B0B0;">你上传的图片会自动生成2种尺寸，请注意小尺寸的头像是否清晰</div>
                    </div>

                    <div style="width: 100%;height: 100%;">

                        <div class="img-preview preview-md">
                            <img src="" style="display: none; width: 126.712px;
                            height: 125px; min-width: 0px !important; min-height: 0px !important; max-width:
                            none !important; max-height: none !important; margin-left: -13.3562px; margin-top:
                            -12.5px; transform: none;">
                            <div style="margin-top:40%">没有预览</div>
                        </div>
                        <p style="font-size:9px;color:#B0B0B0;">100×100</p>

                        <div class="img-preview preview-sm" style="width: 50px; height: 50px;">
                            <img src="" style="display: none; width: 63.3562px;
                             height: 62.5px; min-width: 0px !important; min-height: 0px !important; max-width: none
                             !important;  max-height: none !important; margin-left: -6.67808px; margin-top: -6.25px;
                              transform: none;">
                            <div style="margin-top:40%">没有预览</div>
                        </div>
                        <p style="font-size:9px;color:#B0B0B0;">50×50</p>

                    </div>

                </div>

                <div class="uphead_back" onclick="toggleHeadSet();" onmouseover="this.style.background='#f7f7f7'"
                     onmouseout="this.style.background='#fff'" title="返回" style="background: rgb(255, 255, 255);">
                    <div><img src="${pageContext.request.contextPath}/images/permsg/img_2.png"></div>
                </div>
            </div>

            <div class="uphead_btn">
                <p id="uploadImg" onmouseover="this.style.background='#FF3030'"
                   onmouseout="this.style.background='#c9c9c9'" onclick="uploadimg()" style="background:
                   rgb(201, 201, 201);">保存</p>
                <p id="cancelImg" onclick="cancelimg()">取消</p>
            </div>

        </div>



    </div>

</div>
</div>

<script>
    //左侧导航栏切换display效果
    var acc = document.getElementsByClassName("clearfix1");
    var i;

    //alert(acc.length)
    for (i = 0; i < acc.length; i++) {
        acc[i].onclick = function() {

            var panel = this.nextElementSibling;
            while(panel != null)
            {
                //console.log(panel);
                //console.log(panel.style.cssText);
                if(panel.style.cssText == 'display: none;'){
                    panel.style.cssText = 'display: block;';

                }
                else if(panel.style.cssText == 'display: block;') {
                    panel.style.cssText = 'display: none;';
                }
                panel = panel.nextElementSibling;
            }

        }
    }

</script>


</body>
</html>