package com.ucamp.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class professorsignupUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ClassNotFoundException, SQLException {
		
		return "professorSignup.jsp";
	}

}
