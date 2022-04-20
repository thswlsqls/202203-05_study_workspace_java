package com.ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page")
public class PageCountServlet extends HttpServlet {
	private int count;
	private String name;
	
	//new
	public PageCountServlet() {
		System.out.println("PageCountServlet()");
	}
	
	@Override
	public void init() throws ServletException {
		count=10;
		System.out.println("init() - 객체를 생성 후 최초 호출되는 메서드 : 초기화");
//		super.init();
	}
	
	// 주석이라도 코드를 수정하면 메모리에 코드는 원본과 다름.
	@Override
	protected void service(HttpServletRequest req
						   , HttpServletResponse resp) 
								 throws ServletException
								 		, IOException {
		System.out.println(count++ + "번째 client");
		System.out.println(name.charAt(0));
//		super.service(req, resp);
	}
	
//	@Override
//	protected void doGet(HttpServletRequest req
//						 , HttpServletResponse resp) 
//								 throws ServletException
//								 		, IOException {
//		System.out.println("doGet()");
////		super.doGet(req, resp);
//	}
	
	@Override
	protected void doPost(HttpServletRequest req
						  , HttpServletResponse resp) 
								  throws ServletException
								  		 , IOException {
		System.out.println("doPost()");
//		super.doPost(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("haep 해제 되기 직전에 호출 - 자원 반환");
//		super.destroy();
	}
	
}
