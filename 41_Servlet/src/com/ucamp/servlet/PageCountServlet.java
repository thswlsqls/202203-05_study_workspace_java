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
		System.out.println("init() - ��ü�� ���� �� ���� ȣ��Ǵ� �޼��� : �ʱ�ȭ");
//		super.init();
	}
	
	// �ּ��̶� �ڵ带 �����ϸ� �޸𸮿� �ڵ�� ������ �ٸ�.
	@Override
	protected void service(HttpServletRequest req
						   , HttpServletResponse resp) 
								 throws ServletException
								 		, IOException {
		System.out.println(count++ + "��° client");
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
		System.out.println("haep ���� �Ǳ� ������ ȣ�� - �ڿ� ��ȯ");
//		super.destroy();
	}
	
}
