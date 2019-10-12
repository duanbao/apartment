package com.zhiyou100.servlet.lessee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.service.lessee.LesseeService;
import com.zhiyou100.service.lessee.impl.LesseeServiceImpl;
@WebServlet("/lessee/del")
public class LesseeDelServlet  extends HttpServlet{
	LesseeService service = new LesseeServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String strl_id = req.getParameter("l_id");
		System.out.println("--->页面接受到的l_id:"+strl_id);
		int l_id = Integer.parseInt(strl_id);
		//调用业务层
		service.deleteLesseeById(l_id);
		//跳转servet,查询全部
		req.getRequestDispatcher("/lessee/list").forward(req, resp);
	}	
}
