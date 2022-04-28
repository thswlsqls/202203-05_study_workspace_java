package ucamp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import ucamp.model.MemberDAO;
import ucamp.model.MemberVO;

public class LoginAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		
		String url = "login.jsp";
		HttpSession session = request.getSession();
		MemberVO v = null;
		
		String memberId = request.getParameter("memberId");
		String pw = request.getParameter("pw");
		
		MemberDAO mDao = (MemberDAO) request.getServletContext().getAttribute("mDao");
		String name = mDao.login(memberId, pw);
		if(name != null) {
			v = mDao.getMember(memberId);
			session.setAttribute("loginMember", v);
			session.setAttribute("memberId", memberId);
			url = "memberMain.jsp";
		}
		
		return url;
	}

}
