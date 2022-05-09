<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  	<!-- navbar -->
<ul class="nav nav-pills nav-justified fixed-top">
  <li class="nav-item">
    <a class="nav-link" aria-current="page" href="#">친구</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">실시간추천</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">새로운</a>
  </li>
  <li class="nav-item">
    <a class="nav-link">트렌트</a>
  </li>
</ul>
 <div class="d-flex flex-column justify-content-center align-items-center viewImgContainer">
	<div class="d-flex p-3 justify-content-center align-items-center ">
	</div>
	<div class="d-flex flex-column justify-content-around  align-content-around chooseBtnContainer">
		<div class="d-flex p-3 justify-content-between align-items-center text-white chooseBtnFlexRow">
			<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox">
				<button type="button" class="btn btn-info chooseBtn1"><font color="white">태양이 바다와 미광을 비추면<br>나는 너를 생각한다.<br>
				JM</font><br>☆<font color="red">♥</font></button>
			</div>
		</div>
		<div class="d-flex p-3 justify-content-between align-items-center text-white chooseBtnFlexRow">
			<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox">
				<button type="button" class="btn btn-info chooseBtn2"><font color="white">말하지 않아도 알아 넌 충분히<br>잘했어<br>
				jj</font><br>☆<font color="white">♥</font></button>
			</div>
	  	</div>
		<div class="d-flex p-3 justify-content-between align-items-center text-white chooseBtnFlexRow">
			<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox">
				<button type="button" class="btn btn-danger chooseBtn3"><font color="white">비가오고 바람이 불어와도 언제나<br>우산이 되어줄게<br>
				CNS</font><br>☆<font color="red">♥</font></button>
			</div>
		</div>
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
	.chooseBtn2{
		width:100%;
		height:100%;
		background-image: url('img/happy1.png');
		background-repeat: no-repeat;
	}	
	.chooseBtn3{
		width:100%;
		height:100%;
		background-image: url('img/sad1.png');
		background-repeat: no-repeat;
	}
</style>
</html>