package com.ucamp.servlet;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.JsonObject;
import com.ucamp.model.UserDAO;

public class CheckIdAction implements Action {

	@Override
	public String action(HttpServletRequest request) {
		
		String userId = request.getParameter("id");
		
		UserDAO dao = new UserDAO();
		
		JsonObject j=new JsonObject();
		if(dao.checkId(userId) == 0) {
//			request.setAttribute("result", "true"); 
			
			j.addProperty("idCheck", "true");
			request.setAttribute("result", j); 
		}
		else {
			j.addProperty("idCheck", "false");
		    request.setAttribute("result", j);			
//		    request.setAttribute("result", "false");			
		}

		/*
		 * System.out.println(userId); dao.checkId(userId);
		 */
		
//		return "result.jsp";
		return "GsonText.jsp";
	}

}
