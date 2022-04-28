package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import ucamp.model.MemberVisitDAO;

public class DeleteWriteAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String url = "controller?cmd=visitorwritelistUI";
		
		String writeNo = request.getParameter("wno");
		String pw = request.getParameter("pw");
		
		if (new MemberVisitDAO().deleteWrite(writeNo,pw)) {
			url = "controller?cmd=visitorwritelistUI";
		}
		
		return url;
	}

}
