package com.ucamp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginAction.do")
public class LoginActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request
			, HttpServletResponse response) 
					throws ServletException
					, IOException {
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		String url="login.jsp"; //No
		
		//DAO »£√‚
		if(id.equals("admin") && pw.equals("1234")) {
			url="memberInfo.jsp"; //Yes
		}
		
		request.getRequestDispatcher("/"+url).forward(request, response);
	}

}
