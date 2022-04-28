package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public interface Action {
	/** 서블릿에서 request, url 제공*/
	String action(HttpServletRequest request)
	  	throws ServletException,IOException;
}
