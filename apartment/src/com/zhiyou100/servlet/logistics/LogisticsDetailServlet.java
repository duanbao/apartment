package com.zhiyou100.servlet.logistics;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.Logistics;
import com.zhiyou100.service.logistics.LogisticsService;
import com.zhiyou100.service.logistics.impl.LogisticsServiceImpl;

@WebServlet("/logistics/detail")
public class LogisticsDetailServlet extends HttpServlet {
	
	LogisticsService service = new LogisticsServiceImpl(); 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收参数
		String loid=req.getParameter("lo_id");
		int lo_id = Integer.parseInt(loid);
		//调用业务层
		System.out.println("111");
		Logistics log = service.detailLogisticsById(lo_id);
		
		//跳转页面
		req.setAttribute("log", log);
		
		req.getRequestDispatcher("/view/logistics/detail.jsp").forward(req, resp);
		System.out.println("2222");
		
	}
}
