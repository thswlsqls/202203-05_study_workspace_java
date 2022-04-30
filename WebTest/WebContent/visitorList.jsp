<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<h1>방명록 모두보기</h1>
	작성자검색: <input type="text" id="inputId" ><input type="button" id="searchWriter" value="검색"><br>
	<table>
		<thead>
			<tr>
				<td>번호</td>
				<td>작성자아이디</td>
				<td>작성일자</td>
			</tr>
		</thead>
		<tbody id="vListTbody">
		<c:forEach items="${vList}"  var="v" varStatus="status">
			<tr onclick = "location.href='./controller?cmd=visitorUI&visitorSeq=${v.visitorSeq}'">
				<td>${status.index+1}</td>
				<td>${v.memberId}</td>
				<td>${v.writerDate}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<c:if test="${memberId != null}">
		<a href="controller?cmd=addVisitorUI">새방명록등록</a>
	</c:if>
<script type="text/javascript">
	
	$("#searchWriter").click(function(){
		alert('검색클릭');
		var inputId = $('#inputId').val();
		alert(inputId);
		
		$.ajax({
			url: "./ajaxController?cmd=getVisitorListById",
			data: {"inputId": inputId},
			success: function(resp){
				console.log(resp);
				//location.href="controller?cmd=getVisitorListById&inputId="+inputId;
				$("#vListTbody").html('');
				for(let i = 0; i<resp.length; i++){
					let tbody = '<tr>';
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
			},
			error: function(request, status, error){
				console.log(request);
				alert("code:"+ request.status);
				console.log(error);
			}
		})
		
	})
</script>
</body>
</html>

