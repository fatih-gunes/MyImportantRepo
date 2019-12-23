<%--
  Created by IntelliJ IDEA.
  User: fatih
  Date: 23.10.2019
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> Spring REST Demo </h3>

<hr>

<a href="${pageContext.request.contextPath}/test/hello">Hello</a>
<br> <br>

<a href="${pageContext.request.contextPath}/api/students">Get All Students</a>



</body>
</html>
