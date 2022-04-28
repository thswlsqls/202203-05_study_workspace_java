<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<h1>방명록 상세</h1>
	작성자아이디: ${v.memberId}<br>
	내용: ${v.contents}<br>
	작성일자: ${v.writerDate}<br>
	<c:if test="${memberId eq v.memberId}">
		<form action="controller?cmd=deleteVisitor&visitorSeq=${v.visitorSeq}" method="post">
		글비밀번호확인 :<input type="password" name="inputPw">
		<input type="submit" value="삭제"><br>
		<input type="submit" value="수정하기" 
		formaction="controller?cmd=updateVisitorUI&visitorSeq=${v.visitorSeq}">
	</form>
	</c:if>
</body>
</html>

