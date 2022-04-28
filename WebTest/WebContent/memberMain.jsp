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
	<h1>${loginMember.memberId}님 환영합니다.</h1>
	아이디: ${loginMember.memberId}<br>
	이름: ${loginMember.name}<br>
	성별:  <c:choose>
			<c:when test="${loginMember.gender eq 'm'}">
				남
			</c:when>
			<c:otherwise>
				여
			</c:otherwise>
		  </c:choose><br>
	취미: ${loginMember.hobby}<br>
	혈액형: ${loginMember.blood}<br>	
	
</body>
</html>