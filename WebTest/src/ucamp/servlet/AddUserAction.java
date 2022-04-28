package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import ucamp.model.MemberDAO;

public class AddUserAction implements Action {

	@Override
	public String action(HttpServletRequest request) 
			throws ServletException, IOException {
		
		String url = "addUser.jsp";
		
		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		String pw1 = request.getParameter("pw1");
		String pw2 = request.getParameter("pw2");
		String pw = null;
		if(pw1.equals(pw2)) {
			pw = pw1;
		}
		String gender = request.getParameter("gender");
		String[] hobbyList = request.getParameterValues("hobby");
		String hobby = "";
		for (String h : hobbyList) {
			hobby += h;
			hobby += " ";
		}
		String blood = request.getParameter("blood");
		MemberDAO mDao = (MemberDAO) request.getServletContext().getAttribute("mDao");
		if(mDao.addUser(userId, name, pw, gender, hobby, blood)) {
			url = "login.jsp";
		}

		return url;
	}

}
