package com.ucamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/missionLoginAction")
public class MissionLoginActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request
						   , HttpServletResponse response) 
								   throws ServletException
								   		  , IOException {
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		System.out.println(id + " " + pw);
	
		PrintWriter out=response.getWriter();
		out.println("¾ÆÀÌµð:"+id);
		out.close();
		
	}

}
