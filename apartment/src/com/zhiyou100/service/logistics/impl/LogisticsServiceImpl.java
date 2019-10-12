package com.zhiyou100.service.logistics.impl;

import java.util.List;

import com.zhiyou100.dao.logistics.LogisticsDao;
import com.zhiyou100.dao.logistics.impl.LogisticsDaoImpl;
import com.zhiyou100.model.Logistics;
import com.zhiyou100.service.logistics.LogisticsService;

public class LogisticsServiceImpl implements LogisticsService {
	LogisticsDao dao = new LogisticsDaoImpl();
	@Override
	public List<Logistics> findAllLogistics() {
		List<Logistics> log = dao.findAllLogistics();
		return log;
	}
	@Override
	public void insertLogistics(Logistics log) {
		dao.insertLogistics(log);
		
	}
	@Override
	public void deleteLogisticsById(int lo_id) {
		dao.deleteLogistics(lo_id);
		
	}
	@Override
	public Logistics findLogisticsById(int lo_id) {
		Logistics log =dao.findLogisticsById(lo_id);
		return log;
	}
	@Override
	public void updateLogistics(Logistics log) {
		dao.updateLogistics(log);
		
	}
	@Override
	public Logistics detailLogisticsById(int lo_id) {
		Logistics log =dao.detailLogisticsById(lo_id);
		return log;
	}
	
	

	
}
