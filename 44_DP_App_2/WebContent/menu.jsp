<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table>
	<tr>
		<td><a href="controller?cmd=main"> home </a></td>
		<c:choose>
			<c:when test="${empty userId}">
				<td><a href="controller?cmd=loginUI"> 로그인 </a></td>
				<td><a href="controller?cmd=signupUI"> 회원가입 </a></td>
			</c:when>
			<c:otherwise>
				<td><a href="controller?cmd=logout"> 로그아웃 </a></td>
			</c:otherwise>
		</c:choose>
		<td><a href="controller?cmd=guestBookList"> 방명록 </a></td>	
	</tr>
	<tr>
		<td><a href="controller?cmd=main"> home </a></td>
		<c:if test="${empty loginOK}">
			<td><a href="controller?cmd=loginUI"> 로그인 </a></td>
			<td><a href="controller?cmd=signupUI"> 회원가입 </a></td>
		</c:if>
		<c:if test="${loginOK != null}">
			<td><a href="controller?cmd=logout"> 로그아웃 </a></td>
		</c:if>
		<td><a href="controller?cmd=guestBookList"> 방명록 </a></td>
	</tr>
</table>
