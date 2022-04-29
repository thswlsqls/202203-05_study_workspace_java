<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<%
		Enumeration e=request.getParameterNames();
	
		while(e.hasMoreElements())
			out.println(e.nextElement().toString()+"<br>");
	%>
	
	${"server-->client"}
	
	