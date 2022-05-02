<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.6.0.js"></script>
<script type="text/javascript">

var updateContentAction = function(writerNumber){
	var content = document.getElementById("content").value;
	var password = document.getElementById("password").value;
	
	//location.href = "controller?cmd=updateContentAction&writerNumber=" + writerNumber + "&content=" + content + "&password=" + password;
	
	$.ajax({
		url : "controller?cmd=updateContentAction",
		type : "post",		
		data : {"content" : content, "password" : password, "writerNumber" : writerNumber},
		success : function(result){
			location.href = "controller?cmd=main";
		}
		
	})
}

var removeWriterAction = function(writerNumber){
	var password = document.getElementById("password").value;
	location.href = "controller?cmd=removeWriterAction&writerNumber=" + writerNumber + "&password=" + password;
}

</script>
</head>
<body>
<ul>
<c:forEach items="${list}" var="w">
<li>${w.writerNumber} : <input type="hidden" value="${w.writerNumber}"  id="writNumber">
${w.userId}
<c:if test="${ loginOK eq w.userId }">
<textarea rows="1" cols="20" id="content">${ w.content }</textarea>
pw:<input type="password"  id="password">
</c:if>
<c:if test="${ loginOK ne w.userId }">
${ w.content } 
</c:if>
: ${ w.writerDate } 
<c:if test="${ loginOK eq w.userId }">
<button onclick="updateContentAction(${w.writerNumber})">수정</button> <button onclick="removeWriterAction(${w.writerNumber})">삭제</button>
</c:if>
</li>
</c:forEach>
</ul>

</body>
</html>