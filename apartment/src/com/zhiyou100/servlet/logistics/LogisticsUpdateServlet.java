package com.zhiyou100.servlet.logistics;

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
import com.zhiyou100.model.Logistics;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;
import com.zhiyou100.service.logistics.LogisticsService;
import com.zhiyou100.service.logistics.impl.LogisticsServiceImpl;

@WebServlet("/logistics/update")
public class LogisticsUpdateServlet extends HttpServlet{
	
	// ����ҵ������
			LogisticsService service = new LogisticsServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loid = req.getParameter("lo_id");
		System.out.println("-->ҳ����յ���id:"+loid);
		int lo_id = Integer.parseInt(loid);
		//����ҵ���
		Logistics log=service.findLogisticsById(lo_id);
		//��תservice,��ѯȫ��
		req.setAttribute("log", log);
		System.out.println("��ת������ҳ��");
		
		req.getRequestDispatcher("/view/logistics/update.jsp").forward(req, resp);
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("�Ӹ���ҳ����ܲ���");
		String loid = req.getParameter("lo_id");
		int lo_id=0;
		if(loid!=null&&!loid.equals("")) {
			lo_id=Integer.parseInt(loid);
		}
		
		String lo_name = req.getParameter("lo_name");
		String lo_idcard = req.getParameter("lo_idcard");
		String lo_tel = req.getParameter("lo_tel");
		String lo_time = req.getParameter("lo_time");
		//��װ
		Logistics log = new Logistics();
		log.setLo_id(lo_id);
		log.setLo_name(lo_name);
		log.setLo_idcard(lo_idcard);
		log.setLo_tel(lo_tel);
		
		Date time;
		try {
			time =  new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(lo_time);
			log.setLo_time((time));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�Ӹ���ҳ����յ���ҳ�����:"+log);
		//����ҵ���,ִ�и���
		service.updateLogistics(log);
		//��ת
		req.getRequestDispatcher("/logistics/list").forward(req, resp);
		
	}
}
