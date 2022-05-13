 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
<script type="text/javascript">
var sendEmotionName = function(e){
	
	var emotionName = $(e).val();
	
	window.location.href="controller?cmd=insertEmpathy" + "&emotionName=" + emotionName;
		
}
$( document ).ready( function(){
	$("#refresh").click(function(){
		
		$.ajax({
			url : "controller?cmd=refreshEmotionAction",
			type : "post",
		 	success : function(resp){
		 		
		 		var jsonResponse = JSON.parse(resp);
		 		var key = Object.values(jsonResponse);
				$("#btn0").val(key[0]);
				$("#btn1").val(key[1]);
				$("#btn2").val(key[2]);
				$("#btn3").val(key[3]);
				$("#btn4").val(key[4]);
				$("#btn5").val(key[5]);
				$("#btn6").val(key[6]);
				$("#btn7").val(key[7]);
				
		 	},error:function(){
				alert("통신실패");
			}
		 });
	});	
	
});


	
</script>

<title>Insert title here</title>
</head>
<body>


<div class="d-flex flex-column justify-content-center align-items-center viewImgContainer">
	<div class="d-flex p-3 justify-content-center align-items-center ">
		<h4 class="p-2 chooseEmotionH2">당신의 오늘은 어땠나요?</h4>
		<button type="button" class="btn btn-renew" id = "refresh">새로고침</button>
	</div>

	<div class="d-flex flex-column justify-content-around  align-content-around chooseBtnContainer">
		<div class="d-flex p-3 justify-content-between align-items-center text-white chooseBtnFlexRow">
			<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox"><!-- **** -->					
				<input name = "emotionName" type="button" class="btn btn-info chooseBtnPos" value="${emotions[0]}" onclick="sendEmotionName(this)" id="btn0">
			</div>
	  		<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox">
	  			<input  type="button" class="btn btn-info chooseBtnPos"value="${emotions[1]}" onclick="sendEmotionName(this)" id="btn1">
	  		</div>
		</div>
		<div class="d-flex p-3 justify-content-between align-items-center text-white chooseBtnFlexRow">
			<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox">
				<input type="button" class="btn btn-info chooseBtnPos"value="${emotions[2]}" onclick="sendEmotionName(this)" id="btn2">
			</div>
	  		<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox">
	  			<input type="button" class="btn btn-info chooseBtnPos"value="${emotions[3]}" onclick="sendEmotionName(this)" id="btn3">
	  		</div>
	  	</div>
		<div class="d-flex p-3 justify-content-between align-items-center text-white chooseBtnFlexRow">
			<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox">
				<input type="button" class="btn btn-danger chooseBtnNag"value="${emotions[4]}" onclick="sendEmotionName(this)" id="btn4">
			</div>
	  		<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox">
				<input type="button" class="btn btn-danger chooseBtnNag"value="${emotions[5]}" onclick="sendEmotionName(this)" id="btn5">
			</div>
		</div>
		<div class="d-flex p-3 justify-content-between align-items-center text-white chooseBtnFlexRow">
			<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox">
				<input type="button" class="btn btn-danger chooseBtnNag"value="${emotions[6]}" onclick="sendEmotionName(this)" id="btn6">
			</div>
	  		<div class="d-flex p-3 justify-content-center align-items-center   chooseBtnFlexBox">
				<input type="button" class="btn btn-danger chooseBtnNag"value="${emotions[7]}" onclick="sendEmotionName(this)" id="btn7">
			</div>
		</div>
	
	</div>
</div>

</body>
<style>
	.viewImgContainer{
		width: 100vw;
		height: 100vh;
		background-image: url('https://t1.daumcdn.net/cfile/tistory/99FF67355F6CD15C02');
	}
	.chooseBtnContainer{
		width: 90vw;
		height: 80vh;
	}
	.chooseEmotionH2{
		color: white;
		font-size: 5vw;
	}
	.btn-renew{
		font-size: smaller;
		height: 50%;
		padding-top: 2px;
		color: black;
		text-align: center;
		background-color: #FEB7FF;
	}
	.chooseBtnFlexRow{
		padding:0px;
		width: 100%;
		min-height:20%; 
	}
	.chooseBtnFlexBox{
		padding:0px;
		min-width: 50%;
		height: 100%;
	}
	.chooseBtnPos{
		width:100%;
		height:100%;
		color: black;
		/*background-color: #82E5FB;*/
		background-color: #FFF8EB;
		border-color: #FFF8EB;
	}
	.chooseBtnNag{
		width:100%;
		height:100%;
		color: black;
		/*background-color: #FFC7C7;*/
		background-color: #FFF8EB;
		border-color: #FFF8EB;
	}
	
	.homeBtn{
		width: 40%;
		color: black;
		background-color: #C4C4C4;
	}
</style>
</html>

