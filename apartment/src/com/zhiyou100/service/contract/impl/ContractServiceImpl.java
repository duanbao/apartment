package com.zhiyou100.service.contract.impl;

import java.util.List;


import com.zhiyou100.dao.contract.ContractDao;
import com.zhiyou100.dao.contract.impl.ContractDaoImpl;
import com.zhiyou100.model.Contract;
import com.zhiyou100.model.House;
import com.zhiyou100.service.contract.ContractService;


public class ContractServiceImpl implements ContractService {
	ContractDao dao=new ContractDaoImpl();
	@Override
	public List<Contract> findAllContract() {
		List<Contract> contract=dao.findAllHouse();
		return contract;
	}
	@Override
	public void insertContract(Contract con) {
		dao.insertContract(con);
		
	}
	@Override
	public void deleteContractById(int c_id) {
		dao.deleteContract(c_id);
		
	}
	
	
	@Override
	public void updateContract(Contract con) {
		dao.updateContract(con);
		
	}
	
	@Override
	public Contract detailContractById(int c_id) {
		Contract contract=dao.detailContractById(c_id);
		return contract;
	}
	@Override
	public Contract findContractById(int c_id) {
		Contract contract=dao.findContractById(c_id);
		return contract ;
	}
	

}
