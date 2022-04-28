package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import ucamp.model.MemberDAO;

public class LoginAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String url = "index.html";
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String result ="";
		
		result = new MemberDAO().login(id,pw);
		if (result.length() != 0) {
			url = "controller?cmd=userpageUI";
			session.setAttribute("id", id);
			session.setAttribute("name", result);
		}
		
		return url;
	}

}

