package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public interface Action {
	/** �������� request, url ����*/
	String action(HttpServletRequest request)
	  	throws ServletException,IOException;
}
