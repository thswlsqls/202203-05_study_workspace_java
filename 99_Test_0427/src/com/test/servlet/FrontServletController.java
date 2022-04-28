package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.model.UserDAO;
import com.test.model.UserWriterDAO;

@WebServlet("/controller")
public class FrontServletController extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {	
		super.init(config);
	
		/**암기*/
		ServletContext application=getServletContext();
		if(application.getAttribute("uDao")==null) {
			application.setAttribute("uDao", new UserDAO());
		}
		if(application.getAttribute("uwDao")==null) {
			application.setAttribute("uwDao", new UserWriterDAO());
		}
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/**암기*/
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String cmd = request.getParameter("cmd");
		String url = "main.jsp";
		Action a = null;
		
		if(cmd == null) {
			url = "main.jsp";
		}
		
		if (cmd != null) {
			a = ActionFactory.getAction(cmd);
			url = a.action(request);
		}
		
		request.getRequestDispatcher("/"+url).forward(request, response);
		System.out.println("controller : "+cmd);
	
	}

}
