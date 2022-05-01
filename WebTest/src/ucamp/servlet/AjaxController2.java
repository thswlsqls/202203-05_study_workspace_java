package ucamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import ucamp.model.MemberDAO;
import ucamp.model.VisitorDAO;
import ucamp.model.VisitorVO;

/**ajax 통신과 GSON 활용법 테스트용임. 사용하지 않음. */
@WebServlet("/ajaxController2NotUse")
public class AjaxController2 extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		ServletContext application = getServletContext();
		if(application.getAttribute("mDao") == null) {
			application.setAttribute("mDao", new MemberDAO());
		}
		if(application.getAttribute("vDao") == null) {
			application.setAttribute("vDao", new VisitorDAO());
		}
	}
	
	protected void service(HttpServletRequest request
			, HttpServletResponse response) 
			throws ServletException, IOException {	
		response.setContentType("text/json");
		
		String inputId = request.getParameter("inputId");
		
		VisitorDAO vDao = (VisitorDAO) request.getServletContext().getAttribute("vDao");
		Collection<VisitorVO> vList = vDao.getVisitorListById(inputId);

		Gson gson = new Gson();
		String json = gson.toJson(vList);
		
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print(json);
	}
}
