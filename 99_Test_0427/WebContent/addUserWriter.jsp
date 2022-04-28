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
	<h1>방명록작성</h1>
	<form action="controller?cmd=addUserWriter" method="post">
		글 비밀번호:<input type="password" name="writerPw" required="required"><br>
		내용:<textarea type="text" name="contents" required="required"></textarea><br>
		<input type="submit" value="방명록작성">
	</form>
</body>
</html>
