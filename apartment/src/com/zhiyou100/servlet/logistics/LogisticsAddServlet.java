package com.zhiyou100.servlet.logistics;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.Logistics;
import com.zhiyou100.service.logistics.LogisticsService;
import com.zhiyou100.service.logistics.impl.LogisticsServiceImpl;

@WebServlet("/logistics/add")
public class LogisticsAddServlet extends HttpServlet{
	LogisticsService service = new LogisticsServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/view/logistics/add.jsp").forward(req, resp);
		
		System.out.println("跳转到add");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收参数
		String loid=req.getParameter("lo_id");
		int lo_id=0;
		if(loid!=null && !equals("")) {
			lo_id=Integer.parseInt(loid);
		}
		
		String lo_name = req.getParameter("lo_name");
		String lo_idcard = req.getParameter("lo_idcard");
		String lo_tel = req.getParameter("lo_tel");
		String lo_time = req.getParameter("lo_time");
	
	//封装到model对象中
	Logistics log=new Logistics();
	log.setLo_id(lo_id);
	log.setLo_name(lo_name);
	log.setLo_idcard(lo_idcard);
	log.setLo_tel(lo_tel);
	
	Date time;
	try {
		time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(lo_time);
		log.setLo_time(time);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("输出接收到的页面参数"+log);
	//调用业务层
	service.insertLogistics(log);
	//控制跳转
	req.getRequestDispatcher("/logistics/list").forward(req, resp);
	
	}
}
