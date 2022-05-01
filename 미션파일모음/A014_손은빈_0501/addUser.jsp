<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>

</head>
<body>
<%@ include file="menu.jsp" %>
	<h1>회원가입</h1>
	<h1></h1>
	<form action="controller?cmd=addUser" method="post">
		id:<input type="text" name="userId" id="inputId" required="required">
		<input type="button" id="idDuplicateCheck" value="중복확인"><label id="isValid"></label><br>
		name:<input type="text" name="name"><br>
		pw1:<input type="password" name="pw1"><br>
		pw2:<input type="password" name="pw2"><br>	
		gender:<input type="radio" name="gender" value="m">남	
		<input type="radio" name="gender" value="f">여<br>	
		<input type="checkbox" name="hobby" value="reading">독서
		<input type="checkbox" name="hobby" value="cooking">요리
		<input type="checkbox" name="hobby" value="watchingMovie">영화감상<br>
		<select name="blood">
			<option value="A">A</option>
			<option value="B">B</option>
			<option value="O">O</option>
			<option value="AB">AB</option>
		</select><br>
		<input type="submit" value="회원가입">
		<input type="submit" value="취소" formaction="controller?cmd=main">
	</form>
<script type="text/javascript">
	$("#idDuplicateCheck").click(function(){
		var inputId = $('#inputId').val();
		$.ajax({
			url: "./ajaxController?cmd=checkDuplicateId",
			type:'get',
			dataType: 'json',
			data: {"inputId": inputId},
			success: function(data){
				if(data.isValidId == "true"){
					alert(inputId+"은(는) 사용할 수 있는 아이디입니다.");	
					$("#isValid").text("사용가능");
					$('#isValid').css("color", "green");
				}else{
					alert(inputId+"은(는) 이미 존재하는 아이디입니다.");
					$('#inputId').focus();
					$('#inputId').val('');
					$("#isValid").text("사용불가");
					$('#isValid').css("color", "red");
				}
				console.log(data);
			},
			error: function(request, status, error){
				console.log(request);
				alert("code:"+ status);
				alert(error);
			}
		})
	})
</script>
</body>
</html>