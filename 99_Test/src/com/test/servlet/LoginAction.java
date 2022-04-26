package com.test.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.test.model.MemberDAO;

public class LoginAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws SQLException, ClassNotFoundException {
		
		String url = "login.jsp";
		String userId = request.getParameter("userId");
		String pw = request.getParameter("pw");
		
		String name = ((MemberDAO)(request.getServletContext().getAttribute("mDAO"))).login(userId, pw);
		if(name != null) {
			url = "userMain.jsp";
		}
		
		return url;
	}

}
