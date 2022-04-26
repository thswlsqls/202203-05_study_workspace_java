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
	<c:if test="${empty loginOK}">
		<script>
			alert('회원전용 페이지입니다. 로그인하세요.');
			location.href="controller?cmd=loginUI"; 
		</script>
	</c:if>
	<%@ include file="menu.jsp" %>
	<h1>${userId}님 반갑습니다.</h1>
	<br>
	id: ${id}<br>
	pw: ${pw}<br>
	name: ${name}<br>
	email: ${email}<br>
	student_id: ${studentNumber}<br>
	phone_number: ${phone}<br>
	gender: ${gender}<br>
	hobby: 
	<c:forEach var="h" items="${hobbyList}">
		<c:out value="${h}"/>
	</c:forEach><br>
	birthday: ${birthday}<br>
	<a href="controller?cmd=logout">로그아웃</a>
	</br>
	</br>
	<table>
		<tr><th colspan="4">방명록</th></tr>
		<tr>
			<th>번호</th>
			<th>작성자아이디</th>
			<th>제목</th>
			<th>작성일</th>			
		</tr>
		<c:forEach var="gb" items="${gbList}" varStatus="status">
		<tr onclick="location.href='./controller?cmd=guestBookUI&guestNo=${gb.guestNo}'">
			<td><c:out value="${status.index+1}"></c:out></td>
			<td><c:out value="${gb.userId}"></c:out></td>
			<td><c:out value="${gb.title}"></c:out></td>
			<td><c:out value="${gb.inDate}"></c:out></td>
		</tr>
		</c:forEach>
	</table>
	<button onclick="location.href='./controller?cmd=guestBookWriteUI'">작성하기</button>
</body>
</html>

