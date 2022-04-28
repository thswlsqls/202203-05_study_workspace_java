package com.test.servlet;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.test.model.UserWriterDAO;
import com.test.model.UserWriterVO;

public class DeleteWriterAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String url = "userWriter.jsp";
		String inputWriterPw = request.getParameter("inputWriterPw");
		String userWriterNo = request.getParameter("userWriterNo");

		System.out.println(inputWriterPw+userWriterNo);
		
		Collection<UserWriterVO> uwlist = new ArrayList<UserWriterVO>();
		
		UserWriterDAO uwDao = (UserWriterDAO) request.getServletContext().getAttribute("uwDao");
		if(uwDao.getWriterPw(userWriterNo).equals(inputWriterPw)) {
			/**���� ����*/
			if(uwDao.deleteWriter(userWriterNo)) {
				/**���ο� ���� ����Ʈ ��������*/
				uwlist = uwDao.getUserWriterList();
				request.setAttribute("uwList", uwlist);
				url = "userMain.jsp";
			};	
		}
		
		return url;
	}

}
