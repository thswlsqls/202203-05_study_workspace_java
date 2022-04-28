package com.test.servlet;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.test.model.UserWriterDAO;
import com.test.model.UserWriterVO;

public class MainAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		Collection<UserWriterVO> uwlist = new ArrayList<UserWriterVO>();
		UserWriterDAO uwDao = (UserWriterDAO) request.getServletContext().getAttribute("uwDao");
		uwlist = uwDao.getUserWriterList();
		request.setAttribute("uwList", uwlist);
		
		return "main.jsp";
	}

}
