package com.ucamp.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("loginOK") != null)
			session.invalidate();
		return "index.html";
	}

}
