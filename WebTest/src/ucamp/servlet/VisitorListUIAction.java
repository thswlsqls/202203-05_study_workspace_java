package ucamp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import ucamp.model.VisitorDAO;
import ucamp.model.VisitorVO;

public class VisitorListUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		
		VisitorDAO vDao = (VisitorDAO) request.getServletContext().getAttribute("vDao");
		
		Collection<VisitorVO> vList = vDao.getVisitorList();
		request.setAttribute("vList", vList);
		
		return "visitorList.jsp";
	}
}

