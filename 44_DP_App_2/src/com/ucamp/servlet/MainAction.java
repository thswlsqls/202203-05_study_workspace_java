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

public class MainAction implements Action {
	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String url = "main.jsp";
		
		Collection<GuestBookVO> gbList = new ArrayList<GuestBookVO>();
		HttpSession session = request.getSession();
		
//		String userId = (String) session.getAttribute("userId");
//		if(userId != null) {
//			url = "userInfo.jsp";
//		}else {
//			url = "main.jsp";
//		}
		
		try {
			gbList = ((UserDAO)(request.getServletContext().getAttribute("dao"))).getGuestBooks();
			request.setAttribute("gbList", gbList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return url;
	}
}
