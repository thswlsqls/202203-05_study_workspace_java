<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="missionLoginAction" method="post">
		로그인 ID <input name="id"><br>
		로그인 PW <input name="pw" type="password"><br>
		<input type="submit" value="로그인">
	</form>
	<%
		application.setAttribute("id", request.getAttribute("id"));
		application.setAttribute("pw", request.getAttribute("pw"));
		application.setAttribute("name", request.getAttribute("name"));
		application.setAttribute("email", request.getAttribute("email"));
		application.setAttribute("emailDomain", request.getAttribute("emailDomain"));
		application.setAttribute("studentNumber", request.getAttribute("studentNumber"));
		application.setAttribute("phone", request.getAttribute("phone"));
		application.setAttribute("gender", request.getAttribute("gender"));
		application.setAttribute("hobbyList", request.getAttribute("hobbyList"));
		application.setAttribute("birthday", request.getAttribute("birthday"));
	%>
</body>
</html>