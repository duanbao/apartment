package com.zhiyou100.servlet.house;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.House;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;
@WebServlet("/house/detail")
public class HouseDetailServlet extends HttpServlet{
	HouseService service=new HouseServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//���ղ�	��
		String strh_id = req.getParameter("h_id");
		int h_id = Integer.parseInt(strh_id);
		//����ҵ���
		House house=service.detailHouseById(h_id);
		//��תҳ��
		req.setAttribute("House",house);
		req.getRequestDispatcher("/view/flats/detail.jsp").forward(req, resp);
	}
	
}
