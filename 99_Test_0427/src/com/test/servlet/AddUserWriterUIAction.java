package com.test.servlet;

import javax.servlet.http.HttpServletRequest;

public class AddUserWriterUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		return "addUserWriter.jsp";
	}

}
