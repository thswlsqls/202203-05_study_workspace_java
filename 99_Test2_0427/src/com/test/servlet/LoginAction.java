package com.test.servlet;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.test.model.UserDAO;
import com.test.model.UserVO;
import com.test.model.UserWriterDAO;
import com.test.model.UserWriterVO;

public class LoginAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String url = "login.jsp";
		String userId = request.getParameter("userId");
		String pw = request.getParameter("pw");
		
		HttpSession session = request.getSession();
		Collection<UserWriterVO> uwList = new ArrayList<UserWriterVO>();
		
		UserVO v = null;
		
		UserDAO uDao = (UserDAO) request.getServletContext().getAttribute("uDao");
		UserWriterDAO uwDao = (UserWriterDAO) request.getServletContext().getAttribute("uwDao");
		String name = uDao.login(userId, pw);
		if(name != null) {
			url = "userMain.jsp";
			session.setAttribute("name", name);
			session.setAttribute("userId", userId);
			v = uDao.getUser(userId);
			session.setAttribute("pw", v.getPw());
			session.setAttribute("inDate", v.getInDate());
			
			uwList = uwDao.getUserWriterList();
			request.setAttribute("uwList", uwList);
		}
		
		return url;
	}

}
