package com.ucamp.servlet;

import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.WriterDAO;

public class RemoveContentAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String pw = request.getParameter("password");
		int writerNumber = Integer.parseInt(request.getParameter("writerNumber"));
		String id = (String) request.getSession().getAttribute("loginOK");
		
		WriterDAO dao = new WriterDAO();
		dao.removeWriter(writerNumber, id, pw);
		
		return "index.html";
	}

}
