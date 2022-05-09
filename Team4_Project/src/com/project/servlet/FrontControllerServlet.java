package com.project.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.model.UserDAO;

/**
 * Servlet implementation class FrontControllerServlet
 */
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
		
		
		request.setCharacterEncoding("utf-8");
		
		String cmd=request.getParameter("cmd");
		Action a=null;
		String url="home.jsp";
		if(cmd == null) cmd="main";
		
		//if(cmd !=null) {
			a=ActionFactory.getAction(cmd);
			url=a.action(request);
		//}
		
		//사후 공통 코드
		request.getRequestDispatcher("/"+url).forward(request, response);
		
		System.out.println("controller-- "+ cmd);
	}


}
