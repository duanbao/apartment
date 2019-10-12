package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.model.House;

public interface HouseDao {

	List<House> findAllHouse();

	void insertHouse(House house);

	void deleteHouse(int h_id);

	
	
	void updateHouse(House house);
	
	

	

	House findHouseById(int h_id);

	House detailHouseById(int h_id);

	

	





	
	
}
