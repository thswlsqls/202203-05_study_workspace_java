package com.project.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.project.model.BoardVO;
import com.project.model.WriterDAO;

public class RankingUIAction implements Action {

	@Override
	public String action(HttpServletRequest request) throws ServletException, IOException {
		
		
	      Collection<BoardVO> list = new ArrayList();
	      
	      JsonObject j=new JsonObject();
	      Gson gson = new Gson();
		
		try {
			request.setAttribute("rankList", new WriterDAO().getNowRecommendedBoardList());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ranking.jsp";
	}

}
