/*package com.zhiyou100.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtilDao {
	
	public static ResultSet select(String sql,Object[] obj) {
		//获得连接
		Connection conn=getConnection();
		ResultSet rs =null;
		//根据sql语句获得预处理对象
		try {
		PreparedStatement conn = conn.prepareStatement(sql);
		/*
		 * 向占位符处设置参数
		 * 1.占位符处的参数类型
		 * 2.几个占位符
		 *
		ps.setObject(1,obj[0]);
		ps.setObject(2,obj[1]);
		for(int i=0;i<obj.length;i++) {
			ps.setObject(i+1;obj[i]);
		}
		//执行查询
		rs=ps.executeQuery();
		}catch(SQLEception e) {
			e.printStackTrace();
		}
		return rs;
	} 
	
	/*
	 * 增删改查
	 * 参数1:sql
	 * 参数2:Object[]值
	 * 返回值:int受影响行数
	 * 
	 * 
	 *
	
	public static int update(String sql,Object[] obj) {
		//获得连接
		Connection conn=getConnection();
		int rowNum =0;
		
		//通过连接对象,传入sql获得预处理对象
		try {
		PreparedStatement conn = conn.prepareStatement(sql);
		//向占位符处设置值
		for(int i=0;i<obj.length;i++) {
			ps.setObject(i+1,obj[1]);
		}
		//执行sql
		rowNum=ps.xecuteUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowNum;
	}
	
	
	
	
	package com.zhiyou100.util;

	import java.sql.ResultSet;
	import java.sql.SQLException;

	import com.zhiyou100.model.User;

	public class TestDButil {

		public static void main(String[] args) throws SQLException {
			String sql = "insert into users values (?,?,?,?)";
			Object[] obj = {22,"迪迦","123456","2019-01-01"};
			int row = DBUtil.update(sql, obj);
			System.out.println(row);
	 	}

		public static void selectByKeyword() throws SQLException {
			String sql = "select * from users where name like ?";
			String keyword = "三";
			Object[] obj = { "%" + keyword + "%" };
			// 查询
			ResultSet rs = DBUtil.select(sql, obj);
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setBirthday(rs.getDate("birthday"));
				System.out.println(user);
			}
		}

		public static void selectOne() throws SQLException {
			String sql = "select * from users where id = ?";
			Object[] obj = { 10 };
			// 查询
			ResultSet rs = DBUtil.select(sql, obj);
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setBirthday(rs.getDate("birthday"));
				System.out.println(user);
			}
		}

		public static void selectAll() throws SQLException {
			// 查全部
			String sql = "select * from users ";
			Object[] obj = {};
			// 查询
			ResultSet rs = DBUtil.select(sql, obj);
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setBirthday(rs.getDate("birthday"));
				System.out.println(user);
			}
		}

	}
		
}*/
