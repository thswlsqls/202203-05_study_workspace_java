package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import ucamp.model.VisitorDAO;
import ucamp.model.VisitorVO;

public class UpdateVisitorUI implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		
		VisitorDAO vDao = (VisitorDAO) request.getServletContext().getAttribute("vDao");
		String visitorSeq = request.getParameter("visitorSeq");
		VisitorVO v = vDao.getVisitor(visitorSeq);
		
		request.setAttribute("v", v);
		
		return "updateVisitor.jsp";
	}

}
