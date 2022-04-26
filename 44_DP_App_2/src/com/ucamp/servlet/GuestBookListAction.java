package com.ucamp.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.GuestBookVO;
import com.ucamp.model.UserDAO;

public class GuestBookListAction implements Action {

	@Override
	public String action(HttpServletRequest request)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		String url = "userMain.jsp";
		Collection<GuestBookVO> gbList = new ArrayList<GuestBookVO>();
		
		try {
			gbList = ((UserDAO)(request.getServletContext().getAttribute("dao"))).getGuestBooks();	
			request.setAttribute("gbList", gbList);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return url;
	}

}
