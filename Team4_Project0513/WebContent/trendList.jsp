<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    	padding-top: 12vh;
    
    }
    .boardcontainer{
   		max-height:30vh;
    }
    .clickableBackground{
		width:100%;
		height:100%;
		background-color: transparent;
		background-repeat: no-repeat;
		border: none;
	}
	.themasBtn{
		width:
	}
	.boardBtnInner{
		width:100%;
		max-height:20vh;
	}
	</style>
  </head>
  <body>
  	<!-- navbar -->
<%@include file="howAreYouHeader.jsp" %>
<div class="boardListContainer d-flex flex-column">

	<c:forEach var="v" items="${list}" varStatus="status">
		<div class="boardcontainer mt-3 p-2" style="max-height:30vh;">
	      <button class="clickableBackground" type="button" onclick="location.href='controller?cmd=boardDetailUI&writeNo=${v.writeNo}'" >
			<div class="card img-fluid boardBtnInner">
			    <img class="card-img-top" src="img/2.jpg" alt="Card image" style="width:100%">
			    <div class="card-img-overlay">
			      <h4 class="card-title">${v.suggestionName}</h4>
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