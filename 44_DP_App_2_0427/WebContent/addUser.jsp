<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
var pwCheck =function(){	
	if (join.pw.value != join.pw2.value) {
		join.pw.value="";
		join.pw2.value="";
		alert("비밀번호가 다릅니다");
		join.pw.focus();
		return false;
	} 
}

</script>
</head>
<body>
<%@ include file="menu.jsp" %> 
<h1>회원가입 </h1>

<form name = "join" onsubmit="return pwCheck()" action="controller?cmd=addUserAction" method="post">

 ID <input name="id" required="required"><br>
 PW <input type="password" name="pw" required="required" ><br>
 PW2 <input type="password" name=pw2 required="required"><br>
 name <input name="name" required="required"><br> 
<input type="submit" value="회원가입"> 

</form>

</body>
</html>