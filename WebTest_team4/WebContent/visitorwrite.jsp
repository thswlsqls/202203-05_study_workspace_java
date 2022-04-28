<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<%@include file ="menu.jsp" %>
<h1>방명록작성</h1>
<form onsubmit="return pwCheck(this)" action="controller?cmd=visitorwriteAction" method="post">
id : ${id }<br>
write pw : <input type="password" name="pw" required="required"><br>
<textarea rows="20" cols="40" name="contents"></textarea>
<input type="submit" value="글 작성">
<input type="button" value="취소" onclick="location.href='controller?cmd=main'">
</form>
</body>
</html>