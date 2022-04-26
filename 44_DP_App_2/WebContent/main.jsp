<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>Main Page</h1>
 	<!-- 
 	    <a href="controller?cmd=loginUI">로그인</a>
    	<a href="controller?cmd=signupUI">회원가입</a>
 	 -->
	<%@ include file="menu.jsp" %>
    
    
<%
	if(session.getAttribute("userId") != null){
		out.println("<script>alert('로그인한 유저입니다.')</script>");
		response.sendRedirect("./userMain.jsp");
	}
%>
    
    