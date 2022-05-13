<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

   <!-- 부트스트랩 아이콘 -->
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
   
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
 <script type="text/javascript">
 var searchList = function(){
	 var search_name=$("select[name=searchName] option:selected").val();
	 var search_text=$("#searchText").val();
	 var date = $("#date").val();
	 var user_id = $("#searchId").val();
	 if (date.length == 0) {
		date = "no";
	}
	 $.ajax({
		url : "controller?cmd=searchAction",
		type : "post",
	 	data : {
	 		searchName : search_name,	 	
	 		searchText : search_text,
	 		date : date},
	 	success : function(resp){
	 		alert(resp)
	 		var jsonResponse = JSON.parse(resp);
			
			$("#searchedList").empty();
			$.each(jsonResponse, function(index, value){
				
				$("#searchedList").append(
						"<div class='row mypage-text' style='text-align: center;'> "+
						"<div class='col-4' >"+value.writeDate+"</div>"+
						"<div class='col-4' >"+value.penName+"</div>"+
						"<div class='col-4' >"+
						"<a href='controller?cmd=searchResultWriteAction"+"&wd="+value.writeDate+"&pn="+value.penName+"&sn="+value.suggestionName+"'>"+
								value.suggestionName+"</a>"+"</div>"+
					"</div><br>"
						);
			
			});
	 	},error:function(){
			alert("통신실패");
		}
	 });
 };
 </script>
<style type="text/css">
body{
 background-color: #FFF8EB
}
  
.contents{
   position:absolute;
	top: 60%;
	left: 50%;
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
   font-size: 1rem;
   background-color: pink;
}
</style>
</head>
<body>
<div class="container">
	
	<div class="row">
	<div class="col-12" style="text-align: center;"> <br>
		 <select name="searchName" id="searchName"> 
		 	<option selected="selected" value="penName">필명으로 검색</option>
		 	<option value="suggestionName">제시어로 검색</option>
		 </select> 
		 <input type="date" name="date" id=date>
	</div>
	</div>
	<br>
	<div style="text-align: center;">
		<input type="text" name="searchText" id = "searchText" size=30> <input type="button" value="검색" onclick="searchList()">
	</div>
	
</div>
<div class="container">
	
	<hr color="black" width="100%">
	
	<div class="row" style="text-align: center;">
		<div class="col-12" ><strong>검색결과</strong></div>
	</div>
	<div style="text-align: center;">
	
	</div>
	<div class="container" style="width: 90%"><br>
	<div class="row" style="text-align: center;">
		<div class="col-4" >날짜</div>
		<div class="col-4" >필명</div>
		<div class="col-4" >제시어</div>
	</div>
	</div>
	
	<hr color="black" width="100%">
	
	<div class="container" id="searchedList" style="width: 90%">
	
	<br>	
	</div>
</div>
<%@include file="menu.jsp" %>
</body>
</html>
