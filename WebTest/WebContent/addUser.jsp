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
		id:<input type="text" name="userId"><br>
		name:<input type="text" name="name"><br>
		pw1:<input type="password" name="pw1"><br>
		pw2:<input type="password" name="pw2"><br>	
		gender:<input type="radio" name="gender" value="m">남	
		<input type="radio" name="gender" value="f">여<br>	
		<input type="checkbox" name="hobby" value="reading">독서
		<input type="checkbox" name="hobby" value="cooking">요리
		<input type="checkbox" name="hobby" value="watchingMovie">영화감상<br>
		<select name="blood">
			<option value="A">A</option>
			<option value="B">B</option>
			<option value="O">O</option>
			<option value="AB">AB</option>
		</select><br>
		<input type="submit" value="회원가입">
		<input type="submit" value="취소" formaction="controller?cmd=main">
	</form>
</body>
</html>