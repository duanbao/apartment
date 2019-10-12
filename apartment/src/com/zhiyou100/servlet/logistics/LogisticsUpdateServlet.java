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

import com.zhiyou100.model.House;
import com.zhiyou100.model.Logistics;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;
import com.zhiyou100.service.logistics.LogisticsService;
import com.zhiyou100.service.logistics.impl.LogisticsServiceImpl;

@WebServlet("/logistics/update")
public class LogisticsUpdateServlet extends HttpServlet{
	
	// 创建业务层对象
			LogisticsService service = new LogisticsServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loid = req.getParameter("lo_id");
		System.out.println("-->页面接收到的id:"+loid);
		int lo_id = Integer.parseInt(loid);
		//调用业务层
		Logistics log=service.findLogisticsById(lo_id);
		//跳转service,查询全部
		req.setAttribute("log", log);
		System.out.println("跳转到更新页面");
		
		req.getRequestDispatcher("/view/logistics/update.jsp").forward(req, resp);
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("从更新页面接受参数");
		String loid = req.getParameter("lo_id");
		int lo_id=0;
		if(loid!=null&&!loid.equals("")) {
			lo_id=Integer.parseInt(loid);
		}
		
		String lo_name = req.getParameter("lo_name");
		String lo_idcard = req.getParameter("lo_idcard");
		String lo_tel = req.getParameter("lo_tel");
		String lo_time = req.getParameter("lo_time");
		//封装
		Logistics log = new Logistics();
		log.setLo_id(lo_id);
		log.setLo_name(lo_name);
		log.setLo_idcard(lo_idcard);
		log.setLo_tel(lo_tel);
		
		Date time;
		try {
			time =  new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(lo_time);
			log.setLo_time((time));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("从更新页面接收到的页面参数:"+log);
		//调用业务层,执行更新
		service.updateLogistics(log);
		//跳转
		req.getRequestDispatcher("/logistics/list").forward(req, resp);
		
	}
}
