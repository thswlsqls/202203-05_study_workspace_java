package com.ucamp.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ucamp.model.UserDAO;

//���� �ڵ�� ����   ex)controller?cmd=loginUI
@WebServlet("/controller")
public class FrontControllerServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		ServletContext application=getServletContext();
		if(application.getAttribute("dao")==null) {
			application.setAttribute("dao", new UserDAO());
		}
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");

		String cmd=request.getParameter("cmd");
		Action a=null;
		String url="main.jsp"; //������ ó�� �����ϴ� ������
		
		if(cmd == null) cmd="main";
		
		if(cmd !=null) {
			a=ActionFactory.getAction(cmd);
			try {
				url=a.action(request);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		//���� ���� �ڵ�
		request.getRequestDispatcher("/"+url).forward(request, response);
		System.out.println("controller-- "+ cmd);
	}
}
