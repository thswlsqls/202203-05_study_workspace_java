package com.test.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.test.model.UserDAO;

public class AddUserAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		String url = "addUser.jsp";
		HttpSession session = request.getSession();
		
		String userId = request.getParameter("userId");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
//		System.out.println(name);
		UserDAO uDao = (UserDAO)(request.getServletContext().getAttribute("uDao"));
		if(uDao.addUser(userId, pw, name)) {
//			System.out.println(userId);
			url = "login.jsp";
		}
		
		return url;
	}

}
