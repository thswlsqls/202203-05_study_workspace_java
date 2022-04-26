package com.ucamp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ucamp.model.GuestBookVO;
import com.ucamp.model.UserDAO;
import com.ucamp.model.UserVO;

public class GuestBookWriteAction implements Action {

	@Override
	public String action(HttpServletRequest request)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		String url="guestBookWrite.jsp";
		HttpSession session = request.getSession();
		
		String userId = (String) session.getAttribute("userId");
		String userPw = (String) session.getAttribute("userPw");
		String title=request.getParameter("title");
		String content=request.getParameter("content");

		Collection<GuestBookVO> gbList = new ArrayList<GuestBookVO>();
		
		try {
			if(((UserDAO)(request.getServletContext().getAttribute("dao"))).addGuestBook(userId, title, content)) {
				url="userMain.jsp";
			}else { request.setAttribute("isRequestSuccess", "false"); }
			gbList = ((UserDAO)(request.getServletContext().getAttribute("dao"))).getGuestBooks();
			
			request.setAttribute("gbList", gbList);
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

		return url;
	}

}
