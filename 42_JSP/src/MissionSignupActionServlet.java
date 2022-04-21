

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.glass.ui.Application;

@WebServlet("/missionSignupAction")
public class MissionSignupActionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String emailDomain=request.getParameter("emailDomain");
		String studentNumber=request.getParameter("studentNumber");
		String phone=request.getParameter("phone");
		String gender=request.getParameter("gender");
		String hobbyList[]=request.getParameterValues("hobby");
		String year=request.getParameter("year");
		String month=request.getParameter("month");
		String day=request.getParameter("day");
		
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("emailDomain", emailDomain);
		request.setAttribute("studentNumber", studentNumber);
		request.setAttribute("phone", phone);
		request.setAttribute("gender", gender);
		request.setAttribute("hobbyList", hobbyList);
		request.setAttribute("birthday", year+"/"+month+"/"+day);
			
		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/mission_login.jsp");
		dispatcher.forward(request, response);	
	}
}
