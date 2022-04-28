<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	let inputWriterPw = document.getElementById('inputWriterPw').value;
</script>
<body>
<%@ include file="menu.jsp" %>
	<h1>방명록상세</h1>
	작성자아이디:${uw.userId}<br>
	작성자이름:${uw.writerName}<br>
	내용:${uw.contents}<br>
	생성일자:${uw.writerDate}<br>
	
	<c:if test="${userId eq uw.userId}">
		<form action="controller?cmd=deleteWriter&userWriterNo=${uw.userWriterNo}" method="post">
		글비밀번호:<input type=text name="inputWriterPw">
			<input type="submit" value="삭제">
			<br>
			<input type="submit" value="수정하기" formaction="controller?cmd=updateWriterUI&userWriterNo=${uw.userWriterNo}">
		</form>
	</c:if>
	
</body>
</html>