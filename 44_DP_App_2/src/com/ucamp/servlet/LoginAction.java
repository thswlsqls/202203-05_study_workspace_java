package com.ucamp.servlet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ucamp.model.GuestBookVO;
import com.ucamp.model.UserDAO;
import com.ucamp.model.UserVO;

public class LoginAction implements Action {
	@Override
	public String action(HttpServletRequest request) 
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		UserVO v = null;
		Collection<GuestBookVO> gbList = new ArrayList<GuestBookVO>();
		HttpSession session = request.getSession();
		
		String url="login.jsp";
		try {
			if(((UserDAO)(request.getServletContext().getAttribute("dao"))).login(id, pw).length()!=0) { 
				v = ((UserDAO)(request.getServletContext().getAttribute("dao"))).getUser(id, pw);
				gbList = ((UserDAO)(request.getServletContext().getAttribute("dao"))).getGuestBooks();
				url="userMain.jsp";
				
				session.setAttribute("loginOK", id); 
				
				session.setAttribute("userId", v.getUserId());
				session.setAttribute("userPw", v.getPassword());
				
				session.setAttribute("id", v.getUserId());
				session.setAttribute("pw", v.getPassword());
				session.setAttribute("name", v.getName());
				session.setAttribute("email", v.getEmail());
				session.setAttribute("studentNumber", v.getStudentId());
				session.setAttribute("phone", v.getPhoneNumber());
				session.setAttribute("gender", v.getGender());
				String[] hobbyList = v.getHobby().split(" ");
				session.setAttribute("hobbyList", hobbyList);
				session.setAttribute("birthday", v.getBirthday());
				
				session.setAttribute("gbList", gbList);
			
			}else { request.setAttribute("isRequestSuccess", "false"); }
		}catch(SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return url;
	}
}
