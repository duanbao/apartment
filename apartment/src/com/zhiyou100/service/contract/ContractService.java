package com.zhiyou100.service.contract;

import java.util.List;

import com.zhiyou100.model.Contract;

public interface ContractService {

	//展示全部合同
	List<Contract> findAllContract();

	
	//添加合同
	void insertContract(Contract con);


	void deleteContractById(int c_id);


	


	void updateContract(Contract con);


	Contract detailContractById(int c_id);


	Contract findContractById(int c_id);



	

}
