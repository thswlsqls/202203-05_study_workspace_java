<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="controller?cmd=main">home</a>
	<c:choose>
		<c:when test="${empty userId}">
				<a href="controller?cmd=loginUI">로그인</a>
				<a href="controller?cmd=signupUI">회원가입</a>
		</c:when>
		<c:otherwise>
			<a href="controller?cmd=logout">로그아웃</a>		
			<a href="controller?cmd=addUserWriterUI">방명록작성</a>
		</c:otherwise>
	</c:choose>
</body>
</html>