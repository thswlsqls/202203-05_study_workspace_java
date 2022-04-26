<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="controller?cmd=guestBookWrite" method="post">
		제목: <input type="text" name="title"><br>
		내용: <textarea rows="10" cols="22" name="content"></textarea>
		<input type="submit" value="작성완료">
	</form>
	<a href="controller?cmd=guestBookList">목록보기</a>

	<%
	if(request.getAttribute("isRequestSuccess")=="false"){
		out.println("<script>alert('방명록 등록에 실패했습니다.')</script>");
	}
	%>
</body>
</html>