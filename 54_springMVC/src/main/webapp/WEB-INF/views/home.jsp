<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  ${user }
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="loginUI">로그인</a>
</body>

</html>
