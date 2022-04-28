package com.test.servlet;

import javax.servlet.http.HttpServletRequest;

public class MainAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		return "main.jsp";
	}

}
