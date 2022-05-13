package com.project.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.google.gson.JsonObject;
import com.project.model.InteractionDAO;

public class FriendFollowAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		
		String url = "addFllowResult.jsp";
		String followeeId = request.getParameter("followeeId");
		String followerId = request.getParameter("followerId");
		
		InteractionDAO iDao = (InteractionDAO) request.getServletContext().getAttribute("iDao");
		
		JsonObject j=new JsonObject();
		
		try {
			if(iDao.addFollow(followeeId, followerId)) {
				url = "addFllowResult.jsp";
				j.addProperty("isFollowSuccess", "true");
				request.setAttribute("result", j); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return url;
	}

}
