<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>시작페이지</h1>
<%@include file ="menu.jsp" %>
<c:if test="${empty id}">
<form action="controller?cmd=loginAction" method="post">
ID <input name="id" required="required"><br>
PW <input type="password" name="pw" required="required"><br>
<input type="submit" value="로그인">
<input type="button" value="회원가입" onclick="location.href='controller?cmd=signupUI'">
</form>
</c:if>

</body>
</html>