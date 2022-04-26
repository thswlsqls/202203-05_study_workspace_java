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

public class GuestBookUIAction implements Action {

	@Override
	public String action(HttpServletRequest request)
			throws ServletException, IOException, ClassNotFoundException, SQLException {

		String url = "guestBook.jsp";
		String s=request.getParameter("guestNo");
		int guestNo = Integer.parseInt(s);
		GuestBookVO v = null;
		HttpSession session = request.getSession();
		
		try {
			v = ((UserDAO)(request.getServletContext().getAttribute("dao"))).getGuestBook(guestNo);
			request.setAttribute("guestNo", v.getGuestNo());
			request.setAttribute("writer", v.getUserId());
			request.setAttribute("title", v.getTitle());
			request.setAttribute("content", v.getContent());
			request.setAttribute("inDate", v.getInDate());
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return url;
	}
}
