<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	var pwCheck=function(e){
		if(e.pw.value != e.pw2.value){
			alert('비밀번호를 확인하세요.')
			e.pw.focus();
			return false;
		}
	}
</script>
</head>
<body>
<h1>회원가입 </h1>

<form onsubmit="return pwCheck(this)" action="controller?cmd=addUserAction" method="post">

	 ID <input type="text" name="id"><br>
	 PW <input type="password" name="pw"><br>
	 PW2 <input type="password" name="pw2"><br>
	 name <input type="text" name="name"><br>
	<input type="submit" value="회원가입"> 

</form>

</body>
</html>