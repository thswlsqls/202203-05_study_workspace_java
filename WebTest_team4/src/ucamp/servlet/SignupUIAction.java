package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class SignupUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		// TODO Auto-generated method stub
		return "signup.jsp";
	}

}
