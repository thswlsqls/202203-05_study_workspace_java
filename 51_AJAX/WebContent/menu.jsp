<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<a href="controller?cmd=main">메인페이지</a> 
<c:if test="${ empty loginOK }">
<a href="controller?cmd=loginUI">로그인</a> 
<a href="controller?cmd=addUserUI">회원가입</a> 
</c:if>
<c:if test="${ not empty loginOK }">
<a href="controller?cmd=logoutAction">로그아웃</a>
<a href="userPage.jsp">회원페이지</a>
</c:if>

