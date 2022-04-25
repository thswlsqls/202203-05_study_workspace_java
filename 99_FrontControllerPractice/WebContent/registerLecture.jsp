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
	width: 500px; height: 320px;
    margin-left: -210px;
    margin-top : -160px;
    
	}
.content{
	text-align: center;
	margin-top: 30px;
	}
.hobby{
	outline : solid 1px gray;
	margin:auto;
	width:300px;
	height: 70px;
}
.info{
	margin-right: 25%;
	text-align: right;
}
.in{
	margin-left : 10%;
}

</style>
</head>
<body>
	<div class = "layer">
		<h1 style="text-align: center;">강좌등록 페이지</h1>
		
		<form action="controller?cmd=registerLectureAction" method="post">
		<div class = "info">
		강좌코드  <input name = "lcode" class="in" pattern="[A-Z]{1}+\d{3}" placeholder="알파벳대문자+숫자3개"><br>
		강좌명  <input name = "lname" class="in" placeholder="영문으로 입력"><br>
		시간  <input name = "hours" class="in"><br>
		강의실  <input name = "room" class="in"><br>
		수강가능인원  <input name = "capacity" class="in" ><br>
		현재수강인원  <input name = "persons" class="in" ><br>
		
		</div>
		<div class ="content">
		<input type="submit" value="강좌등록신청" style="width:100px; height: 40px; font-weight: bolder;">
		<input type="button" value="뒤로가기" onclick="location.href='javascript:history.back();'" style="width:100px; height: 40px; font-weight: bolder;">
		</div>
		</form>
	</div>
</body>
</html>