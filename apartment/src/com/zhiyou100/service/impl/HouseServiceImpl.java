package com.zhiyou100.service.impl;

import java.util.List;

import com.zhiyou100.dao.HouseDao;

import com.zhiyou100.dao.impl.HouseDaoImpl;

import com.zhiyou100.model.House;

import com.zhiyou100.service.HouseService;

public class HouseServiceImpl implements HouseService {
	HouseDao dao=new HouseDaoImpl();
	@Override
	public List<House> findAllHouse() {
		List<House> house1=dao.findAllHouse();
		return house1;
	}
	@Override
	public void insertHouse(House house) {
		dao.insertHouse(house);
		
	}
	@Override
	public void deleteHouseById(int h_id) {
		dao.deleteHouse(h_id);
		
	}
	
	
		
	
	@Override
	public void updateHouse(House house) {
		dao.updateHouse(house);
		
	}
	@Override
	public House detailHouseById(int h_id) {
		House house=dao.detailHouseById(h_id);
		return house ;
		
	}
	@Override
	public House findHouseById(int h_id) {
		House house=dao.findHouseById(h_id);
		return house ;
	}

	
	
	
	
	
	
	
		
	
	


}
