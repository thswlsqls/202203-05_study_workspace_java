package com.test.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.test.model.UserDAO;

public class LoginAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		String url = "login.jsp";
		HttpSession session = request.getSession();
		
		String userId = request.getParameter("userId");
		String pw = request.getParameter("pw");
		
		String name = null;
		UserDAO uDao = (UserDAO)(request.getServletContext().getAttribute("uDao"));
		
		name = uDao.login(userId, pw);
		if(name != null) {
			session.setAttribute("name", name);
			session.setAttribute("userId", userId);
			url = "userMain.jsp";
		}
		
		return url;
	}

}
