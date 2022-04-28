<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<h1>방명록 모두보기</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>작성자아이디</th>
			<th>작성일자</th>
		</tr>
		<c:forEach items="${vList}"  var="v" varStatus="status">
			<tr onclick = "location.href='./controller?cmd=visitorUI&visitorSeq=${v.visitorSeq}'">
				<td>${status.index+1}</td>
				<td>${v.memberId}</td>
				<td>${v.writerDate}</td>
			</tr>
		</c:forEach>
	</table>
	<c:if test="${memberId != null}">
		<a href="controller?cmd=addVisitorUI">새방명록등록</a>
	</c:if>
</body>
</html>

