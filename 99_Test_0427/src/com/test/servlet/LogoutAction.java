package com.test.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "main.jsp";
	}

}
