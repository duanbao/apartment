package com.zhiyou100.servlet.house;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;

@WebServlet("/house/del")
public class HouseDelServlet extends HttpServlet{

	HouseService service=new HouseServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收参数
		String strh_id = req.getParameter("h_id");
		System.out.println("-->页面接收到的id:"+strh_id);
		int h_id = Integer.parseInt(strh_id);
		//调用业务层
		service.deleteHouseById(h_id);
		//跳转selvet,查询全部
		req.getRequestDispatcher("/house/list").forward(req, resp);
	}
}
