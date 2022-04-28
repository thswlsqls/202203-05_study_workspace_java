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
<h1>회원 전용 페이지</h1><br>
<h3>환영합니다 ${id}님!!</h3><br>
이름 : ${name }<br>
<c:forEach items="${memberInfo}" var="m">
성별 : ${m.getMemberGender()}<br>
취미 : ${m.getMemberHobby()}<br>
혈액형 : ${m.getMemberBlood()}<br>
</c:forEach>

</body>
</html>