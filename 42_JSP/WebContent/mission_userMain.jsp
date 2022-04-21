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
	<h1>${id}님 반갑습니다.</h1>
	
	<br>
	id: ${id}<br>
	pw: ${pw}<br>
	name: ${name}<br>
	email: ${email}${emailDomain}<br>
	student_id: ${studentNumber}<br>
	phone_number: ${phone}<br>
	gender: ${gender}<br>
	hobby: 
	<c:forEach var="h" items="${hobbyList}">
		<c:out value="${h}"/>
	</c:forEach><br>
	birthday: ${birthday}<br>
</body>
</html>