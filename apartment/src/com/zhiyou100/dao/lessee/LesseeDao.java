package com.zhiyou100.dao.lessee;

import java.util.List;

import com.zhiyou100.model.Lessee;

public interface LesseeDao {

	void insertLessee(Lessee lessee);

	List<Lessee> findAllLessee();

	void deleteLessee(int l_id);

	Lessee findLesseeById(int l_id);

	void updateLessee(Lessee lessee);

	Lessee detailLesseeById(int l_id);

}
