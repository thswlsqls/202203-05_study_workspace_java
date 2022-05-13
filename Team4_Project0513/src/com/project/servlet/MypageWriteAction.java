package com.project.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.project.model.BoardVO;
import com.project.model.InteractionDAO;
import com.project.model.WriterDAO;

public class MypageWriteAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String url = "mypage.jsp";
		HttpSession session = request.getSession();
		String userId = session.getAttribute("userId").toString();
		String writeNo = request.getParameter("wn");
		//Collection<BoardVO> list = null;
		
		BoardVO v = new WriterDAO().getMyPageWrite(userId,writeNo);
		
		//list = new WriterDAO().getMyPageWrite(userId,writeNo);
		
//		if (list.size() != 0) {
//			url = "mypageWriteResult.jsp";
//			request.setAttribute("list", list);
//		}
		if(v != null) {
			url = "details.jsp";
			request.setAttribute("board", v);
			request.setAttribute("writeNo", writeNo);
		}
		System.out.println(v);
		return url;
	}

}
