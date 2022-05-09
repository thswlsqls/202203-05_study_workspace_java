package com.project.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class NewListUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		// TODO Auto-generated method stub
		return "newList.jsp";
	}

}
