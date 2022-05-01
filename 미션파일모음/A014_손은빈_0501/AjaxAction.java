package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AjaxAction {
	/** 서블릿에서 request, response, data 제공*/
	Object action(HttpServletRequest request
			, HttpServletResponse response)
	  	throws ServletException,IOException;
}
