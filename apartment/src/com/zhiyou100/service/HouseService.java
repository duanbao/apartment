package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.House;

public interface HouseService {

	List<House> findAllHouse();
	//�����û�
	void insertHouse(House house);
	//ɾ���û�
	void deleteHouseById(int h_id);
	//�����û�
	void updateHouse(House house);
	
	
	House detailHouseById(int h_id);
	House findHouseById(int h_id);
	
	
	

	
	
	

	


}
