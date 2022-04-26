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
	<form action="controller?cmd=login" method="post">
		로그인 ID <input name="id"><br>
		로그인 PW <input name="pw" type="password"><br>
		<input type="submit" value="로그인">
	</form>

		<%
		if(request.getAttribute("isRequestSuccess")=="false"){
			out.println("<script>alert('로그인에 실패했습니다.')</script>");
		}
		session.setAttribute("id", request.getAttribute("id"));
		session.setAttribute("pw", request.getAttribute("pw"));
		session.setAttribute("name", request.getAttribute("name"));
		session.setAttribute("email", request.getAttribute("email"));
		session.setAttribute("emailDomain", request.getAttribute("emailDomain"));
		session.setAttribute("studentNumber", request.getAttribute("studentNumber"));
		session.setAttribute("phone", request.getAttribute("phone"));
		session.setAttribute("gender", request.getAttribute("gender"));
		session.setAttribute("hobbyList", request.getAttribute("hobbyList"));
		session.setAttribute("birthday", request.getAttribute("birthday"));
		%>
</body>
</html>