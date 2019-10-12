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
	
	ContractService service = new ContractServiceImpl();//��̬
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//���ղ���
		String cid=req.getParameter("c_id");//req.getParameterΪ�ַ������͵�
		System.out.println("--->ҳ����ܵ���id:"+cid);
		//��String���͵�cidת��Ϊint���͵�
		int c_id=Integer.parseInt(cid);
		//����ҵ���
		service.deleteContractById(c_id);
		//��ת��listҳ��,��ѯȫ����Ϣ
		req.getRequestDispatcher("/contract/list").forward(req, resp);
	}
	
}
