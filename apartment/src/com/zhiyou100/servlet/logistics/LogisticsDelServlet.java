package com.zhiyou100.servlet.logistics;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;
import com.zhiyou100.service.logistics.LogisticsService;
import com.zhiyou100.service.logistics.impl.LogisticsServiceImpl;

@WebServlet("/logistics/del")
public class LogisticsDelServlet extends HttpServlet{
	LogisticsService service=new LogisticsServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//���ղ���
				String loid = req.getParameter("lo_id");
				System.out.println("-->ҳ����յ���id:"+loid);
				int lo_id = Integer.parseInt(loid);
				//����ҵ���
				service.deleteLogisticsById(lo_id);
				//��תselvet,��ѯȫ��
				req.getRequestDispatcher("/logistics/list").forward(req, resp);
	}
}
