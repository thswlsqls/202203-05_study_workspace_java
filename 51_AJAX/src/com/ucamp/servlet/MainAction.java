package com.ucamp.servlet;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.Writer;
import com.ucamp.model.WriterDAO;

public class MainAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		WriterDAO dao = new WriterDAO();
		Collection<Writer> list = dao.getWriters();
	
		request.setAttribute("list", list);
		
		return "main.jsp";
	}

}
