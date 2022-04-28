package com.test.servlet;

import javax.servlet.http.HttpServletRequest;

public class LoginUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		return "login.jsp";
	}

}
