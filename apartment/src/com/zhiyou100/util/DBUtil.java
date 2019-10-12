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
	 * ��̬�����
	 * 1. �������ʱִ��,��ִ��һ��
	 * 2. �ô�����е����� Ҳ��������ض���ʼ��,���ڴ��һ��
	 */
	static {
		// 1. ��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("---> ��������ʧ��,��δ�ҵ�");
		}
	}
	/**
	 * ������Ӷ���
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try{
			// 2. ������Ӷ���
			conn = DriverManager.getConnection(url,username,password);
		}catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("---> ������Ӷ���ʱ����,url _ username _ password");
		}
		return conn;
	}
	
	/**
	 * �ر�������
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
