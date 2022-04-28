package com.test.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.test.model.MemberDAO;

public class LoginAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws SQLException, ClassNotFoundException {
		
		String url = "login.jsp";
		String userId = request.getParameter("userId");
		String pw = request.getParameter("pw");
		
		HttpSession session = request.getSession();
		
		String name = ((MemberDAO)(request.getServletContext().getAttribute("mDAO"))).login(userId, pw);
		if(name != null) {
			session.setAttribute("loginOK", "true");
			session.setAttribute("userId", userId);
			session.setAttribute("name", name);
			session.setAttribute("pw", pw);
			url = "userMain.jsp";
		}
		
		return url;
	}

}
