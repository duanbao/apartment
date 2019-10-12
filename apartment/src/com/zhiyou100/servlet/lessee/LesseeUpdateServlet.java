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
import com.zhiyou100.service.lessee.LesseeService;
import com.zhiyou100.service.lessee.impl.LesseeServiceImpl;

	
@WebServlet("/lessee/update")
public class LesseeUpdateServlet extends HttpServlet{
	
	LesseeService service= new LesseeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收参数
		String strl_id=req.getParameter("l_id");
		System.out.println("-->页面接受到的参数l_id:"+strl_id);
		int l_id=Integer.parseInt(strl_id);
		//调用业务层
		Lessee lessee1=service.findLesseeById(l_id);
		//跳转service,查询全部
		req.setAttribute("lessee1", lessee1);
		System.out.println("准备跳转到更新页面");
		req.getRequestDispatcher("/view/lessee/update.jsp").forward(req, resp);
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接受所有的数据
		System.out.println("从页面接收参数");
		String lid=req.getParameter("l_id");
		int l_id=0;
		if(lid !=null && !lid.equals("")) {
			l_id=Integer.parseInt(lid);
		}
		
		String l_name = req.getParameter("l_name");
		String l_tel = req.getParameter("l_tel");
		String l_sex = req.getParameter("l_sex");
		String l_nativeplace = req.getParameter("l_nativeplace");
		String l_idcard = req.getParameter("l_idcard");
		String l_addtime = req.getParameter("l_addtime");
		/*封装到model中*/
		System.out.println("更新封装对象");
		Lessee lessee=new Lessee();
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
		
		//调用业务层,执行更新
		service.updateLessee(lessee);
		//跳转servlet,回到首页查询全部
		req.getRequestDispatcher("/lessee/list").forward(req, resp);
	}
	
}
