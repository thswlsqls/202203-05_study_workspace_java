package com.ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ucamp.model.MemberDAO;

//공통 코드로 제공   ex)controller?cmd=loginUI
@WebServlet("/controller")
public class FrontControllerServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		ServletContext application=getServletContext();
		if(application.getAttribute("dao")==null) {
			application.setAttribute("dao", new MemberDAO());
		}
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//사전 공통
		request.setCharacterEncoding("utf-8");
		
		String cmd=request.getParameter("cmd");
		Action a=null;
		String url="main.jsp"; //무조건 처음 시작하는 페이지
		
		if(cmd == null) cmd="main";
		
		if(cmd !=null) {
			a=ActionFactory.getAction(cmd);
			url=a.action(request);
		}
		
		//사후 공통 코드
		request.getRequestDispatcher("/"+url).forward(request, response);
		
		System.out.println("controller-- "+ cmd);
	}

}
