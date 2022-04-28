package com.test.servlet;

import java.io.IOException;
import java.lang.reflect.Member;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.model.MemberDAO;

@WebServlet("/controller")
public class FrontServletController extends HttpServlet {
	
	@Override
		public void init(ServletConfig config) throws ServletException {
			super.init(config);

			ServletContext application=getServletContext();
			if(application.getAttribute("dao")==null) {
				application.setAttribute("dao", new MemberDAO());
			}
		}
	
	protected void service(HttpServletRequest request
			, HttpServletResponse response) 
					throws ServletException
					, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String url = "main.jsp";
		String cmd = "main";
		
		if(request.getParameter("cmd") != null) {
			cmd = request.getParameter("cmd");
		}
		
		Action a = ActionFactory.getAction(cmd);
		try {
			url = a.action(request);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/"+url).forward(request, response);
	}

}
