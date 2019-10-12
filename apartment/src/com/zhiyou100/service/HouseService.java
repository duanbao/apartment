package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.House;

public interface HouseService {

	List<House> findAllHouse();
	//插入用户
	void insertHouse(House house);
	//删除用户
	void deleteHouseById(int h_id);
	//更新用户
	void updateHouse(House house);
	
	
	House detailHouseById(int h_id);
	House findHouseById(int h_id);
	
	
	

	
	
	

	


}
