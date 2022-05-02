package com.ucamp.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ucamp.model.UserDAO;

public class LoginAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(new UserDAO().login(id, pw).length() != 0) {
			HttpSession session = request.getSession();
			session.setAttribute("loginOK", id);
			session.setAttribute("loginName", new UserDAO().login(id, pw));
		}
		
		return "userPage.jsp";
	}

}
