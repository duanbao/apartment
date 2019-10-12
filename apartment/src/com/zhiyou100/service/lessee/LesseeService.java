package com.zhiyou100.service.lessee;

import java.util.List;

import com.zhiyou100.model.Lessee;

public interface LesseeService {

	void insertLessee(Lessee lessee);

	List<Lessee> findAllLessee();

	void deleteLesseeById(int l_id);

	Lessee findLesseeById(int l_id);

	void updateLessee(Lessee lessee);

	Lessee detailLesseeById(int l_id);



	

}
