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
	<h1>방명록수정</h1>
	<form action="controller?cmd=updateWriter&userWriterNo=${uw.userWriterNo}" method="post">
		작성자아이디:${uw.userId}<br>
		작성자이름:${uw.writerName}<br>
		생성일자:${uw.writerDate}<br>
		글밀번호확인: <input type="password" name="inputWriterPw"><br>
		내용수정: <textarea type="text" name="updateContents">${uw.contents}</textarea><br>
	<input type="submit" value="방명록수정">
	
</body>
</html>