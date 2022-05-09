<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script type="text/javascript">
	window.onload = function() {
		today = new Date();
		console.log("today.toISOString() >>>" + today.toISOString());
		today = today.toISOString().slice(0, 10);
		console.log("today >>>> " + today);
		bir = document.getElementById("today");
		bir.value = today;
	}
</script>
<style type="text/css">
body{
 background-color: #FFF8EB
}
  .profile-user-img{
    width: 80px;
    height: 80px;
    border-radius: 70%;
    overflow: hidden; 
  }

  .profile-user-img-img{
    width: 100%;
    height: 100%;
    object-fit: cover;
  }

    .contents{
    position:absolute;
	top: 60%;
	left: 48%;
	font-size:10pt;
	transform: translate(-50%,-50% );
    }
    .writer_name{
    position:absolute;
	top: 50%;
	left: 70%;
	transform: translate(-50%,-50% );
	font-size: 15pt;
	font-weight: bolder;
    }
    .mypage-text{
    font-size: 14pt;
    background-color: pink;
    }
</style>
</head>
<body>
<div class="container">
	<div class="row">
	<div class="col-6" style="position: relative;"> <br>
		 <div class="profile-user-img">
		 <img src="img/1.jpg" alt="profile-user-img" class="profile-user-img-img">
		 
		 </div>
		  <div class="writer_name">
		  	필명
		  </div>
		 <br>
	</div>
	<div class="col-6" style="position: relative;">
	<div class="contents" >
		<ul>
		<li><a href="#">마이페이지</a></li>
		<li><a href="#">친구목록</a></li>
		<li><a href="#">로그아웃</a></li>
		</ul>
		</div>
	 </div>
	</div>
</div>
<div class="container">
	
	<hr color="black" width="100%">
	
	<div class="row" style="text-align: center;">
		<div class="col-6" ><strong>나의 즐겨찾기 목록</strong></div>
		<div class="col-6" >
			<select>
				<option selected="selected" value = "date">날짜순</option>
				<option value = "word">가나다순</option>
				<option value = "name">필명 순</option>
			</select>
		</div>
	
	</div>
	<div class="container" style="width: 100%"><br>
	<div class="row" style="text-align: center;">
		<div class="col-4" >날짜</div>
		<div class="col-4" >제시어</div>
		<div class="col-4" >필명</div>
	</div>
	</div>
	
	<hr color="black" width="100%">
	<div class="container" style="width: 100%">
	<div class="row mypage-text" style="text-align: center;">
		<div class="col-4" >2022.03.25</div>
		<div class="col-4" >하루</div>
		<div class="col-4" >기린이키린</div>
	</div>
	<br>
	<div class="row mypage-text" style="text-align: center;">
		<div class="col-4" >2022.04.25</div>
		<div class="col-4" >노을</div>
		<div class="col-4" >jeonhye0</div>
	</div>
	<br>
	<div class="row mypage-text" style="text-align: center;">
		<div class="col-4" >2022.05.02</div>
		<div class="col-4" >바람</div>
		<div class="col-4" >eunbin son</div>
	</div>
	<br>
	
	</div>
</div>

<%@include file="menu.jsp" %>
</body>
</html>
