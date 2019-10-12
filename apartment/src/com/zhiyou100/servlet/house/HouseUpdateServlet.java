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

@WebServlet("/house/update")
public class HouseUpdateServlet extends HttpServlet {
	// ����ҵ������
		HouseService service = new HouseServiceImpl();
		
		@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//���ղ���
			String strh_id = req.getParameter("h_id");
			System.out.println("-->ҳ����յ���id:"+strh_id);
			int h_id = Integer.parseInt(strh_id);
			//����ҵ���
			House house=service.findHouseById(h_id);
			//��תservice,��ѯȫ��
			req.setAttribute("house", house);
			System.out.println("��ת������ҳ��");
			
			req.getRequestDispatcher("/view/flats/update.jsp").forward(req, resp);
		}

	
		
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			/*
			 * ��Ϊ��֪��������һ������,���оͽ���ȫ����Ϣ.
			 */
			System.out.println("�Ӹ���ҳ����ܲ���");
			String hid = req.getParameter("h_id");
			int h_id=0;
			if(hid!=null&&!hid.equals("")) {
				h_id=Integer.parseInt(hid);
			}
			
			//int h_id = Integer.parseInt(req.getParameter("h_id"));
			String h_area = req.getParameter("h_area");

			String h_estate = req.getParameter("h_estate");
			String h_unitNumber = req.getParameter("h_unitNumber");
			
			String hfloor  = req.getParameter("h_floor");
			int h_floor =0;
			if(hfloor !=null&&!hid.equals("")) {
				h_floor =Integer.parseInt(hfloor);
			}
			
			//int h_floor = Integer.parseInt(req.getParameter("h_floor"));
			String h_roomNo = req.getParameter("h_roomNo");
			String h_acreage = req.getParameter("h_acreage");
			String h_direction = req.getParameter("h_direction");
			String h_fitment = req.getParameter("h_fitment");
			System.out.println("����ȷ");
			
			String hisDoubleAir = req.getParameter("h_isDoubleAir");
			int h_isDoubleAir =0;
			if(hisDoubleAir !=null&&!hid.equals("")) {
				h_isDoubleAir =Integer.parseInt(hisDoubleAir);
			}
		
			String hlimit  = req.getParameter("h_limit");
			int h_limit =0;
			if(hlimit !=null&&!hid.equals("")) {
				h_limit =Integer.parseInt(hlimit);
			}
			//int h_limit = Integer.parseInt(req.getParameter("h_limit"));
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
			
			
			
			
			
			
			
			
			
			/*
			 * ���Խ��������ݷ�װ��model������
			 */
			System.out.println("���·�װ����");
			House house= new House();
			house.setH_id(h_id);
			house.setH_area(h_area);
			house.setH_estate(h_estate);
			house.setH_unitNumber(h_unitNumber);
			house.setH_floor(h_floor);
			house.setH_roomNo(h_roomNo);
			house.setH_acreage(h_acreage);
			house.setH_direction(h_direction);
			house.setH_fitment(h_fitment);
			house.setH_isDoubleAir(h_isDoubleAir);
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
			Date updatetime;
			try {
				updatetime =  new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(h_updateTime);
				house.setH_updateTime((updatetime));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("�Ӹ���ҳ����յ���ҳ�����:"+house);
			
			// ����ҵ���,ִ�и���
			service.updateHouse(house);
			// ��תServlet,�ص���ҳ��ѯȫ��
			req.getRequestDispatcher("/house/list").forward(req, resp);
			
		}

	
		
		
		
		
		
		
}
