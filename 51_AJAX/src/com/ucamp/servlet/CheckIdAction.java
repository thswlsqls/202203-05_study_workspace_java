package com.ucamp.servlet;

import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.UserDAO;

public class CheckIdAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String userId = request.getParameter("id");
		
		UserDAO dao = new UserDAO();
		
		
		if(dao.checkId(userId) == 0) 
			request.setAttribute("result", "true"); 
		else
			request.setAttribute("result", "false");
		 
		/*
		 * System.out.println(userId); dao.checkId(userId);
		 */
		
		return "result.jsp";
	}

}
