<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
var changeSelect = function(){
	 var selectOpt=$("select[name=selectbox] option:selected").val();
	
	 $.ajax({
		url : "controller?cmd=sortedfriendListUI",
		type : "post",
	 	data : {selectOpt : selectOpt}, //date, penName
	 	success : function(resp){
	 		
	 		var jsonResponse = JSON.parse(resp);
			
			$("#friendList").empty();
			$.each(jsonResponse, function(index, value){
				
				$("#friendList").append(
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
}
</script>

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
    font-size: 16pt;
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
		  	${penName}
		  </div>
		 <br>
	</div>
	<div class="col-6" style="position: relative;">
	<div class="contents" >
		<ul>
			<li><a href="controller?cmd=bookmarkListUI">즐겨찾기</a></li>
			<li><a href="controller?cmd=myPageUI">나의글</a></li>
			<li><a href="controller?cmd=logoutAction">로그아웃</a></li>
		</ul>
		</div>
	 </div>
	</div>
</div>
<div class="container">
	
	<hr color="black" width="100%">
	
	<div class="row" style="text-align: center;">
		<div class="col-6" ><strong>친구목록</strong></div>
		<div class="col-6" >
			<select id="selectbox" name="selectbox" onchange="changeSelect()">
				<option selected="selected" value = "date">날짜순</option>
				<option value = "penName">필명순</option>
			</select>
		</div>
	
	</div>
	<div class="container" style="width: 80%"><br>
	<div class="row" style="text-align: center;">
		<div class="col-6" >날짜</div>
		<div class="col-6" >필명</div>
	</div>
	</div>
	
	<hr color="black" width="100%">
	
	<div class="container" style="width: 80%" id="friendList">
	
		<c:forEach var="f" items="${fList}">
			<div class="row mypage-text" style="text-align: center;">
				<div class="col-6" >${f.followDate}</div>
				<div class="col-6" >${f.followeePenName}</div>
			</div>
			<br>
		</c:forEach>
	
	<!-- <div class="row mypage-text" style="text-align: center;">
			<div class="col-6" >2022.03.07</div>
			<div class="col-6" >eunbin son</div>
		</div>
		<br>
		<div class="row mypage-text" style="text-align: center;">
			<div class="col-6" >2022.03.11</div>
			<div class="col-6" >찬기쨩</div>
		</div>
		<br>
		<div class="row mypage-text" style="text-align: center;">
			<div class="col-6" >2022.03.15</div>
			<div class="col-6" >jeonhye0</div>
		</div>
		<br>
		<div class="row mypage-text" style="text-align: center;">
			<div class="col-6" >2022.04.15</div>
			<div class="col-6" >YH Kim</div>
		</div> -->
	</div>
</div>

<%@include file="menu.jsp" %>
</body>
</html>
