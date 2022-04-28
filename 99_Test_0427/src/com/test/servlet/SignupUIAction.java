package com.test.servlet;

import javax.servlet.http.HttpServletRequest;

public class SignupUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		return "addUser.jsp";
	}

}
