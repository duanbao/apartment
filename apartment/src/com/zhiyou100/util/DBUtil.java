package com.zhiyou100.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static final String url = "jdbc:mysql://localhost:3306/apartment";
	private static final String username = "root";
	private static final String password = "123456";
	
	/*
	 * 静态代码块
	 * 1. 该类加载时执行,且执行一次
	 * 2. 该代码块中的数据 也是随类加载而初始化,且内存独一份
	 */
	static {
		// 1. 加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("---> 加载驱动失败,类未找到");
		}
	}
	/**
	 * 获得连接对象
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try{
			// 2. 获得连接对象
			conn = DriverManager.getConnection(url,username,password);
		}catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("---> 获得连接对象时出错,url _ username _ password");
		}
		return conn;
	}
	
	/**
	 * 关闭所有流
	 */
	public static void closeAll(ResultSet rs,Statement s,Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(s != null) {
			try {
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
