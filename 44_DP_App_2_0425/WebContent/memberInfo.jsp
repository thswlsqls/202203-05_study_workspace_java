<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${empty loginOK}">
	<script>
		alert('회원 전용 페이지입니다. 로그인 하세요.');
		location.href="controller?cmd=loginUI"; // 주소창 -> request
	</script>
</c:if>
    
    <h1>회원 전용 페이지 입니다..</h1>
    
    ${loginOK}님 환영합니다. <a href="controller?cmd=LogoutAction">로그아웃</a>
    