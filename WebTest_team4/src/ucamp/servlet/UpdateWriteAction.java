package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import ucamp.model.MemberVisitDAO;

public class UpdateWriteAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String url = "controller?cmd=visitorwritelistUI";
		
		String contents = request.getParameter("contents");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String writeNo = request.getParameter("wno");
		
		if (new MemberVisitDAO().updateWrite(contents,id,pw,writeNo)) {
			url = "controller?cmd=visitorwritelistUI";
		}
		
		return url;
	}

}

