package com.zhiyou100.servlet.contract;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.service.contract.ContractService;
import com.zhiyou100.service.contract.impl.ContractServiceImpl;

@WebServlet("/contract/del")
public class ContractDelServlet extends HttpServlet {
	
	ContractService service = new ContractServiceImpl();//多态
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收参数
		String cid=req.getParameter("c_id");//req.getParameter为字符串类型的
		System.out.println("--->页面接受到的id:"+cid);
		//将String类型的cid转换为int类型的
		int c_id=Integer.parseInt(cid);
		//调用业务层
		service.deleteContractById(c_id);
		//跳转到list页面,查询全部信息
		req.getRequestDispatcher("/contract/list").forward(req, resp);
	}
	
}
