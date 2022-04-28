package com.test.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MainAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws SQLException, ClassNotFoundException {

		return "main.jsp";
	}
}
