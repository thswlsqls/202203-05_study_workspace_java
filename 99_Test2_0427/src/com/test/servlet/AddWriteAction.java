package com.test.servlet;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.test.model.UserWriterDAO;
import com.test.model.UserWriterVO;

public class AddWriteAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		String url = "addWrite.jsp";
		HttpSession session = request.getSession();
		
		String userId = (String) session.getAttribute("userId");
		String writerName = (String) session.getAttribute("name");
		String writerPw = request.getParameter("writerPw");
		String contents = request.getParameter("contents");
		
		Collection<UserWriterVO> uwList = new ArrayList<UserWriterVO>();
			
		UserWriterDAO uwDao = (UserWriterDAO) request.getServletContext().getAttribute("uwDao");
		if(uwDao.addUserWriter(userId, writerName, writerPw, contents)) {
			url = "userMain.jsp";
			uwList = uwDao.getUserWriterList();
			session.setAttribute("uwList", uwList);
		}
		return url;
	}
}
