<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="missionSignupAction" method="post">
		아이디 <input name="id" required="required"><br>
		비밀번호 <input name="pw" type="password" required="required"><br>
		이름 <input name="name" required="required"><br>
		이메일 <input name="email" required="required">
		<select name="emailDomain" required="required">
			<option value="@naver.com">@naver.com</option>
			<option value="@gmail.com">@gmail.com</option>
			<option value="@daum.net">@daum.net</option>
		</select>
		<br>
		학번&nbsp <input name="studentNumber" required="required"><br>
		전화번호&nbsp <input name="phone" placeholder="010-0000-0000" 
						   pattern="[0-9]{2,3}-[0-9]{3,4}-[0-9]{3,4}" 
						   required="required"><br>
		성별 &nbsp 남 <input name="gender" type="radio" 
					       value="male" required="required">
				   여 <input name="gender" type="radio" 
				   						value="female">		
		<br>
		취미 &nbsp 독서 <input name="hobby" type="checkbox" 
							value="reading" required="required">
				   영화감상 <input name="hobby" type="checkbox" 
				   			   value="watchingMovie">
				   운동 <input name="hobby" type="checkbox" value="exercise">
		<br>
		생일 &nbsp 연 <select name="year" required="required">
						<option value="2003">2003</option>
						<option value="2002">2002</option>
						<option value="2001">2001</option>
						<option value="2000">2000</option>
						<option value="1999">1999</option>
						<option value="1998">1998</option>
						<option value="1997">1997</option>
						<option value="2000">1996</option>
						<option value="1999">1995</option>
						<option value="1998">1994</option>
						<option value="1997">1993</option>
						<option value="2000">1992</option>
						<option value="1999">1991</option>
						<option value="1998">1990</option>
					</select>
				   월 <select name="month" required="required">
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
				   일  <select name="day" required="required">
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
					</select>
		<br>
		<input type="submit" value="회원가입">
	</form>
	<!-- 
			아이디, 비밀번호, 이름, 
			이메일-앞부분은 직접입력, 뒷부분은 셀렉트, 
			학번, 전화번호, 
			성별-라디오, 취미-체크박스, 생일-셀렉트 
	-->
</body>
</html>