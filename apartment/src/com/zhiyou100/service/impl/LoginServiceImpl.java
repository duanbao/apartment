package com.zhiyou100.service.impl;

import com.zhiyou100.dao.LoginDao;
import com.zhiyou100.dao.impl.LoginDaoImpl;
import com.zhiyou100.model.User;
import com.zhiyou100.service.LoginService;

public class LoginServiceImpl implements LoginService {
	LoginDao dao=new LoginDaoImpl();
	
	
	//判断用户是否存在
	public User findUserByUsername(String username) {
		User user=dao.findUserByUsername(username);
		return user;
	}

}
