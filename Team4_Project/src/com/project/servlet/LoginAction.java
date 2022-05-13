package com.project.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.project.model.EmotionDAO;
import com.project.model.UserDAO;

public class LoginAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		//성공checkEmotion.jsp
		//실패login.jsp
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		String url="login.jsp";

		try {
			UserDAO uDao = (UserDAO)(request.getServletContext().getAttribute("uDao"));
			String penName;
			penName = uDao.login(id,pw);

			if(penName != null) {
				HttpSession session = request.getSession(true);
				session.setAttribute("userId", id);
				session.setAttribute("penName", penName);

				EmotionDAO eDao = new EmotionDAO();
								
				try {
				Collection<String> emotions = eDao.getEmotionName();
					request.setAttribute("emotions", emotions);
					url="checkEmotion.jsp";
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			//감정선택 했는지 안했는지 여부
            if (new EmotionDAO().getMyEmotionName(id) == false) {
               url = "controller?cmd=homeUI";
            }

		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return url;
	}
}
