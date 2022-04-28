package com.test.servlet;

import javax.servlet.http.HttpServletRequest;

import com.test.model.UserWriterDAO;
import com.test.model.UserWriterVO;

public class UserWriterUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String userWriterNo = request.getParameter("userWriterNo");
		

		UserWriterVO uw = null;
		
		UserWriterDAO uwDao = (UserWriterDAO) request.getServletContext().getAttribute("uwDao");
		uw = uwDao.getUserWriter(userWriterNo);
		request.setAttribute("uw", uw);

		return "userWriter.jsp";
	}

}
