//package com.project.servlet;
//
//import java.io.IOException;
//import java.util.Collection;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//
//import com.project.model.BoardVO;
//import com.project.model.WriterDAO;
//
//public class SearchResultWriteAction implements Action {
//
//	@Override
//	public String action(HttpServletRequest request) throws ServletException, IOException {
//		String url = "search.jsp";
//		String writeNo=request.getParameter("writeNo");
//		Collection<BoardVO> list = null;
//		
//		list = new WriterDAO().getSearchResultWrite(writeNo);
//		if (list.size()!=0) {
//			url = "searchResultWrite.jsp";
//			request.setAttribute("list", list);
//		}
//		
//		return url;
//	}
//
//}
