<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="controller?cmd=signup" method="post">
		아이디 <input type="text" name="userId"><br>
		비밀번호 <input type="password" name="pw"><br>
		이름 <input type="text" name="name"><br>
		전화번호 <input type="text" name="phoneNumber" ><br>
		성별 &nbsp 남<input type="radio" name="gender" value="male">
		여<input type="radio" name="gender" value="female"><br>
		취미 <input type="checkbox" name="hobby" value="reading">독서
		&nbsp<input type="checkbox" name="hobby" value="watchingMovie">영화감상
		&nbsp<input type="checkbox" name="hobby" value="exercise">운동<br>
		생일 
		<select name="year">
			<option value="2000">2000</option>
			<option value="1999">1999</option>
			<option value="1998">1998</option>
			<option value="1997">1997</option>
			<option value="1996">1996</option>
		</select>
		<select name="month">
			<option value="12">12</option>
			<option value="11">11</option>
			<option value="10">10</option>
			<option value="9">9</option>
			<option value="8">8</option>
			<option value="7">7</option>
			<option value="6">6</option>
			<option value="5">5</option>
			<option value="4">4</option>
			<option value="3">3</option>
			<option value="2">2</option>
			<option value="1">1</option>
		</select>
			<select name="day">
			<option value="31">31</option>
			<option value="30">30</option>
			<option value="29">29</option>
			<option value="28">28</option>
			<option value="27">27</option>
			<option value="26">26</option>
			<option value="25">25</option>
			<option value="24">24</option>
			<option value="23">23</option>
			<option value="22">22</option>
			<option value="21">21</option>
			<option value="20">20</option>
			<option value="19">19</option>
			<option value="18">18</option>
			<option value="17">17</option>
			<option value="16">16</option>
			<option value="15">15</option>
			<option value="14">14</option>
			<option value="13">13</option>
			<option value="12">12</option>
			<option value="11">11</option>
			<option value="10">10</option>
			<option value="9">9</option>
			<option value="8">8</option>
			<option value="7">7</option>
			<option value="6">6</option>
			<option value="5">5</option>
			<option value="4">4</option>
			<option value="3">3</option>
			<option value="2">2</option>
			<option value="1">1</option>
		</select><br>
		<input type="submit" value="회원가입">
	</form>
</body>
</html>