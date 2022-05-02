<%@page import="com.google.gson.JsonObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%
 	// Action 문자열
 	request.setAttribute("result", "message");

 	// Action에서 JSON 수정
 	JsonObject jsonObject = new JsonObject();
 	jsonObject.addProperty("결과2","message2");
 	request.setAttribute("result2", jsonObject);
 %>

 Text 전달  - ${result} <br>
 JSON 수동 변경 = {"결과" : "${result}" } <br>
 
 <% 
 	JsonObject j=new JsonObject();
 	j.addProperty("결과", (String)request.getAttribute("result"));
 	out.print(j.toString());
 %>
 <br>
 <!-- Action Json - ${result2} -->
 
 