<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>JSP에서는 HTML을 부분 삽입 쉽다.</h1>

<%! //JSP에서 자바 문법을 삽입
	// !는 주로 멤버(Data, Operation)를 정의
	private int count;
	public int getCount(){
		return ++count;
	}
%>

<% //_jspService() 내의 구현부 = 실제 사용자 요청에 의해서 항상 실행되는 메서드
	for(int i=0; i<10; i++){ %>
		<h2> <%=i %> </h2>
	<% }//for %>
