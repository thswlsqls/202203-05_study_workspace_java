package com.test.servlet;

import javax.servlet.http.HttpServletRequest;

public class AddUserUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		return "addUser.jsp";
	}

}
