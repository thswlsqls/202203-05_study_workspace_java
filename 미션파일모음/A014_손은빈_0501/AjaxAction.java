package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AjaxAction {
	/** �������� request, response, data ����*/
	Object action(HttpServletRequest request
			, HttpServletResponse response)
	  	throws ServletException,IOException;
}
