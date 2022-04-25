<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

#form{
	background-color: #f5d682;

	width: 400px;
	height: 400px;
	position:absolute;
	top:0;
	bottom:0;
	left:0;
	right:0;
	height : 200px;
	margin: auto;

	}
.layer {
	position:absolute;
	text-align: center;
	top:0;
	bottom:0;
	left:0;
	right:0;
	margin: auto;
	}

}
</style>
</head>
<body>
<div id = "form">
	<div class="layer">
<h1>교수 메인페이지 입니다.</h1>
<% session.setAttribute("name", request.getAttribute("name"));
	session.setAttribute("id", request.getAttribute("id"));%>
<h3>${name}교수님, 안녕하세요!</h3>
<br>
<input type="button" value="전체수강정보" onclick="location.href='controller?cmd=enrollmentsUI'">
<input type="button" value="강좌정보" onclick="location.href='controller?cmd=lecturesUI'">
<input type="button" value="로그아웃" onclick="location.href='controller?cmd=loginUI'">
</div></div>
</body>
</html>
