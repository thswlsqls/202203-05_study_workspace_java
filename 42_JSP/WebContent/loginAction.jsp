<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%
 	String id=request.getParameter("id");
 	String pw=request.getParameter("pw");
 	
 	if(id!=null && pw != null && id.trim().length()>0 && pw.trim().length()>0){
 %>
 
 <h1>로그인 OK</h1>
 
 <%=id%>님 환영합니다.
 
 <%
 }else{
 	%>
 		<script>
 			alert("로그인시 계정은 필수")
 			location.href="login.jsp";	
 		</script>	
 	<%
 }
 %>