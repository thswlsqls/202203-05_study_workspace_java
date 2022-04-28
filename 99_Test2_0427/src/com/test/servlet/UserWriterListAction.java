package com.test.servlet;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.test.model.UserDAO;
import com.test.model.UserVO;
import com.test.model.UserWriterDAO;
import com.test.model.UserWriterVO;

public class UserWriterListAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		Collection<UserWriterVO> uwList = new ArrayList<UserWriterVO>();
		
		UserWriterDAO uwDao = (UserWriterDAO) request.getServletContext().getAttribute("uwDao");
		
		uwList = uwDao.getUserWriterList();
		request.setAttribute("uwList", uwList);
		
		return "userWriterList.jsp";
	}

}
