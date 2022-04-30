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
	<h1>로그인</h1>
	<form action="controller?cmd=login" method="post">
		id:<input type="text" name="memberId" ><br>
		pw:<input type="password" name="pw"><br>
		<input type="submit" value="로그인">
		<input type="submit" value="취소" formaction="controller?cmd=main">
	</form>
</body>
</html>