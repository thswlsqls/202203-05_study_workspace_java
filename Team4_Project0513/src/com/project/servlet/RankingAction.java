package com.project.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.project.model.BoardVO;
import com.project.model.WriterDAO;

public class RankingAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String writeNo = request.getParameter("writeNo");
		String url = "ranking.jsp";
		Collection<BoardVO> list = new WriterDAO().getRankBoard(writeNo);
		
		if(list.size() != 0) {
			url="rankingWrite.jsp";
			request.setAttribute("list", list);
			System.out.println(list);
		}
		return url;
	}

}
