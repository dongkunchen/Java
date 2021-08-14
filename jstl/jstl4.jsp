<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="tw.dongkun.domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>練習</title>
</head>
<body>
    <%
        List list = new ArrayList();
        list.add(new User("zhangsan",20,new Date()));
        list.add(new User("lisi",21,new Date()));
        list.add(new User("wangwu",22,new Date()));
        request.setAttribute("list",list);
    %>
<table border="1" width="500" align="center">
    <tr>
        <th>編號</th>
        <th>姓名</th>
        <th>年齡</th>
        <th>生日</th>
    </tr>
    <%--數據展示--%>
    <c:forEach items="${list}" var="user" varStatus="s">
        <c:if test="${s.count % 2 == 0}">
            <tr bgcolor="#faebd7">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:if>
        <c:if test="${s.count % 2 != 0}">
            <tr bgcolor="#7fffd4">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>
