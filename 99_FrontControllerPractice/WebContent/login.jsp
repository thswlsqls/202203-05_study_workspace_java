<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.layer {
	position: absolute;
	top: 50%;
	left: 50%;
	border : solid 1px gray;
	width: 400px; height: 250px;
    margin-left: -180px;
    margin-top : -80px;
	}
.content{
	text-align: center;
	}
.info{
	margin-right: 25%;
	text-align: right;
}
}
</style>
<script type="text/javascript">
	
	function btn(){
		
		var job = document.querySelector('input[name="job"]:checked').value;
		
		if (job == 1) {
			location.href = "controller?cmd=signupUI";
		}else{
			location.href = "controller?cmd=professorsignupUI";
		}
	}
	
</script>

</head>
<body>
	
	<div class = "layer">
	
	<h1 class = "content">학사정보 시스템</h1>
	
	
	<div class = "content">
		<form method="post" action="controller?cmd=loginAction">
		<div class="info">
		ID : <input name="name" placeholder="이름 입력"><br> 
		PW : <input type="password" name="code" placeholder="학번  또는 교수번호 입력"><br>
		</div>
		<br>

		<div class = "content">
		<div>
		<input type="submit" value="로그인" style="width: 80px; margin-right: 128px;" >
		</div><br>
		<input type="button" value="회원가입" style="width: 80px;" onclick="btn();">
		<input type="radio" name = "job" value="1"> 학생
		<input type="radio" name = "job" value="2"> 교수
		</div></form>
	</div>
	</div>
</body>
</html>