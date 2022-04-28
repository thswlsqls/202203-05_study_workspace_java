<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MAIN</h1>
	<%@ include file="menu.jsp" %>
	<a href="controller?cmd=loginUI">로그인</a><br>
	<a href="controller?cmd=signupUI">회원가입</a><br>

</body>
</html>