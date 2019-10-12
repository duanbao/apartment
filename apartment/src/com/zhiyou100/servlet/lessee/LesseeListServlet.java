package com.zhiyou100.servlet.lessee;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.House;
import com.zhiyou100.model.Lessee;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;
import com.zhiyou100.service.lessee.LesseeService;
import com.zhiyou100.service.lessee.impl.LesseeServiceImpl;

@WebServlet("/lessee/list")
public class LesseeListServlet extends HttpServlet{
	LesseeService service=new LesseeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Lessee> lessee1=service.findAllLessee();
		req.setAttribute("lessee1",lessee1);
		req.getRequestDispatcher("/view/lessee/list.jsp").forward(req, resp);//展示全部信息
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
}
