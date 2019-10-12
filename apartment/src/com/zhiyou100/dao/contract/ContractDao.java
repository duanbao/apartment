package com.zhiyou100.dao.contract;

import java.util.List;

import com.zhiyou100.model.Contract;

public interface ContractDao {

	List<Contract> findAllHouse();

	void insertContract(Contract con);

	void deleteContract(int c_id);

	 void updateContract(Contract con);

	Contract findContractById(int c_id);

	Contract detailContractById(int c_id);

}
