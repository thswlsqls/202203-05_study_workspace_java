package ucamp.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import ucamp.model.MemberDAO;
import ucamp.model.MemberVO;

public class UserPageUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		String url = "index.html";
		HttpSession session = request.getSession();
		String id = session.getAttribute("id").toString();
		Collection<MemberVO> list = new MemberDAO().getUserInfo(id); 
		if (list.size() != 0) {
			url = "memberInfo.jsp";
			request.setAttribute("memberInfo",list);
		}
		
		return url;
	}

}
