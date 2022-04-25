package com.ucamp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class GuestBookWriteUIAction implements Action {

	@Override
	public String action(HttpServletRequest request)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		
		return "guestBookWrite.jsp";
	}

}
