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
<table>
	<tr>
		<td><a href="controller?cmd=main">home</a></td>
		<td><a href="controller?cmd=visitorwritelistUI">방명록리스트</a></td>
		<c:if test="${empty id}">
		<td><a href="controller?cmd=signupUI">회원가입</a></td>
		</c:if>
		<c:if test="${id!=null}">
		<td><a href="controller?cmd=userpageUI">마이페이지</a></td>
		<td><a href="controller?cmd=visitorwriteUI">방명록작성</a></td>
		</c:if>
	</tr>
</table>

<c:if test="${id!=null}">
환영합니다 ${id}님!! <input type="button" value="로그아웃" onclick="location.href='controller?cmd=logoutAction'">
</c:if>
</body>
</html>