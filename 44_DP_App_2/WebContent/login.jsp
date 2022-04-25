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
		로그인 ID <input name="id"><br>
		로그인 PW <input name="pw" type="password"><br>
		<input type="submit" value="로그인">
	</form>

		<%
		if(request.getAttribute("isRequestSuccess")=="false"){
			out.println("<script>alert('로그인에 실패했습니다.')</script>");
		}
		%>
</body>
</html>