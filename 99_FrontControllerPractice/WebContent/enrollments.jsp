<%@page import="com.ucamp.model.EnrollmentVO"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<% 
	session.setAttribute("enrollments", request.getAttribute("enrollments")); 
%>

<div style="margin-top: 100px;"><h2>수강신청정보</h2></div>
이름 : <strong>${name}</strong> <br><br>
<table width = 400px; height=300px; border="2px" style="margin-left: auto; margin-right: auto;">
	<tr style="text-align: center; font-weight: bolder;">
		<th width = 150px height=50px>강좌번호</th>
		<th width = 150px>학생번호</th>
		<th width = 150px>수강신청일</th>
		<th width = 150px>성적</th>
	</tr>
	<tr>
		<c:forEach var="e" items="${enrollments}">
			<tr>
				<td><c:out value="${e.lcode}"/></td>
				<td><c:out value="${e.scode}"/></td>
				<td><c:out value="${e.edate}"/></td>
				<td><c:out value="${e.grade}"/></td>
			</tr>
		</c:forEach>
	</tr>

</table>
	<br>
	<input type="button" value="뒤로가기" onclick="location.href='javascript:history.back();'">
</body>
</html>