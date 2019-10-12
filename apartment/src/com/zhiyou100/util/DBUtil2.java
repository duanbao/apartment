package com.zhiyou100.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil2 {

	private static final String url ="jdbc:mysql://localhoust:3306/day19";
	private static final String username="root";
	private static final String password= "123456";
	
	/*
	 * 静态代码块
	 * 1.该类加载时执行,且执行一次
	 * 2.该代码快中的数据,也是随类加载而初始化的,且内存独一份
	 */
	static {
		//1.加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("-->加载驱动失败,类未找到");
		}
	}
	/*
	 * 获得连接对象
	 */
	public static Connection getConnection() {
		Connection conn=null;
		try {
			//2.获得连接对象
			conn=DriverManager.getConnection(url,username,password);
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("-->获得连接对象时出错,url_username_password");
		}
		return conn;	
	}
	/*
	 * 关闭所有流
	 */
	public static void closeAll(ResultSet rs,Statement s,Connection conn) {
		if(rs!=null) {
			try {
				rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(s!=null) {
			try {
				s.close();
			}catch(SQLException e){
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
	/*
	 * 封装查询
	 * 返回结果集
	 * 参数 1:sql
	 * 参数2:Object类型数组,存储的是sql语句需要拼接的参数
	 * 
	 * sql: select *from user where id = ?
	 * 			select * from user where id=**no hage**  
	 * obj:[1]
	 * 调用给select方法时,传入的sql一定时带?
	 * 				传入的obj数组中的数据一定要与?处对应
	 * 
	 * 
	 */
	
	
	
	
	
	
}
