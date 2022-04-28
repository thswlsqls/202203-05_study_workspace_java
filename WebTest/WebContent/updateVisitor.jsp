<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<h1>방명록 수정</h1>
	<form action="controller?cmd=updateVisitor&visitorSeq=${v.visitorSeq}" method="post">
		작성자아이디: ${v.memberId}<br>
		작성일자: ${v.writerDate}<br>
		내용: <textarea rows="10" cols="20" name="updateContents">${v.contents}</textarea><br>
		글비밀번호확인 :<input type="password" name="inputPw">	
		<input type="submit" value="수정완료">
	</form>
</body>
</html>