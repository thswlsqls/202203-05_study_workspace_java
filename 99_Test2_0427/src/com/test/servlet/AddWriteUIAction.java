package com.test.servlet;

import javax.servlet.http.HttpServletRequest;

public class AddWriteUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		return "addWrite.jsp";
	}

}
