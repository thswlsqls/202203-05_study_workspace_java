package com.test.servlet;

import javax.servlet.http.HttpServletRequest;

import com.test.model.UserWriterDAO;
import com.test.model.UserWriterVO;

public class UpdateWriterUIACtion implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String userWriterNo = request.getParameter("userWriterNo");
		UserWriterDAO uwDao = (UserWriterDAO) request.getServletContext().getAttribute("uwDao");
				
		UserWriterVO uw = uwDao.getUserWriter(userWriterNo);
		request.setAttribute("uw", uw);
		
		return "updateWriter.jsp";
	}

}
