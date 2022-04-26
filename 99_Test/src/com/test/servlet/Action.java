package com.test.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public interface Action {
	
	String action(HttpServletRequest request) throws SQLException, ClassNotFoundException;

}
