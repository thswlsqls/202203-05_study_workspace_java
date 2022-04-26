<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>방명록 글수정</h1>
	<form action="controller?cmd=guestBookUpdate" method="post">
		제목: <input type="text" name="updateTitle" value="${title}"><br>
		내용: <textarea rows="10" cols="22" name="updateContent">${content}</textarea>
		<input type="submit" value="수정완료">
	</form>
	<a href="controller?cmd=guestBookList">목록보기</a>
</body>
</html>