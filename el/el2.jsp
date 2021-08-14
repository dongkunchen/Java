<%--
  Created by IntelliJ IDEA.
  User: IG26
  Date: 2021/7/30
  Time: 下午 01:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>獲取域中的數據</title>
</head>
<body>
    <%
        request.setAttribute("name","張三");
        request.setAttribute("age",20);
    %>
<h3>el獲取值</h3>
${requestScope.name}
${requestScope.age}
</body>
</html>
