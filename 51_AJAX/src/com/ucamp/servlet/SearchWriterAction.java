package com.ucamp.servlet;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.ucamp.model.Writer;
import com.ucamp.model.WriterDAO;

public class SearchWriterAction implements Action {

	@Override
	public String action(HttpServletRequest request) {	
		String userId = request.getParameter("userId");
		
		WriterDAO dao = new WriterDAO();
		
		Collection<Writer> list = dao.searchWriter(userId);

		//
		Gson gson = new Gson();
		String json = gson.toJson(list);
		//
		
//		request.setAttribute("list", list);
		request.setAttribute("list", json);
		
		System.out.println(request.getAttribute("list"));
		System.out.println(json);
		
		return "GsonTextList.jsp";
	}
}

