package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;

import ucamp.model.MemberDAO;

public class CheckDuplicateIdAction implements AjaxAction {

	@Override
	public Object action(HttpServletRequest request
			, HttpServletResponse response)
			throws ServletException, IOException {
		
		String inputId = request.getParameter("inputId");

		JsonObject data = new JsonObject();
		
		data.addProperty("inputId", inputId);
		
		MemberDAO mDao = (MemberDAO) request.getServletContext().getAttribute("mDao");
		if(mDao.isValidAddMemberId(inputId)) {
			data.addProperty("isValidId", "false");
		}else {
			data.addProperty("isValidId", "true");
		}
		
		return data;
	}

}
