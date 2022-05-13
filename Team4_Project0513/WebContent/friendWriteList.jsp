<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<!-- 부트스트랩 아이콘 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">

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
     color: white;
     background-color: gray;
    }
    .contents{
    
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50% );
    }
    .title{
    top: 20%;
	left: 20%;
	transform: translate(-50%,-50% );
    }
    .writer{
    top: 80%;
	left: 50%;
	transform: translate(-50%,-50% );
    }
    .boardListContainer{
    	padding-top: 40px;
    
    }
    .boardcontainer{
   		max-height:30vh;
    }
    .clickableBackground{
		width:100%;
		height:100%;
		background-color: white;
		background-repeat: no-repeat;
		border: none;
	}
	</style>
</head>
<body>
  	<!-- navbar 
<ul class="nav nav-pills nav-justified fixed-top">
  <li class="nav-item">
    <a class="nav-link" aria-current="page" href="controller?cmd=friendWriteListUI">친구</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="controller?cmd=rankingUI">실시간추천</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="controller?cmd=newListUI">새로운</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="controller?cmd=trendUI">트렌트</a>
  </li>
</ul>-->
<%@include file="howAreYouHeader.jsp" %>
<div class="boardListContainer d-flex flex-column">

	<c:forEach var="v" items="${fwList}" varStatus="status">
		<div class="boardcontainer mt-3 p-2" style="max-height:30vh;">
	      <button class="clickableBackground" type="button" onclick="location.href='controller?cmd=boardDetailUI&writeNo=${v.writeNo}'" >
			<div class="card img-fluid" style="width:100%; max-height:30vh;">
			    <img class="card-img-top" src="img/2.jpg" alt="Card image" style="width:100%">
			    <div class="card-img-overlay">
			      <h4 class="card-title">${v.emotionName}</h4>
			     <!-- <p class="card-text">${v.contents}</p>  --> 
			      <br>
			      <span>작성자  : ${v.penName}</span>
			      <br>
			      <span>날짜  : ${v.writeDate}</span>
			      <br>
			    </div>
			  </div>
		  </button>
		</div>
	</c:forEach>

</div>
<%@include file="menu.jsp" %>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<!-- <div id="carouselExampleControls" class="carousel slide">
  <div class="carousel-inner">
  
  
  	<div class="boardListContainer">

	<c:forEach var="v" items="${fwList}" >

		<div class="container mt-3"><div class="card img-fluid" style="width:500px">
		    <img class="card-img-top" src="img/2.jpg" alt="Card image" style="width:100%">
		    <div class="card-img-overlay">
		      <h4 class="card-title">${v.emotionName }</h4>
		      <p class="card-text">${v.contents}</p>
		      <br>
		      <span>작성자  : ${v.penName}</span>
		      <br>
		      <span>날짜  : ${v.writeDate}</span>
		      <br>
		      <a href="controller?cmd=boardDetailUI&writeNo=${v.writeNo}" class="btn btn-primary" >상세보기</a>
		    </div>
		  </div>
		</div>
		
	</c:forEach>
 
 
</div>

	 <c:forEach var="v" items ="${fwList}" varStatus="status">   
	    <div class="carousel-item active image col-md-12" >
	      <img src="img/1.jpg" class="d-block" alt="...">
	      <div class="text title">
	      	#감정키워드 : ${v.emotionName }
	      	//  2. 사진안에 텍스트 공간, 3.내비게이션바 글자크기 조절? 4. 마이페이지도... 5. 로그인페이지, 6. 회원가입,  
	      </div>
	      <div class="text contents">
	      	#제시어 : ${v.suggestionName}<br>
	      	#내용: ${v.contents}<br>
	      	<br>
	      	
	      	// 2. 사진안에 텍스트 공간, 3.내비게이션바 글자크기 조절? 4. 마이페이지도... 5. 로그인페이지, 6. 회원가입,  
	      </div>
	      <div class="text writer">
	      	작성자 : ${v.penName}<br>
	      	날짜  : ${v.writeDate }<i class="bi bi-star-fill"></i> <i class="bi bi-heart-fill"></i>
	      </div>
	    </div>
    </c:forEach> 
   
    <div class="carousel-item">
      <img src="img/2.jpg" class="d-block " alt="...">
    </div>
    
    <div class="carousel-item">
      <img src="img/3.jpg" class="d-block " alt="..." >
    </div>
    
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
 -->

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
  </body>
</html>