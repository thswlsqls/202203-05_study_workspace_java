package com.ucamp.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public interface Action {
	
	public String action(HttpServletRequest request) throws ClassNotFoundException, SQLException;
		
	
}
