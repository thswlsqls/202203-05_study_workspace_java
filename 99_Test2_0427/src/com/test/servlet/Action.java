package com.test.servlet;

import javax.servlet.http.HttpServletRequest;

public interface Action {
	
	String action(HttpServletRequest request);

}
