package com.zhiyou100.service.lessee.impl;

import java.util.List;

import com.zhiyou100.dao.HouseDao;
import com.zhiyou100.dao.impl.HouseDaoImpl;
import com.zhiyou100.dao.lessee.LesseeDao;
import com.zhiyou100.dao.lessee.impl.LesseeDaoImpl;
import com.zhiyou100.model.Lessee;
import com.zhiyou100.service.lessee.LesseeService;

public class LesseeServiceImpl implements LesseeService {
	LesseeDao dao=new LesseeDaoImpl();
	@Override
	public void insertLessee(Lessee lessee) {
		dao.insertLessee(lessee);
	}
	@Override
	public List<Lessee> findAllLessee() {
		List<Lessee> lessee1=dao.findAllLessee();
		return lessee1;
	}
	@Override
	public void deleteLesseeById(int l_id) {
		dao.deleteLessee(l_id);
		
	}
	@Override
	public Lessee findLesseeById(int l_id) {
		Lessee lessee = dao.findLesseeById(l_id);
		return lessee;
	}
	@Override
	public void updateLessee(Lessee lessee) {
		dao.updateLessee(lessee);
		
	}
	@Override
	public Lessee detailLesseeById(int l_id) {
		Lessee lessee = dao.detailLesseeById(l_id);
		return lessee;
	}
	
	

}
