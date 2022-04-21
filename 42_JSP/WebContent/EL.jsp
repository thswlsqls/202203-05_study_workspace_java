<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%	//Servlet이 request을 처리하고 JSP로 이동할 때 필요한 데이터를 전달
	request.setAttribute("inDate", new Date());
	session.setAttribute("loginOK", "로그인사용자 계정");
	application.setAttribute("admin", "admin@ucamp.com");
%>
id: ${id}<br>
<h1>EL</h1>
<% if(request.getAttribute("inDate")!=null){ %>
	JSP의 전달 <%=request.getAttribute("inDate") %> <br>
<%} %>
<%= session.getAttribute("loginOK")%> <br>
<%= application.getAttribute("admin")%> <br>

<c:if test="${inDate2 !=null}">
	${inDate2} <br>
	${inDate2 == null} <br>
	${empty inDate2} <br>
</c:if>
${inDate2 !=null}<br>
${inDate2 == null} <br>
${empty inDate2} <br>
${inDate} <br>
${loginOK} <br>
${admin} <br>

