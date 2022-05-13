<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
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
   font-size: 13pt;
   font-weight: bolder;
    }
    .mypage-text{
    font-size: 16pt;
    background-color: pink;
    }
</style>
<script type="text/javascript">
var searchBtn = function(){
	var date = $("#today").val();
	$.ajax({
		url : "controller?cmd=myPageAction",
		type : "post",
	 	data : {date : date},
	 	success : function(resp){
	 		
	 		var jsonResponse = JSON.parse(resp);
	 		alert(resp);
			$("#mypageList").empty();
			$(".aa").empty();
			$.each(jsonResponse, function(index, value){
				
				$("#mypageList").append(
						"<div class='row mypage-text' style='text-align: center;'> "+
						"<div class='col-6' >"+value.writeDate+"</div>"+
						"<div class='col-6' >"+
						"<a href='controller?cmd=boardDetailUI"+"&writeNo="+value.writeNo+"'>"+
								value.suggestionName+"</a>"+"</div>"+
					"</div><br>"
						);
			
			});
	 	},error:function(){
			alert("통신실패");
		}
	 });
}
</script>
</head>
<body>
<div class="container">
   <div class="row">
   <div class="col-6" style="position: relative;"> <br>
       <div class="profile-user-img">
       <img src="img/1.jpg" alt="profile-user-img" class="profile-user-img-img">
       
       </div>
        <div class="writer_name">
           ${penName}
        </div>
       <br>
   </div>
   <div class="col-6" style="position: relative;">
   <div class="contents" >
      <ul>
      <li><a href="controller?cmd=bookmarkListUI">즐겨찾기</a></li>
      <li><a href="controller?cmd=friendListUI">친구목록</a></li>
      <li><a href="controller?cmd=logoutAction">로그아웃</a></li>
      </ul>
      </div>
    </div>
   </div>
</div>
<div class="container">
   
   <hr color="black" width="100%">
   
   <div class="row" style="text-align: center;">
      <div class="col-4" ><strong>나의 글 앨범</strong></div>
      <div class="col-8" >
         <input type="date" value="날짜" id="today">
         <input type="button" value="조회" id="search" onclick="searchBtn()">
      </div>
   
   </div>
   <div class="container" style="width: 80%"><br>
   <div class="row" style="text-align: center;">
      <div class="col-6" >날짜</div>
      <div class="col-6" >제시어</div>
   </div>
   </div>
   

   <hr color="black" width="100%">
   
   <c:forEach var="l" items = "${list}">
   <div class="container" style="width: 80%" id="mypageList">
	   <div class="row mypage-text" style="text-align: center;">
	      <div class="col-6 aa" >${l.writeDate}</div>
	      <div class="col-6 aa" >
	      <!-- <a href='controller?cmd=mypageWriteAction&wn=${l.getWriteNo()}'>${l.suggestionName}</a></div>	 -->					
	      <a href='controller?cmd=boardDetailUI&writeNo=${l.getWriteNo()}'>${l.suggestionName}</a></div>						
	   </div>
	   <br>   
   </div>
</c:forEach>
</div>

<%@include file="menu.jsp" %>
</body>
</html>