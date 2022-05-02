package com.ucamp.servlet;

import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.WriterDAO;

public class AddWriterAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		String id = (String) request.getSession().getAttribute("loginOK");
		String name = (String) request.getSession().getAttribute("loginName");
		String pw = request.getParameter("pw");
		String contents = request.getParameter("contents");
		
		WriterDAO dao = new WriterDAO();
		dao.addWriter(contents, id, pw, name);
		
		
		return "index.html";
	}

}
