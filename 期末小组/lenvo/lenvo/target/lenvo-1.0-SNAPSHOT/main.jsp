<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>商城</title>
    <link rel = "stylesheet" href = "${pageContext.request.contextPath}/css/main.css">
    <link rel= "stylesheet" href = "${pageContext.request.contextPath}/css/reset.css">
    <link rel="stylesheet" href="https://g.alicdn.com/thx/cube/1.3.2/cube.min.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</head>
<body>
<div class="header">
    <div class="wrap">
        <ul class="header-left">
            <li><a href="#">MIUI</a><span>|</span></li>
            <li><a href="#">loT</a><span>|</span></li>
            <li><a href="#">云服务</a><span>|</span></li>
            <li><a href="#">天星科技</a><span>|</span></li>
            <li><a href="#">有品</a><span>|</span></li>
            <li><a href="#">小爱开放平台</a><span>|</span></li>
            <li><a href="#">企业团购</a><span>|</span></li>
            <li><a href="#">资质证照</a><span>|</span></li>
            <li><a href="#">联想商城</a><span>|</span></li>
            <li>
                <a href="#">下载app</a><span>|</span>
                <div class="download">
                    <a href="#">
                        <img src="${pageContext.request.contextPath}/images/main/二维码.jpg" alt="">
                        <p>
                            商城app
                        </p>
                    </a>
                </div>
                <div class="triangle">

                </div>

            </li>
            <li><a href="#">智能生活</a><span>|</span></li>
            <li><a href="#">Select Location</a><span>|</span></li>
            <li><a href="#">协议规则</a><span>|</span></li>
        </ul>
        <ul class="header-right">
            <li><a href="${pageContext.request.contextPath}/login.jsp">登录</a><span>|</span></li>
            <li><a href="${pageContext.request.contextPath}/register.jsp">注册</a><span>|</span></li>
            <li><a href="#">消息通知</a><span>|</span></li>
            <li class="cart">
                <a href="${pageContext.request.contextPath}/car/clickcar.action">购物车</a><span>|</span>
                <div class = "cart-list">
                    购物车中还没有物品，赶快添加吧
                </div>

            </li>
        </ul>
    </div>
</div>
<div class="nav">
    <div class="wrap">
        <div class="logo">
            <a href="#"><img src="${pageContext.request.contextPath}/images/main/联想logo.png" alt=""></a>
        </div>
        <div class="nav-bar">
            <ul>
                <li>
                    <a href="#">联想电脑</a>
                    <div class="nav-bar-list">
                        <div class="wrap">
                            <ul>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                            <p>联想小新pro14</p>
                                            <p>4999元</p>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li>
                    <a href="#">Redmi 红米</a>
                    <div class="nav-bar-list">
                        <div class="wrap">
                            <ul>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>小新air</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>小新air</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>小新air</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>小新air</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>小新air</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li>
                    <a href="#">电视</a>
                    <div class="nav-bar-list">
                        <div class="wrap">
                            <ul>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                            </divs/小新air.jpg联想小新pro14</p>
                                            <p>4999元</p>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                            </divs/小新air.jpg联想小新pro14</p>
                                            <p>4999元</p>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li>
                    <a href="#">笔记本</a>
                    <div class="nav-bar-list">
                        <div class="wrap">
                            <ul>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li>
                    <a href="#">平板</a>
                    <div class="nav-bar-list">
                        <div class="wrap">
                            <ul>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li>
                    <a href="#">家电</a>
                    <div class="nav-bar-list">
                        <div class="wrap">
                            <ul>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li>
                    <a href="#">路由器</a>
                    <div class="nav-bar-list">
                        <div class="wrap">
                            <ul>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/联想小新pro14.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li>
                    <a href="#">智能硬件</a>
                    <div class="nav-bar-list">
                        <div class="wrap">
                            <ul>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="nav-img-box">
                                            <img src="./images/小新air.jpg" alt="">
                                        </div>
                                        <p>联想小新pro14</p>
                                        <p>4999元</p>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </li>
                <li>
                    <a href="#">服务</a>
                </li>
                <li>
                    <a href="#">社区</a>
                </li>
            </ul>
        </div>
        <div class="search">
            <input type="text" placeholder="小米手机">
            <button type="submit" class="iconfont">
                <a href = "javascript:search()">&#xe63d;</a>

            </button>

        </div>
    </div>
</div>
<div class="banner">
    <div class="wrap">
        <div class="banner-box">
            <img src="${pageContext.request.contextPath}/images/main/轮播图1.jpg" alt="">
            <div class="slide">
                <ul>
                    <c:forEach items="${list}" var = "p1">
                        <li>
                            <a href="#">${p1.father.name}</a><i>></i>
                            <div class="slide-list">
                                <ul>
                                <c:forEach items="${p1.children}" var = "p2">
                                <li>
                                    <a href="javascript:product(${p2.id})">
                                    <img src="${pageContext.request.contextPath}/images/product/${p2.url}.jpg" alt="">
                                    <span>${p2.name}</span>
                                    </a>
                                </li>
                                </c:forEach>
                                 </ul>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
</div>
<%--<div class="adv">--%>
<%--    <div class="wrap">--%>
<%--        <div class="adv-aside">--%>
<%--            <ul>--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="iconfont">&#xe733</i>--%>
<%--                        <p>米粉卡</p>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="iconfont">&#xe733</i>--%>
<%--                        <p>米粉卡</p>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="iconfont">&#xe733</i>--%>
<%--                        <p>米粉卡</p>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="iconfont">&#xe733</i>--%>
<%--                        <p>米粉卡</p>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="iconfont">&#xe733</i>--%>
<%--                        <p>米粉卡</p>--%>
<%--                    </a>--%>
<%--                </li>--%>
<%--                <li>--%>
<%--                    <a href="#">--%>
<%--                        <i class="iconfont">&#xe733</i>--%>
<%--                        <p>粉丝卡</p>--%>
<%--                    </a>--%>
<%--                </li>s--%>
<%--            </ul>--%>

<%--        </div>--%>
<%--        <div class="adv-img">--%>
<%--            <a href="#">--%>
<%--                <img src="./images/广告1.jpg" alt="">--%>
<%--            </a>--%>
<%--        </div>--%>
<%--        <div class="adv-img"> <a href="#">--%>
<%--            <img src="./images/广告1.jpg" alt="">--%>
<%--        </a></div>--%>
<%--        <div class="adv-img">--%>
<%--            <a href="#">--%>
<%--                <img src="./images/广告1.jpg" alt="">--%>
<%--            </a>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
</body>
<script type="text/javascript">
    function product(id){
        var str ="?id="+id;
        location.href = "${pageContext.request.contextPath}/product/queryProduct.action" + str ;
    }
    function search(str){
        var str = "?"
    }

</script>
</html>
