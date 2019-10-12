package com.zhiyou100.servlet.house;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.House;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;

@WebServlet("/house/list")
public class HouseListServlet extends HttpServlet{
	HouseService service=new HouseServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//查询全部房屋讯息
		List<House> house1=service.findAllHouse();
		req.setAttribute("house1",house1 );
		req.getRequestDispatcher("/view/flats/list.jsp").forward(req, resp);//展示全部信息
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
