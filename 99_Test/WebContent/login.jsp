<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="controller?cmd=login" method="post">
		로그인ID <input type="text" name="userId"><br>
		로그인PW <input type="text" name="pw">	<br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>