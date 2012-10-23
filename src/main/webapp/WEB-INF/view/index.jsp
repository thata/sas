<%@page pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.example.sample.sas.entity.User" %>
<html>
<head>
<title>Sample</title>
</head>
<body>
Hello!
<ul>
<c:forEach var="user" items="${users}">
<li>${user.name}</li>
</c:forEach>
</ul>
Books
<ul>
<c:forEach var="book" items="${books}">
<li>${book.name}</li>
</c:forEach>
</ul>
</body>
</html>
