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
		//���ղ���
		String strh_id = req.getParameter("h_id");
		System.out.println("-->ҳ����յ���id:"+strh_id);
		int h_id = Integer.parseInt(strh_id);
		//����ҵ���
		service.deleteHouseById(h_id);
		//��תselvet,��ѯȫ��
		req.getRequestDispatcher("/house/list").forward(req, resp);
	}
}
