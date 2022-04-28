<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file ="menu.jsp" %>
<c:if test="${empty id}">
		[로그인 후 이용해주세요.]
</c:if>
<h1>방명록 리스트</h1>

<c:forEach items="${list}" var="vw">
	<li>${vw.getVisitorNo()} : ${vw.getVisitorId()} - ${vw.getVisitorContents()}</li>
	<c:if test="${id == vw.getVisitorId()}">
	<form method="post">
	<input name="contents" placeholder="수정글 입력">
	<input type="password" name="pw" placeholder="글 비밀번호 입력">
	<input type="submit" value="수정" formaction="controller?cmd=updatewriteAction&wno=${vw.getVisitorNo()}&id=${vw.getVisitorId()}">
	<input type="submit" value="삭제" formaction="controller?cmd=deletewriteAction&wno=${vw.getVisitorNo()}">
	</form>
	</c:if>
</c:forEach>

</body>
</html>