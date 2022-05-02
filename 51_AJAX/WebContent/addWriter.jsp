<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp"%>

<form action="controller?cmd=addWriterAction" method="post">
아이디: <input name="id" value="${loginOK}"><br>
이름: <input name="name" value="${loginName}"><br>
글비밀번호<input type="password" name="pw"><br>
내용:<textarea rows="4" cols="10" name="contents"></textarea><br>
<input type="submit" value="등록">
</form>