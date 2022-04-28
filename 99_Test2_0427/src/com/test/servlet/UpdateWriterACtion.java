package com.test.servlet;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.test.model.UserWriterDAO;
import com.test.model.UserWriterVO;

public class UpdateWriterACtion implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String url = "updateWriter.jsp";
		
		String inputWriterPw = request.getParameter("inputWriterPw");
		String updateContents = request.getParameter("updateContents");
		String userWriterNo = request.getParameter("userWriterNo");
		
		System.out.println(inputWriterPw + updateContents + userWriterNo);

		Collection<UserWriterVO> uwlist = new ArrayList<UserWriterVO>();
		UserWriterVO uw = null;
		
		UserWriterDAO uwDao = (UserWriterDAO) request.getServletContext().getAttribute("uwDao");
		System.out.println(uwDao.getWriterPw(userWriterNo));
		
		if(uwDao.getWriterPw(userWriterNo).equals(inputWriterPw)) {
			/**방명록 수정*/
			if(uwDao.updateWriter(userWriterNo, updateContents)) {
				/**새로운 방명록 리스트 가져오기*/
				uwlist = uwDao.getUserWriterList();
				request.setAttribute("uwList", uwlist);
				url = "userMain.jsp";
			}
		}else {
			uw = uwDao.getUserWriter(userWriterNo);
			request.setAttribute("uw", uw);
		}
		
		return url;
	}
}
