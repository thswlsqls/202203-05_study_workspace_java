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
session.setAttribute("lectures", request.getAttribute("lectures")); 
System.out.println(request.getAttribute("lectures"));
%>


<div style="margin-top: 100px;"><h2>개설강좌정보</h2></div>
이름 : <strong>${name}</strong> <br><br>
<table width = 600px; height=300px; border="2px" style="margin-left: auto; margin-right: auto;">
	<tr style="text-align: center; font-weight: bolder;">
		<th width = 100px height=50px>강좌번호</th>
		<th width = 100px>강좌명</th>
		<th width = 100px>시간</th>
		<th width = 100px>강의실</th>
		<th width = 100px>최대인원</th>
		<th width = 100px>수강인원</th>
	</tr>
	<c:forEach var="l" items="${lectures}">
		<tr>
			<td><c:out value="${l.lcode}"/></td>
			<td><c:out value="${l.lname}"/></td>
			<td><c:out value="${l.hours}"/></td>
			<td><c:out value="${l.room}"/></td>
			<td><c:out value="${l.capacity}"/></td>
			<td><c:out value="${l.persons}"/></td>
		</tr>
	</c:forEach>

</table>
	<br>
	
	<form method="post" action="controller?cmd=enrollmentAction">
	<input type="button" value="뒤로가기" onclick="location.href='javascript:history.back();'">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="text" name = "lcode" style="width: 40px; height:20px;">
	<input type="submit" value="수강신청">
	</form>
</body>
</html>