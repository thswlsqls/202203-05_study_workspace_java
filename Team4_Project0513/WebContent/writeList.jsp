<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 
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
   
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
   
<title>Hello, world!</title>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
 
   <style type="text/css">

    img{
    width: 100vw;
    height: 20vh;
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
   left: 50%;
   transform: translate(-50%,-50% );
    }
    .writer{
    top: 80%;
   left: 50%;
   transform: translate(-50%,-50% );
    }
    .boardListContainer{
    	padding-top: 12vh;
    	background-image: url("img/22.png");
    
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
 <script type="text/javascript">
 
	 $(document).ready(function(){
		 
		 $.ajax({
				url : "controller?cmd=sortedfriendListUI",
				type : "post",
			 	data : {selectOpt : selectOpt}, //date, penName
			 	success : function(resp){
			 		
			 		var jsonResponse = JSON.parse(resp);
					
					$(".boardListContainer").empty();
					$.each(jsonResponse, function(index, value){
						
						$(".boardListContainer").append(
								"<div class='row mypage-text' style='text-align: center;'> "+
								"<div class='col-6' >"+value.followDate+"</div>"+
								"<div class='col-6' >"+value.followeePenName+"</div>"+
							    "</div><br>"
								);
					
					});
			 	},error:function(){
					alert("통신실패");
				}
			 });
	 })
 
 </script>

<div>
<%@include file="howAreYouHeader.jsp" %>
<div class="boardListContainer d-flex flex-column">

	<c:forEach var="v" items="${list}" varStatus="status">
		<div class="boardcontainer mt-3 p-2" style="max-height:30vh;">
	      <button class="clickableBackground" type="button" onclick="location.href='controller?cmd=boardDetailUI&writeNo=${v.writeNo}'" >
			<div class="card img-fluid boardBtnInner">
			    <img class="card-img-top" src="img/${status.index+1}.jpg" alt="Card image" style="width:100%">
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

  </body>
</html>