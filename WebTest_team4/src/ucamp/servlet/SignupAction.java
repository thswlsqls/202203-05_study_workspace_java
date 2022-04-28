package ucamp.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import ucamp.model.MemberDAO;

public class SignupAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String url = "signup.jsp";
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String[] hobby = request.getParameterValues("hobby");
		System.out.println(blood);
		if (new MemberDAO().addUser(id,name,pw,gender,Arrays.toString(hobby),blood)) {
			url = "main.jsp"; 
		}
		
		return url;
	}

}

