<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel = "stylesheet" href = "${pageContext.request.contextPath}/css/product.css">
    <link rel= "stylesheet" href = "${pageContext.request.contextPath}/css/reset.css">
    <title>商品详情页</title>
</head>
<body>
<div class="left">
    <img src="${pageContext.request.contextPath}/images/product/${product.url}.jpg" alt="">
</div>
<div class="right">
    <p class="p1">${product.name}</p>
    <p class="p2">${product.discription}</p>
    <tr>
        <c:if test="${product.discount}" >
        <td class="discount">折扣：${product.discount}折</td>
        </c:if>
        <td>单价:${product.price*product.discount/10}</td>
    </tr>
    <p></p>
    <tr>
        <td><input type="number " name="pnum" value=1></td>
        <td>库存:${product.stock}件</td>
    </tr>
    <p></p>
    <tr>
        <a href="javascript:submit()">加入购物车</a>
    <tr>

</div>
<div class="right">


</div>
</body>
<script type="text/javascript">
    function submit(){

    }
</script>
</html>
