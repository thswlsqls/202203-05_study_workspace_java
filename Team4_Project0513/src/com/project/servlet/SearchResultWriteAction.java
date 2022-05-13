package com.project.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.project.model.BoardVO;
import com.project.model.WriterDAO;

public class SearchResultWriteAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String url = "search.jsp";
		String writeDate=request.getParameter("wd");
		String penName = request.getParameter("pn");
		String suggestionName = request.getParameter("sn");
		System.out.println(writeDate);
		Collection<BoardVO> list = null;
		
		list = new WriterDAO().getSearchResultWrite(penName, suggestionName, writeDate);
		if (list.size()!=0) {
			url = "searchResultWrite.jsp";
			request.setAttribute("list", list);
		}
		System.out.println(list);
		return url;
	}

}
