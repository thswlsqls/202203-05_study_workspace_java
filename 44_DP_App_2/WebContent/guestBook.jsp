<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	제목: ${title}<br>	
	작성자: ${writer} &nbsp&nbsp 작성일자: ${inDate}<br>
	내용: ${content}<br>
	<c:if test="${userId eq writer}">
		<a href="controller?cmd=guestBookUpdateUI">수정하기</a>
		<a href="controller?cmd=guestBookDelete">삭제하기</a>
	</c:if>
	<a href="controller?cmd=guestBookList">목록보기</a>
</body>
</html>