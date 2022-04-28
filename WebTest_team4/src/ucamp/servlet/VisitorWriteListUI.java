package ucamp.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import ucamp.model.MemberVisitDAO;
import ucamp.model.MemberVisitVO;

public class VisitorWriteListUI implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		Collection<MemberVisitVO> list = new MemberVisitDAO().getWrite(); 
		request.setAttribute("list", list);
		return "visitorwritelist.jsp";
	}

}
