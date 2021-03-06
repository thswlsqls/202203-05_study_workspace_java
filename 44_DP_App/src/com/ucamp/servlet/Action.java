package com.ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

// JavaBean = 순수 자바 문법으로 사용자 필요에 의해서 개발.
public interface Action {
	// 서블릿에서 공통 코드를 처리하면 Action은 업무별 내용을 처리하면 되고, 결과 이동할 페이지 주소(String)
	String action(HttpServletRequest request) throws ServletException, IOException;
}



