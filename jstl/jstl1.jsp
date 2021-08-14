<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if標籤</title>
</head>
<body>

    <%--
    c:if標籤
    1.屬性:
      * test 必須屬性,接受boolean表達式
        如果表達式為true則顯示if標籤體內容,如果為false則不顯示
        一般情況下test屬性會結合EL表達式使用
    --%>
    <c:if test="true">
        <h1>我是真</h1>
    </c:if>
    <hr>
    <%
        //判斷request域中的一個list集合是否為空
        List list = new ArrayList();
        list.add("aaaa");
        request.setAttribute("list",list);
        request.setAttribute("number",4);
    %>
    <c:if test="${not empty list}">
        遍歷集合...
    </c:if>
    <hr>
    <c:if test="${number % 2 != 0}">
        ${number}為奇數
    </c:if>
    <c:if test="${number % 2 == 0}">
        ${number}為偶數
    </c:if>
</body>
</html>
