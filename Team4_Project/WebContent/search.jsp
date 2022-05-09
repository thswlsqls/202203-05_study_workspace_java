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
    font-size: 16pt;
    background-color: pink;
    }
</style>
</head>
<body>
<div class="container">
	<form action="">
	<div class="row">
	<div class="col-12" style="text-align: center;"> <br>
		 <select>
		 	<option selected="selected">필명으로 검색</option>
		 	<option >내용으로 검색</option>
		 </select> 
		 <input type="date" value="날짜" >
	</div>
	</div>
	<br>
	<div style="text-align: center;">
		<input type="text" size=30> <input type="submit" value="검색">
	</div>
	</form>
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
	<div class="container" style="width: 90%">
	<div class="row mypage-text" style="text-align: center;">
		<div class="col-4" >2022.05.08</div>
		<div class="col-4" >김용돌</div>
		<div class="col-4" >물결</div>
	</div>
	<br>
	
	</div>
</div>

<%@include file="menu.jsp" %>
</body>
</html>
