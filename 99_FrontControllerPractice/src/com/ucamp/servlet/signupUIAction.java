package com.ucamp.servlet;

import javax.servlet.http.HttpServletRequest;

public class signupUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) {

		return "signup.jsp";
	}

}
