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
	<h1>사용자메인</h1>
	아이디: ${userId}<br> 
	비밀번호: ${pw}<br>
	이름: ${name}<br>
	생성일자: ${inDate}<br>
	
	<br>
	
	<h1>방명록</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>작성자아이디</th>
			<th>작성자이름</th>
			<th>생성일자</th>
		</tr>
		
		<c:forEach items="${uwList}" var="uw" varStatus="status" >
			<tr onclick="location.href='./controller?cmd=userWriterUI&userWriterNo=${uw.userWriterNo}'">
				<td>${status.index+1}</td>
				<td>${uw.userId}</td>
				<td>${uw.writerName}</td>
				<td>${uw.writerDate}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>