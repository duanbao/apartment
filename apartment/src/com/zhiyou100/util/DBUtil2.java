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
	 * ��̬�����
	 * 1.�������ʱִ��,��ִ��һ��
	 * 2.�ô�����е�����,Ҳ��������ض���ʼ����,���ڴ��һ��
	 */
	static {
		//1.��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("-->��������ʧ��,��δ�ҵ�");
		}
	}
	/*
	 * ������Ӷ���
	 */
	public static Connection getConnection() {
		Connection conn=null;
		try {
			//2.������Ӷ���
			conn=DriverManager.getConnection(url,username,password);
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("-->������Ӷ���ʱ����,url_username_password");
		}
		return conn;	
	}
	/*
	 * �ر�������
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
	 * ��װ��ѯ
	 * ���ؽ����
	 * ���� 1:sql
	 * ����2:Object��������,�洢����sql�����Ҫƴ�ӵĲ���
	 * 
	 * sql: select *from user where id = ?
	 * 			select * from user where id=**no hage**  
	 * obj:[1]
	 * ���ø�select����ʱ,�����sqlһ��ʱ��?
	 * 				�����obj�����е�����һ��Ҫ��?����Ӧ
	 * 
	 * 
	 */
	
	
	
	
	
	
}
