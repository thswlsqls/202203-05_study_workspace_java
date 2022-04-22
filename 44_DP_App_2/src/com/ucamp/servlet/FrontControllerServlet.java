package com.ucamp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//���� �ڵ�� ����   ex)controller?cmd=loginUI
@WebServlet("/controller")
public class FrontControllerServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String cmd=request.getParameter("cmd");
		Action a=null;
		String url="main.jsp"; //������ ó�� �����ϴ� ������
		
		if(cmd !=null) {
			a=ActionFactory.getAction(cmd);
			try {
				url=a.action(request);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//���� ���� �ڵ�
		request.getRequestDispatcher("/"+url).forward(request, response);
		
		System.out.println("controller-- "+ cmd);
	}

}
