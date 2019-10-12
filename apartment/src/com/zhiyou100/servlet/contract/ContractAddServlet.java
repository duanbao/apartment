package com.zhiyou100.servlet.contract;

import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.Contract;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.contract.ContractService;

import com.zhiyou100.service.contract.impl.ContractServiceImpl;
import com.zhiyou100.service.impl.HouseServiceImpl;

@WebServlet("/contract/add")
public class ContractAddServlet extends HttpServlet{
	ContractService service = new ContractServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 先跳转至此  再跳转到add.jsp页面去添加数据    后add.jsp在转发至此到post方法
				req.getRequestDispatcher("/view/contract/add.jsp").forward(req, resp);
				System.out.println("-----");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 接收参数  接收跳转add页面添加的数据
				String cid = req.getParameter("c_id");
				int c_id=0;
				if(cid!=null&&!cid.equals("")) {
					c_id=Integer.parseInt(cid);
				}
				String hid=req.getParameter("h_id");
				int h_id=0;
				if(hid!=null && !hid.equals("")) {
					h_id=Integer.parseInt(hid);
				}
				String lid=req.getParameter("l_id");
				int l_id=0;
				if(lid!=null && !lid.equals("")) {
					l_id=Integer.parseInt(lid);
				}
				String c_time=req.getParameter("c_time");
				String c_starttime=req.getParameter("c_starttime");
				String c_endtime=req.getParameter("c_endtime");
				String crental=req.getParameter("c_rental");
				double c_rental=0.0;
				if(crental !=null && !crental.equals("")) {
					c_rental=Double.parseDouble(crental);
				}
				String ccash=req.getParameter("c_cash");
				double c_cash=0.0;
				if(ccash != null && !ccash.equals("")) {
					c_cash=Double.parseDouble(ccash);
				}
				String c_name=req.getParameter("c_name");
				String cstatus=req.getParameter("c_status");
				int c_status=0;
				if(cstatus != null && !cstatus.equals("")) {
					c_status=Integer.parseInt(cstatus);
				}
				//将数据封装到model对象中contract中传递出去
				Contract con=new Contract();
				con.setC_id(c_id);
				con.setH_id(h_id);
				con.setL_id(l_id);
				//con.setC_time(c_time);
				Date time;
				try {
					time =  new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(c_time);
					con.setC_time((time));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Date starttime;
				 try {
					starttime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(c_starttime);
					con.setC_starttime((starttime));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Date endtime;
				try {
					endtime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(c_endtime);
					con.setC_endtime((endtime));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				con.setC_rental(c_rental);
				con.setC_cash(c_cash);
				con.setC_name(c_name);
				con.setC_status(c_status);
		System.out.println("输出并接收到的页面参数:"+con);
		//调用业务层service
		service.insertContract(con);
	//控制跳转
	req.getRequestDispatcher("/contract/list").forward(req, resp);
	}
}
