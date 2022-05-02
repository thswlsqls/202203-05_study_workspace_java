package com.ucamp.servlet;

import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.WriterDAO;

public class UpdateContentAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		int writerNumber = Integer.parseInt(request.getParameter("writerNumber"));
		String id = (String) request.getSession().getAttribute("loginOK");
		String pw = request.getParameter("password");	
		String content = request.getParameter("content");
		
		WriterDAO dao = new WriterDAO();
		dao.updateContent(content, writerNumber,id, pw);
		
		
		return "index.html";
	}

}
