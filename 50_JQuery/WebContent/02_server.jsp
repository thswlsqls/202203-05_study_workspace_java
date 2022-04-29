<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<%
		System.out.println("브라우저가 요청");
		
		Thread.sleep(5000);
		
		System.out.println("서버의 내용 끝");
	%>
	
	${"server-->client"}