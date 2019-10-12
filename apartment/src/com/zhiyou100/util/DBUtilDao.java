/*package com.zhiyou100.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtilDao {
	
	public static ResultSet select(String sql,Object[] obj) {
		//�������
		Connection conn=getConnection();
		ResultSet rs =null;
		//����sql�����Ԥ�������
		try {
		PreparedStatement conn = conn.prepareStatement(sql);
		/*
		 * ��ռλ�������ò���
		 * 1.ռλ�����Ĳ�������
		 * 2.����ռλ��
		 *
		ps.setObject(1,obj[0]);
		ps.setObject(2,obj[1]);
		for(int i=0;i<obj.length;i++) {
			ps.setObject(i+1;obj[i]);
		}
		//ִ�в�ѯ
		rs=ps.executeQuery();
		}catch(SQLEception e) {
			e.printStackTrace();
		}
		return rs;
	} 
	
	/*
	 * ��ɾ�Ĳ�
	 * ����1:sql
	 * ����2:Object[]ֵ
	 * ����ֵ:int��Ӱ������
	 * 
	 * 
	 *
	
	public static int update(String sql,Object[] obj) {
		//�������
		Connection conn=getConnection();
		int rowNum =0;
		
		//ͨ�����Ӷ���,����sql���Ԥ�������
		try {
		PreparedStatement conn = conn.prepareStatement(sql);
		//��ռλ��������ֵ
		for(int i=0;i<obj.length;i++) {
			ps.setObject(i+1,obj[1]);
		}
		//ִ��sql
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
			Object[] obj = {22,"����","123456","2019-01-01"};
			int row = DBUtil.update(sql, obj);
			System.out.println(row);
	 	}

		public static void selectByKeyword() throws SQLException {
			String sql = "select * from users where name like ?";
			String keyword = "��";
			Object[] obj = { "%" + keyword + "%" };
			// ��ѯ
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
			// ��ѯ
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
			// ��ȫ��
			String sql = "select * from users ";
			Object[] obj = {};
			// ��ѯ
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
