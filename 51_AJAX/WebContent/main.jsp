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
<h1>메인페이지</h1>
<%@ include file="menu.jsp" %>
<input id="search"><button id="search">검색</button>
<div>
<ul id="writerList">

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
</div>
<script type="text/javascript">
	$("button[id='search']").on("click", function(){
		var search = $("input[id='search']").val();
		
		$.ajax({ 
			url : "controller?cmd=searchWriterAction",
			data : {userId : search},
			success : function(resp){
				console.log(resp);
				//$("div").html(resp);
				jsonResp = JSON.parse(resp);
			
				$("#writerList").html('');
				for(let i=0; i<jsonResp.length; i++){
					console.log(jsonResp[i]);
					let writerList = '<li>'+ (i+1) + ' : ' + jsonResp[i].userId +  ' ' + jsonResp[i].content + ' ' + jsonResp[i].writerDate  + '</li>';	
					$('#writerList').append(writerList);
				}
			}
		})
	})
	
</script>

<!-- 
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
								$("#vListTbody").html('');
				for(let i = 0; i<resp.length; i++){
					let tbody = '<tr onclick = \"location.href=\'\.\/controller?cmd=visitorUI&visitorSeq=' 
							+resp[i].visitorSeq+'\'\">';
					tbody += '<td>' + (i+1) + '</td>'
					tbody += '<td>' + resp[i].memberId + '</td>'
					tbody += '<td>' + resp[i].writerDate + '</td>'
					tbody += '</tr>';
					//JS에서 html 태그 만드는 방법 
					//.html() : 덮어쓰는형식
					//.after() : 뒤에추가해줌
					//.before() : 앞에추가해줌
					//.append() : 선택 태그 내부에 추가
					$('#vListTbody').append(tbody);
				}
 -->
 
</body>
</html>