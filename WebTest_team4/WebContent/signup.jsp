<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>

<script type="text/javascript">
var pwCheck = function(e) {
	if (e.pw.value != e.pw2.value) {
		e.pw.value = "";
		e.pw2.value = "";
		e.pw.focus();
		alert("비밀번호가 일치하지 않습니다.");
		return false;
	}
	return true;
}
</script>
<body>
<%@include file ="menu.jsp" %>
<h1>회원가입</h1>
<form onsubmit="return pwCheck(this)" action="controller?cmd=signupAction" method="post">
id : <input name="id" required="required"><br>
name : <input name="name" required="required"><br>
pw1 : <input type="password" name="pw" required="required"><br>
pw2 : <input type="password" name="pw2" required="required"><br>
gender : <input type="radio" name="gender" value="m" checked="checked">남자
		<input type="radio" name="gender" value="f">여자<br>
<input type="checkbox" name="hobby" value="독서">독서
<input type="checkbox" name="hobby" value="요리">요리
<input type="checkbox" name="hobby" value="음악감상">음악감상<br>
<select name="blood">
	<option value="A">A형</option>
	<option value="B">B형</option>
	<option value="O">O형</option>
	<option value="AB">AB형</option>
</select>
<input type="submit" value="회원가입">
<input type="button" value="취소" onclick="location.href='controller?cmd=main'">
</form>
</body>
</html>