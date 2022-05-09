<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Hello, world!</title>
	<style type="text/css">

    img{
    width: 100vw;
    height: 100vh;
    }
    .image{
    position: relative;
    
    }
    .text{
   	 position: absolute;
     text-align: center;
     color: black;
     font-weight: border;
     background-color: none;
    }
    .contents{
		top: 50%;
		left: 50%;
		transform: translate(-50%,-50% );
    }
    .title{
	    top: 20%;
		left: 50%;
		transform: translate(-50%,-50% );
     /**color: black;
     font-weight:border;
     background-color: none;
     font-size: large;*/
    }
    .writer{
	    top: 80%;
		left: 50%;
		transform: translate(-50%,-50% );
    }
    .firstKeyword{
   		 top: 30%;
		left: 50%;
		transform: translate(-50%,-50% );
    	width: 20%;
    	height: 10%;
    	border-radius: 50px;
    	background-color: #FFD7D7;
    }
    .secondKeyword{
   		width: 50%;
    	height: 25%;
    	border-radius: 150px;
    	background-color: #F8DC7C;
    }
    .thirdKeyword{
    	width: 30%;
    	height: 15%;
    	border-radius: 120px;
    	background-color: #82E5FB;
    }
	</style>
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
<div id="carouselExampleControls" class="carousel slide">
  <div class="carousel-inner">
    <div class="carousel-item active image col-md-12 " >
      <img src="img/1.jpg" class="d-block" alt="...">
 		<div class="d-flex flex-column justify-content-center align-items-center">
 			<div class="text title">
 				<h5><b>지금 다른 사람들은</b></h5>
 			</div>
 			 <div class="text title firstKeyword">
		      	<!-- 2. 사진안에 텍스트 공간, 3.내비게이션바 글자크기 조절? 4. 마이페이지도... 5. 로그인페이지, 6. 회원가입,  -->
		      </div>
		      <div class="text contents secondKeyword">
		      	<!-- 2. 사진안에 텍스트 공간, 3.내비게이션바 글자크기 조절? 4. 마이페이지도... 5. 로그인페이지, 6. 회원가입,  -->
		      </div>
		      <div class="text writer thirdKeyword">
		      </div>	
 		</div>
    </div>    
    <!-- <div class="carousel-item">
      <img src="img/2.jpg" class="d-block " alt="...">
    </div>
    
    <div class="carousel-item">
      <img src="img/3.jpg" class="d-block " alt="..." >
    </div> -->
    
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
<%@include file="menu.jsp" %>
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
  </body>
</html>