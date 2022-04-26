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

public class GuestBookDeleteAction implements Action {

	@Override
	public String action(HttpServletRequest request)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		
		String url = "userMain.jsp";
		HttpSession session = request.getSession();
		
		int guestNo = (int)session.getAttribute("guestNo");
		
		Collection<GuestBookVO> gbList = new ArrayList<GuestBookVO>();
		
		try {
			if(((UserDAO)(request.getServletContext().getAttribute("dao"))).deleteGuestBook(guestNo)) {
				gbList = ((UserDAO)(request.getServletContext().getAttribute("dao"))).getGuestBooks();	
				session.setAttribute("gbList", gbList);
			}else {
				request.setAttribute("isRequestSuccess", "false");
				url = "guestBook.jsp";
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return url;
	}

}
