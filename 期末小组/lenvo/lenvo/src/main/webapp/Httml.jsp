<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bootstrap5 实例</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/5.1.1/js/bootstrap.bundle.min.js"></script>

    <link href="${pageContext.request.contextPath}/style.css" rel="stylesheet">
    <script src="../../scripts/main.js" defer></script>
</head>


<body style="height:1000px">


<!--固定头部导航栏-->
<div class="container">
    <nav class="navbar navbar-expand-sm bg-light navbar-light fixed-top">

        <!--前面一堆文字-->
        <div class="logo__text">
            <ul class="navbar-nav">
                <a class="navbar-brand" href="#">
                    <img decoding="async" src="../../images/logo.png" alt="Logo" style="width:120px;">
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
                <h3 class="clearfix"><span>账户中心</span><i class="user_up"></i></h3>
                <ul style="display: block;">
                    <li class="red_bg"><a
                            href="https://i.lenovo.com.cn/info/userinfo.jhtml?sts=e40e7004-4c8a-4963-8564-31271a8337d8"
                            mcode="611f8c79c4dc">个人信息</a></li>
                </ul>
                <ul style="display: block;">
                    <li>
                        <a href="https://i.lenovo.com.cn/changepass/indexPage.jhtml?sts=e40e7004-4c8a-4963-8564-31271a8337d8"
                           mcode="b472d7371a91">修改密码</a></li>
                </ul>
                <ul style="display: block;">
                    <li><a href="https://i.lenovo.com.cn/third/bind.jhtml?sts=e40e7004-4c8a-4963-8564-31271a8337d8"
                           mcode="10c210c70d72">账户绑定</a></li>
                </ul>
            </div>
            <div class="user_list">
                <h3 class="clearfix"><span>订单中心</span><i class="user_down"></i></h3>
                <ul style="display: none;">
                    <li><a href="https://buy.lenovo.com.cn/quotation/index.html" mcode="d62a49b752df">我的报价</a></li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://buy.lenovo.com.cn/order/index.html" mcode="de2d855aafa7">我的订单</a></li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://shop.lenovo.com.cn/mycenter/ucenter-comment.html" mcode="b7d8746a5d6f">评价晒单</a>
                    </li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://c.lenovo.com.cn/tucao/lenovo/mytucao.html" mcode="fb47bb1bc927">我的吐槽</a></li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://buy.lenovo.com.cn/getListPageNew.jhtml" mcode="f212417cda71">收货地址</a></li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://buy.lenovo.com.cn/invoice/lenovopc.html" mcode="6001282a2c22">发票抬头管理</a></li>
                </ul>
                <ul style="display: none;">
                    <li>
                        <a href="https://i.lenovo.com.cn/favorite/myFavorite.jhtml?sts=e40e7004-4c8a-4963-8564-31271a8337d8"
                           mcode="7e209107c62c">我的收藏</a></li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://i.lenovo.com.cn/booking/list.jhtml?sts=e40e7004-4c8a-4963-8564-31271a8337d8"
                           mcode="8057f5d860d3">我的预约</a></li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://buy.lenovo.com.cn/center/returnlist.jhtm?merchantId=1" mcode="88ce27b1f0ce">我的退换货</a>
                    </li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://buy.lenovo.com.cn/center/zc/orderlist.jhtm?merchantId=1" mcode="0f925bcee039">我的众筹</a>
                    </li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://shop.lenovo.com.cn/mycenter/tryout.html" mcode="sfbtdcefs668">我的试用</a></li>
                </ul>
            </div>
            <div class="user_list">
                <h3 class="clearfix"><span>我的信箱</span><i class="user_down"></i></h3>
                <ul style="display: none;">
                    <li>
                        <a href="https://i.lenovo.com.cn/internal/msg/list.jhtml?sts=e40e7004-4c8a-4963-8564-31271a8337d8"
                           mcode="dfff3c6a9652">我的消息</a></li>
                </ul>
            </div>
            <div class="user_list">
                <h3 class="clearfix"><span>资产中心</span><i class="user_down"></i></h3>
                <ul style="display: none;">
                    <li><a href="https://shop.lenovo.com.cn/mycenter/virtualcoin.html?shopId=1" mcode="e7bfdcefs232">我的代金券</a>
                    </li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://i.lenovo.com.cn/ledou/list.jhtml?sts=e40e7004-4c8a-4963-8564-31271a8337d8"
                           mcode="f1854ebdffb0">我的乐豆</a></li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://shop.lenovo.com.cn/mycenter/enterprise_integration.html" mcode="35aa44046529">我的企业积分</a>
                    </li>
                </ul>
                <!--<ul>
                    <li><a href="https://shop.lenovo.com.cn/consumptionPoint/list.html" mcode="3731e44c4f07">我的消费积分</a></li>
                </ul> -->
                <ul style="display: none;">
                    <li><a href="https://shop.lenovo.com.cn/mycenter/mycoupon.html" mcode="4306e221ef3e">我的优惠券</a></li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://shop.lenovo.com.cn/mycenter/win.html" mcode="e7bfdcee4d21">我的奖品</a></li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://shop.lenovo.com.cn/mycenter/coupon.html" mcode="7a1ea57200dc">领券中心</a></li>
                </ul>
            </div>
            <div class="user_list">
                <h3 class="clearfix"><span>我的合伙人</span><i class="user_down"></i></h3>
                <ul style="display: none;">
                    <li>
                        <a href="https://i.lenovo.com.cn/c2cuser/c2ccenetr.jhtml?sts=e40e7004-4c8a-4963-8564-31271a8337d8"
                           mcode="5914638aea3d">账户信息</a></li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://buy.lenovo.com.cn/reward/recommendedQuery.jhtm" mcode="19664bb6541c">我的推广</a>
                    </li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://buy.lenovo.com.cn/reward/partnerUserEquityPointQuery.jhtm"
                           mcode="39db16a74520">我的权益点</a></li>
                </ul>
                <ul style="display: none;">
                    <li><a href="https://buy.lenovo.com.cn/reward/exchangeQuery.jhtm" mcode="acdea5e49878">我的兑换</a></li>
                </ul>
            </div>
        </div>

    </div>

    <!-- 右侧个人资料 -->
    <div class="msg_right">
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
                            <a href="https://reg.lenovo.com.cn/registpage/pc/enterprisereg.html" class="msg_toRegist">升级为企业会员
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
                                onmouseout="this.style.background='#c9c9c9'" style="font-size: 14px;cursor: pointer;">
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


</div>

</body>
</html>
