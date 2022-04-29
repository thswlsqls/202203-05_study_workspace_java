package ucamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;

import ucamp.model.MemberDAO;

public class AddUserIdCheckAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		
		String url = "addUser.jsp";
		
		String inputId = request.getParameter("inputId");
		
		ServletContext application = request.getServletContext();
		
		MemberDAO mDao = (MemberDAO) request.getServletContext().getAttribute("mDao");
		if(mDao.isValidAddMemberId(inputId)) {

		}

		return url;
	}

}
