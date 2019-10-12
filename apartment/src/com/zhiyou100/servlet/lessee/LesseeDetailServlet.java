package com.zhiyou100.servlet.lessee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.Lessee;
import com.zhiyou100.service.lessee.LesseeService;
import com.zhiyou100.service.lessee.impl.LesseeServiceImpl;

@WebServlet("/lessee/detail")
public class LesseeDetailServlet extends HttpServlet {
	LesseeService  service= new LesseeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收参数
		String strl_id=req.getParameter("l_id");
		int l_id = Integer.parseInt(strl_id);
		//调用业务层
		Lessee lessee1 =service.detailLesseeById(l_id);
		//跳转页面
		req.setAttribute("lessee1", lessee1);
		req.getRequestDispatcher("/view/lessee/detail.jsp").forward(req, resp);
	}
	
	
	
}
