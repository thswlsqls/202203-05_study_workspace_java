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
				url="userInfo.jsp";
				session.setAttribute("userId", v.getUserId());
				session.setAttribute("userPw", v.getPassword());
				request.setAttribute("id", v.getUserId());
				request.setAttribute("pw", v.getPassword());
				request.setAttribute("name", v.getName());
				request.setAttribute("email", v.getEmail());
				request.setAttribute("studentNumber", v.getStudentId());
				request.setAttribute("phone", v.getPhoneNumber());
				request.setAttribute("gender", v.getGender());
				String[] hobbyList = v.getHobby().split(" ");
				request.setAttribute("hobbyList", hobbyList);
				request.setAttribute("birthday", v.getBirthday());
				
				request.setAttribute("gbList", gbList);
				
				System.out.println(gbList);
			
			}else { request.setAttribute("isRequestSuccess", "false"); }
		}catch(SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return url;
	}
}
