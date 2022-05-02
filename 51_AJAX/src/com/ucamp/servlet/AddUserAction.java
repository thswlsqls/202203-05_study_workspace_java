package com.ucamp.servlet;

import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.UserDAO;

public class AddUserAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String url = "addUser.jsp";
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		if(new UserDAO().addUser(id, pw, name))
			url = "login.jsp";
		
		return url;
	}

}
