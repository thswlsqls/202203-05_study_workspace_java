<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <h1>Main Page</h1>
    
    
    <a href="controller?cmd=loginUI">로그인</a>  <br>
    <a href="controller?cmd=addUserUI">회원가입</a>  <br>
    
    <h1>department list</h1>
   
    <ul>
	    <c:forEach var="dept" items="${list}" >
	    	<li>${dept.departmentId} : ${dept.departmentName}</li>
	    </c:forEach>
    </ul>
    
    