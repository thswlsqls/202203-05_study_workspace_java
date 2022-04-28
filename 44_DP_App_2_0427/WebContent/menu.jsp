<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <table>
 	<tr> 	
 	<td> <a href="controller?cmd=main"> home</a></td>
 	
 <c:if test="${empty loginOK }">
 	<td> <a href="controller?cmd=loginUI"> 로그인</a></td>
 	<td> <a href="controller?cmd=addUserUI"> 회원가입</a></td>
 </c:if>
 <c:if test="${loginOK !=null }">
 	<td> <a href="controller?cmd=addWriterUI"> 방명록 작성</a></td> 
</c:if>	
 	</tr> 
 </table>
 <br>
 <c:if test="${loginOK !=null }">
 ${loginOK}님 환영합니다 <a href="controller?cmd=logoutAction">로그아웃</a>
 </c:if>