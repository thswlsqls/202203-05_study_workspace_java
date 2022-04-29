package ucamp.servlet;

import java.io.IOException;
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

import com.google.gson.JsonObject;

import ucamp.model.MemberDAO;
import ucamp.model.VisitorDAO;
import ucamp.model.VisitorVO;

@WebServlet("/ajaxController2")
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
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/json");
		
		String inputId = request.getParameter("inputId");
		
		VisitorDAO vDao = (VisitorDAO) request.getServletContext().getAttribute("vDao");
		Collection<VisitorVO> vList = vDao.getVisitorListById(inputId);

		JsonObject data = new JsonObject();
		
		data.addProperty("vList", vList.toString());
		
		request.setAttribute("vList", vList);
		
		response.getWriter().print(data);
		
	}

}
