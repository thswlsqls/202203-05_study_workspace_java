package com.ucamp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.ucamp.model.UserDAO;
import com.ucamp.model.UserVO;

public class LoginAction implements Action {

	@Override
	public String action(HttpServletRequest request) 
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		UserDAO uDAO = null;
		UserVO v = null;
		
		String url="login.jsp";
		
		try {
			uDAO = new UserDAO();
			if(uDAO.login(id, pw).length()!=0) {
				v = uDAO.getUser(id, pw);
				url="userInfo.jsp";
				
				request.setAttribute("id", v.getId());
				request.setAttribute("pw", v.getPassword());
				request.setAttribute("name", v.getName());
				request.setAttribute("email", v.getEmail());
				request.setAttribute("studentNumber", v.getStudentId());
				request.setAttribute("phone", v.getPhoneNumber());
				request.setAttribute("gender", v.getGender());
				
				String[] hobbyList = v.getHobby().split(" ");
				
				request.setAttribute("hobbyList", hobbyList);
				request.setAttribute("birthday", v.getBirthday());
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return url;
	}

}
