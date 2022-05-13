<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="menu.jsp"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	
    <title>Hello, world!</title>
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    <script type="text/javascript">
    $( document ).ready( function(){
    	$("#refresh").click(function(){
    		
    		$.ajax({
    			url : "controller?cmd=refreshSuggestionAction",
    			type : "post",
    		 	success : function(resp){
    		 		
    		 		var jsonResponse = JSON.parse(resp);
    		 		var key = Object.values(jsonResponse);
    				$("#btn0").val(key[0]); $("#check0").text(key[0]);
    				$("#btn1").val(key[1]); $("#check1").text(key[1]);
    				
    				
    		 	},error:function(){
    				alert("통신실패");
    			}
    		 });
    	});	
    });
    </script>
  </head>
  <body>
  
  <form action="controller?cmd=diaryWriteAction" method="post">
	<div class="container d-flex flex-column justify-content-center align-items-center" style=" text-align: center; ">
		<div class="row-md-6">
		<br><br>
			<!-- <h2><strong>꿈</strong></h2><br> -->
			
			<input  type="radio" name="suggestionName" id="btn0" value = "${suggestions[0]}"> <span class="suggestioncheck" id="check0">${suggestions[0]}</span>
			<input  type="radio" name="suggestionName" id="btn1" value = "${suggestions[1]}"> <span class="suggestioncheck" id="check1">${suggestions[1]}</span>
			
			<button type="button" class="btn suggestionRefreshBtn" id="refresh">새로고침</button>
		</div><br>
	<textarea name = "contents"></textarea><br>
	<input type="submit" value="저장"> 
</div>
</form>


    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
  </body>
  	<style type="text/css">
	body{
	background-image: url("img/4.jpg");	
	}
	textarea {
    width: 80vw;
    height: 70vh;
    border: none;
    resize: none;
    font-size: 15pt;
  }
  .suggestioncheck{
  	font-size: 5vw;
  }
  .suggestionRefreshBtn{
   	background-color: #FFF8EB;
  	border-color: #FFF8EB;
  }
  
	</style>
</html>