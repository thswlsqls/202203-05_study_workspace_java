<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.6.0.js"></script>
</head>
<body>
<h3>회원가입</h3>
<%@ include file="menu.jsp" %>
<form action="controller?cmd=addUserAction" method="post">
아이디 : <input name = "id">  <span></span><br>
비밀번호 : <input type="password" name="pw"><br>
이름 : <input name = "name"><br> 
<input type="submit" value="회원가입">
</form>

<script type="text/javascript">
	
	$("input[name='id']").on("change",function(){
		var userId = $("input[name='id']").val();
		$.ajax({
			url : "controller?cmd=checkIdAction",
			data : {id: userId},
			success : function(response){
				jsonresponse = JSON.parse(response);
				//alert(jsonresponse);
				var m="불가능";
				if(jsonresponse.idCheck=="true"){
					m="가능"
				}
				$("span").html(m);
				
				/*if(response.trim() == "success"){
					$("span").html("가능");
				}
				else{
					$("span").html("불가능");
				}*/	
			}
		})
	})

</script>

</body>
</html>