<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><c:out value="${book.title}"></c:out> </h1>
	<p>Description: <c:out value="${book.description}"></c:out> </p>
	<p>Language: <c:out value="${book.language}"></c:out> </p>
	<p>Number of Pages: <c:out value="${book.numberOfPages}"></c:out> </p>
</body>
</html>


