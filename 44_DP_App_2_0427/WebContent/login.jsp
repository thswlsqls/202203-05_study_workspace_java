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
<form action="controller?cmd=loginAction" method="post">

로그인 ID <input name="id"><br>
로그인 PW <input name="pw"><br>

<input type="submit" value="로그인"> 

</form>

</body>
</html>