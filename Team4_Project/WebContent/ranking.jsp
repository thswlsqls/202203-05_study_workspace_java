<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Hello, world!</title>
</head>
<body>

<%@include file="howAreYouBtn.jsp" %>
 <div class="d-flex flex-column justify-content-center align-items-center viewImgContainer">
	<div class="d-flex p-3 justify-content-center align-items-center ">
	</div>
	<div class="d-flex flex-column justify-content-around  align-content-around chooseBtnContainer">
	<c:forEach var="r" items="${rankList}">
		<div class="d-flex p-3 justify-content-between align-items-center text-white chooseBtnFlexRow">
			<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox">
				<button type="button" class="btn btn-info chooseBtn1" onclick="location.href='controller?cmd=rankingAction&writeNo=${r.getWriteNo()}'">
				${r.getContents()}<br>
				${r.getWriteDate() } ${r.getPenName() }<br><br>
				${r.getrCnt() }
				</button>
			</div>
		</div>
	</c:forEach>
	</div>
</div>
<%@include file="menu.jsp" %>
  </body>
  <style>
	.chooseBtnContainer{
		width: 90vw;
		height: 80vh;
	}
	.chooseBtnFlexRow{
		padding:0px;
		width: 100%;
		min-height:35%; 
	}
	.chooseBtnFlexBox{
		padding:0px;
		min-width: 100%;
		height: 100%;
	}
	.chooseBtn1{
		width:100%;
		height:100%;
		background-image: url('img/mad1.png');
		background-repeat: no-repeat;
	}
</style>
</html>