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
	<h1>새 방명록 등록</h1>
	<form action="controller?cmd=addVisitor" method="post">
		내용: <textarea name="contents" rows="10" cols="20"></textarea><br>
		글비밀번호:<input type="password" name="pw">	
		<input type="submit" value="등록하기">
	</form>
</body>
</html>