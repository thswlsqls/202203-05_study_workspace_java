package com.test.servlet;

import javax.servlet.http.HttpServletRequest;

import com.test.model.UserDAO;

public class AddUserAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String url = "addUser.jsp";
		String userId = request.getParameter("userId");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		UserDAO uDao = (UserDAO) request.getServletContext().getAttribute("uDao");
		if(uDao.addUser(userId, pw, name)) {
			url = "login.jsp";
		}
		
		return url;
	}

}
