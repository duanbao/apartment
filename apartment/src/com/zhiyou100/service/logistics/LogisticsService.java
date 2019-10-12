package com.zhiyou100.service.logistics;

import java.util.List;

import com.zhiyou100.model.Logistics;

public interface LogisticsService {

	

	List<Logistics> findAllLogistics();

	void insertLogistics(Logistics log);

	void deleteLogisticsById(int lo_id);

	Logistics findLogisticsById(int lo_id);

	void updateLogistics(Logistics log);

	Logistics detailLogisticsById(int lo_id);

	

	

}
