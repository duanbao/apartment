package com.zhiyou100.servlet.logistics;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.Logistics;
import com.zhiyou100.service.logistics.LogisticsService;
import com.zhiyou100.service.logistics.impl.LogisticsServiceImpl;



@WebServlet("/logistics/list")
public class LogisticsListServlet extends HttpServlet{
	LogisticsService service = new LogisticsServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Logistics> log = service.findAllLogistics();
		req.setAttribute("log", log);
		req.getRequestDispatcher("/view/logistics/list.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
