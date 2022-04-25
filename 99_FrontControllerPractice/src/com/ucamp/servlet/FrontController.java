package com.ucamp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.awt.datatransfer.DataTransferer.ReencodingInputStream;

@WebServlet("/controller")
public class FrontController extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "login.jsp";
		String cmd = request.getParameter("cmd");
		Action a = null;
		
			try {
				if (cmd !=null) {
				a = ActionFactory.getAction(cmd);
				url = a.action(request);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		request.getRequestDispatcher("/"+url).forward(request, response);
		System.out.println("controller -- "+cmd);
	}

}
