package com.ucamp.servlet;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.Writer;
import com.ucamp.model.WriterDAO;

public class SearchWriterAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String userId = request.getParameter("userId");
		
		WriterDAO dao = new WriterDAO();
		
		Collection<Writer> list = dao.searchWriter(userId);

		request.setAttribute("list", list);
		
		return "list.jsp";
	}

}
