<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="javascript:click()">
    测试
    </a>
 <c:forEach items="${pageinfo.list}" var="p">
     <p>${p.url}</p>
 </c:forEach>
</body>
<script type="text/javascript">
    function click(){
        location.href="${pageContext.request.contextPath}/car//clickcar.action";
    }
</script>
</html>
