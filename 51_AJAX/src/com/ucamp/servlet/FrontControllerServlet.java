package com.ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerServlet
 */
@WebServlet("/controller")
public class FrontControllerServlet extends HttpServlet {
	
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html; charset=UTF-8");
			
				String cmd = request.getParameter("cmd");
				
				Action a = null;
				
				String url = "main.jsp";
				
				if(cmd==null) cmd="main";
				
				a = ActionFactory.getAction(cmd);
				
				url = a.action(request);
				
				request.getRequestDispatcher("/"+url).forward(request, response);
				
				System.out.println("controller--"+cmd);
		}
	
	
	
	}

