package com.zhiyou100.servlet.house;

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
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;
@WebServlet("/house/add")
public class HouseAddServlet extends HttpServlet{
	HouseService service = new HouseServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 先跳转至此  再跳转到add.jsp页面去添加数据    后add.jsp在转发至此到post方法
		req.getRequestDispatcher("/view/flats/add.jsp").forward(req, resp);
		System.out.println("-----");
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 接收参数  接收跳转add页面添加的数据
		String hid = req.getParameter("h_id");
		int h_id=0;
		if(hid!=null&&!hid.equals("")) {
			h_id=Integer.parseInt(hid);
		}
		
		String h_area = req.getParameter("h_area");

		String h_estate = req.getParameter("h_estate");
		String h_unitNumber = req.getParameter("h_unitNumber");
		
		String hfloor = req.getParameter("h_floor");
		int h_floor=0;
		if(hfloor !=null && !hfloor.equals("")) {
			h_floor=Integer.parseInt(hfloor);
		}
	
		String h_roomNo = req.getParameter("h_roomNo");
		String h_acreage = req.getParameter("h_acreage");
		String h_direction = req.getParameter("h_direction");
		String h_fitment = req.getParameter("h_fitment");


		//String hisDoubleAir  = req.getParameter("h_isDoubleAir");
		//int h_isDoubleAir =0;
		//if(hisDoubleAir !=null && !hid.equals("")) {
		//	h_isDoubleAir =Integer.parseInt(hisDoubleAir);
		//}
		//
		String hlimit  = req.getParameter("h_limit");
		int h_limit =0;
		if(hlimit !=null && !hid.equals("")) {
			h_limit =Integer.parseInt(hlimit);
		}
		
		String h_facility = req.getParameter("h_facility");
		
		String hprice  = req.getParameter("h_price");
		double h_price =0.0;
		if(hprice !=null&&!hid.equals("")) {
			h_price =Double.parseDouble(hprice);
		}
		//double h_price = Double.parseDouble(req.getParameter("h_price"));
		

		String hstatus  = req.getParameter("h_status");
		int h_status =0;
		if(hstatus !=null&&!hid.equals("")) {
			h_status =Integer.parseInt(hstatus);
		}
		String h_img = req.getParameter("h_img");
		String h_address = req.getParameter("h_address");
		String h_addtime = req.getParameter("h_addtime");
		String h_updateTime = req.getParameter("h_updateTime");
		
		
		
		
		
		// 将数据封装到model 对象house中传递出去
		House house = new House();
		house.setH_id(h_id);
		house.setH_area(h_area);
		house.setH_estate(h_estate);
		house.setH_unitNumber(h_unitNumber);
		house.setH_floor(h_floor);
		house.setH_roomNo(h_roomNo);
		house.setH_acreage(h_acreage);
		house.setH_direction(h_direction);
		house.setH_fitment(h_fitment);
		//house.setH_isDoubleAir(h_isDoubleAir);
		house.setH_limit(h_limit);
		house.setH_facility(h_facility);
		house.setH_price(h_price);
		house.setH_status(h_status);
		house.setH_img(h_img);
		house.setH_address(h_address);
	
		Date addtime;
		try {
			addtime =  new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(h_addtime);
			house.setH_addtime((addtime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date updateTime;
		try {
			updateTime =  new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(h_updateTime);
			house.setH_updateTime((updateTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("输出接收到的页面参数:"+house);
		// 调用业务层 service
		service.insertHouse(house);
		// 控制跳转到list页面不是list.jsp中
		req.getRequestDispatcher("/house/list").forward(req, resp);
	
}
}
