package com.project.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.project.model.WriterDAO;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class SetShareStatusAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {

		
		
		HttpSession session = request.getSession();
		WriterDAO wDAO = new WriterDAO();
		
		
		String shareStatus = request.getParameter("shareStatus");
		String writeNo = request.getParameter("writeNo");
		String userId = (String)session.getAttribute("userId");
		
		
		
		
		
		try {
			if(wDAO.setShareStatus(shareStatus, writeNo, userId)) 
				request.setAttribute("result", "true");
			else request.setAttribute("result", "false");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return "shareStatusResult.jsp";
	}

}
