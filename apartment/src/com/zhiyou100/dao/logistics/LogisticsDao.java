package com.zhiyou100.dao.logistics;

import java.util.List;

import com.zhiyou100.model.Logistics;

public interface LogisticsDao {

	List<Logistics> findAllLogistics();

	void insertLogistics(Logistics log);

	void deleteLogistics(int lo_id);

	

	Logistics findLogisticsById(int lo_id);

	void updateLogistics(Logistics log);

	Logistics detailLogisticsById(int lo_id);

}
