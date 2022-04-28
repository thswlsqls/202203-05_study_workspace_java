<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<h1>회원가입</h1>
<form action="controller?cmd=addUser" method="post">
	아이디:<input type="text" name="userId" required="required"><br>
	비밀번호:<input type="password" name="pw" required="required"><br>
	비밀번호확인:<input type="password" required="required"><br>
	이름:<input type="text" name="name" required="required"><br>
	<input type="submit" value="회원가입">
</form>

</body>
</html>