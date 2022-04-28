<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<%@ include file="menu.jsp" %> 
<h1>회원 전용 방명록 작성 </h1>

<form  action="controller?cmd=addWriterAction" method="post">

 ID <input name="id" required="required" value="${loginOK}"><br>
 name <input name="name" required="required" value="${loginName}"><br>
 글 PW <input type="password" name="pw" required="required" ><br>
 글 내용 <textarea rows="4" cols="10" name="contents"></textarea>  <br>
  
<input type="submit" value="글 작성"> 


</body>
</html>