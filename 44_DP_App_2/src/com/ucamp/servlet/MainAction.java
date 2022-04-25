package com.ucamp.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class MainAction implements Action {
	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		return "main.jsp";
	}
}
