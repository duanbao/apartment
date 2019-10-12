package com.zhiyou100.servlet.contract;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.model.Contract;
import com.zhiyou100.model.House;
import com.zhiyou100.service.contract.ContractService;
import com.zhiyou100.service.contract.impl.ContractServiceImpl;

@WebServlet("/contract/detail")
public class ContractDetailServlet extends HttpServlet{
	ContractService service = new ContractServiceImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//���ղ�	��
				String strc_id = req.getParameter("c_id");
				int c_id = Integer.parseInt(strc_id);
				//����ҵ���
				Contract contract=service.detailContractById(c_id);
				//��תҳ��
				req.setAttribute("Contract",contract);
				req.getRequestDispatcher("/view/contract/detail.jsp").forward(req, resp);
	}
}
