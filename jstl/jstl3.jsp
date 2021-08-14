<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>forEach標籤</title>
</head>
<body>
    <%--
    forEach使用
        begin:開始
        end:結束
        var:臨時變量
        step:步長
        varStatus:循環狀態對象
            index:容器中元素的索引從0開始
            count:循環次數從1開始
    變歷容器List
        items:容器對象
    --%>
<%--    <c:forEach begin="1" end="10" var="i" step="2">--%>
    <c:forEach begin="1" end="10" var="i" step="2" varStatus="s">
        ${i}
        ${s.index}
        ${s.count}
    </c:forEach>
    <hr>
    <%
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        request.setAttribute("list",list);
    %>
    <c:forEach items="${list}" var="str" varStatus="s">
        ${s.index}---${s.count}---${str}<br>
    </c:forEach>


</body>
</html>
