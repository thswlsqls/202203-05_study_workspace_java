package com.test.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.test.model.UserDAO;
import com.test.model.UserWriterDAO;

public class AddUserWriterAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String url = "addUserWriter.jsp";
		HttpSession session = request.getSession();
		
		String writerPw = request.getParameter("writerPw");
		String contents = request.getParameter("contents");
		String userId = (String)session.getAttribute("userId");
		String writerName = (String)session.getAttribute("name");
		
		UserWriterDAO uwDao = (UserWriterDAO)(request.getServletContext().getAttribute("uwDao"));
		if(uwDao.addWriter(userId, writerName, writerPw, contents)) {
			url = "userMain.jsp";
		}
		
		return url;
	}

}
