<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <h1>Main Page</h1>
<%@ include file="menu.jsp" %>  
    
    <h1>부서 리스트</h1>
<ul>
	<c:forEach items="${list}" var="uw" >
		<li> ${uw.writerNumber} : ${uw.contents}  </li>
	</c:forEach>
</ul>
    
    