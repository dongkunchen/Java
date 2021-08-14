<%@ page import="tw.dongkun.domain.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: IG26
  Date: 2021/7/30
  Time: 下午 01:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el獲取數據</title>
</head>
<body>
    <%
        User user = new User();
        user.setName("張三");
        user.setAge(23);
        user.setBirthday(new Date());
        request.setAttribute("u",user);
    %>
${requestScope.u.name}<br>
${requestScope.u.age}<br>
${requestScope.u.birStr}<br>
</body>
</html>
