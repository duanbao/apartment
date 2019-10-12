package com.zhiyou100.servlet.contract;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.Contract;
import com.zhiyou100.service.contract.ContractService;
import com.zhiyou100.service.contract.impl.ContractServiceImpl;




@WebServlet("/contract/list")
public class ContractListServlet extends HttpServlet{
	ContractService service=new ContractServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//查询全部合同信息
		List<Contract> c1=service.findAllContract();
		req.setAttribute("c1", c1);
		req.getRequestDispatcher("/view/contract/list.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
