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
		<h1 style="text-align: center;">교수 회원가입 페이지</h1>
		
		<form action="controller?cmd=professorsignupAction" method="post">
		<div class = "info">
		교번(아이디)  <input name = "pcode" class="in" pattern="\d{3}" placeholder="숫자 3자리 입력"><br>
		이름  <input name = "pname" class="in"><br>
		학과	<select name = "department" class="in" style="width: 175px;">
			<option selected="" disabled="" hidden="">학과선택</option>
			<option value="computer engineering">computer engineering</option>
			<option value="electronic engineering">electronic engineering</option>
			<option value="architectural engineering">architectural engineering</option>
			<option value="software engineering">software engineering</option>
		</select>   <br>
		급여  <input name = "salary" type="number" class="in" placeholder="단위 : $"><br>
		직위	<select name = "position" class="in" style="width: 175px;">
			<option selected="" disabled="" hidden="">직위선택</option>
			<option value="full professor">full professor</option>
			<option value="associate professor">associate professor</option>
		</select>   <br>
		</div>
		<div class= "info">
		입사날짜
		<select name = "year">
			<option selected="" disabled="" hidden="">연</option>
			<option value="1990">1990</option>
			<option value="1991">1991</option>
			<option value="1992">1992</option>
			<option value="1993">1993</option>
			<option value="1994">1994</option>
			<option value="1995">1995</option>
			<option value="1996">1996</option>
			<option value="1997">1997</option>
			<option value="1998">1998</option>
			<option value="1999">1999</option>
			<option value="2000">2000</option>
			<option value="2001">2001</option>
			<option value="2002">2002</option>
			<option value="2003">2003</option>
			<option value="2004">2004</option>
			<option value="2005">2005</option>
			<option value="2006">2006</option>
			<option value="2007">2007</option>
			<option value="2008">2008</option>
			<option value="2009">2009</option>
			<option value="2010">2010</option>
		</select>년
		<select name = "month">
			<option selected="" disabled="" hidden="">월</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
		</select>월
		<select name = "day">
			<option selected="" disabled="" hidden="">일</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
			<option value="14">14</option>
			<option value="15">15</option>
			<option value="16">16</option>
			<option value="17">17</option>
			<option value="18">18</option>
			<option value="19">19</option>
			<option value="20">20</option>
			<option value="21">21</option>
			<option value="22">22</option>
			<option value="23">23</option>
			<option value="24">24</option>
			<option value="25">25</option>
			<option value="26">26</option>
			<option value="27">27</option>
			<option value="28">28</option>
			<option value="29">29</option>
			<option value="30">30</option>
			<option value="31">31</option>
		</select>일
		</div>
		
		<div class ="content">
		<input type="submit" value="회원가입" style="width:100px; height: 40px; font-weight: bolder;">
		<input type="button" value="뒤로가기" onclick="location.href='controller?cmd=loginUI'" style="width:100px; height: 40px; font-weight: bolder;">
		</div>
		</form>
	</div>
</body>
</html>
