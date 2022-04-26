package com.test.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class SignupUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws SQLException, ClassNotFoundException {
		
		return "signup.jsp";
	}
}
