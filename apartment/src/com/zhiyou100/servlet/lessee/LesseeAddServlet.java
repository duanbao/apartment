package com.zhiyou100.servlet.lessee;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.Lessee;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;
import com.zhiyou100.service.lessee.LesseeService;
import com.zhiyou100.service.lessee.impl.LesseeServiceImpl;


@WebServlet("/lessee/add")
public class LesseeAddServlet extends HttpServlet{
	
	LesseeService service = new LesseeServiceImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/view/lessee/add.jsp").forward(req, resp);
		System.out.println("-----");	
		}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String lid = req.getParameter("l_id");
		int l_id=0;
		if(lid!=null&&!lid.equals("")) {
			l_id=Integer.parseInt(lid);
		}
		String l_name = req.getParameter("l_name");
		String l_tel = req.getParameter("l_tel");
		String l_sex = req.getParameter("l_sex");
		String l_nativeplace = req.getParameter("l_nativeplace");
		String l_idcard = req.getParameter("l_idcard");
		String l_addtime = req.getParameter("l_addtime");
		
		
		//封装
		Lessee lessee =new Lessee();
		lessee.setL_id(l_id);
		lessee.setL_name(l_name);
		lessee.setL_tel(l_tel);
		lessee.setL_sex(l_sex);
		lessee.setL_nativeplace(l_nativeplace);
		lessee.setL_idcard(l_idcard);
		
		Date addtime;
		try {
			addtime =  new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(l_addtime);
			lessee.setL_addtime((addtime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("输出接收到的页面参数:"+lessee);
		//调用
		service.insertLessee(lessee);
		//控制跳转
		req.getRequestDispatcher("/lessee/list").forward(req, resp);
	}
}
