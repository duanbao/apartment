package com.zhiyou100.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zhiyou100.dao.LoginDao;
import com.zhiyou100.model.User;
import com.zhiyou100.util.DBUtil;

public class LoginDaoImpl implements LoginDao {
     //登录数据的查询
	@Override
	public User findUserByUsername(String username) {
		Connection conn=DBUtil.getConnection();
		String sql="select * from user where u_username=? ";
		User user = null;
		try {
			PreparedStatement ps =conn.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				user=new User();
				user.setU_id(rs.getInt("u_id"));
				user.setU_username(rs.getString("u_username"));
				user.setU_password(rs.getString("u_password"));
				user.setU_name(rs.getString("u_name"));
				user.setU_age(rs.getInt("u_age"));
				user.setU_tel(rs.getString("u_tel"));
				user.setU_status(rs.getInt("u_status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return user;
	}

}
