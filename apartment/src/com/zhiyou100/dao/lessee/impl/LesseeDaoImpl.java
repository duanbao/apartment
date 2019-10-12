package com.zhiyou100.dao.lessee.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.zhiyou100.dao.lessee.LesseeDao;
import com.zhiyou100.model.Contract;
import com.zhiyou100.model.House;
import com.zhiyou100.model.Lessee;
import com.zhiyou100.util.DBUtil;

public class LesseeDaoImpl implements LesseeDao {

	
	
	@Override
	public List<Lessee> findAllLessee() {
		Connection conn = DBUtil.getConnection();
		String sql="select * from lessee";
		System.out.println(sql);
		List<Lessee> lessee=new ArrayList<>();
		
		try {
			Statement s=conn.createStatement();
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				Lessee les= new Lessee();
				les.setL_id(rs.getInt("l_id"));
				les.setL_name(rs.getString("l_name"));
				les.setL_tel(rs.getString("l_tel"));
				les.setL_sex(rs.getString("l_sex"));
				les.setL_nativeplace(rs.getString("l_nativeplace"));
				les.setL_idcard(rs.getString("l_idcard"));
				les.setL_addtime(rs.getDate("l_addtime"));
				//添加集合
				lessee.add(les);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lessee;
	}
	
	@Override
	public void insertLessee(Lessee lessee) {
		Connection conn = DBUtil.getConnection();
		String sql = "insert into lessee (l_id,l_name,l_tel,l_sex,l_nativeplace,l_idcard,l_addtime) value (?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, lessee.getL_id());
			ps.setString(2,lessee.getL_name());
			ps.setString(3,lessee.getL_tel());
			ps.setString(4,lessee.getL_sex());
			ps.setString(5,lessee.getL_nativeplace());
			ps.setString(6,lessee.getL_idcard());
			ps.setString(7, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(lessee.getL_addtime()));
			//执行插入
			int rowNum = ps.executeUpdate();
			if(rowNum>0) {
				System.out.println("插入成功");
			}else {
				System.out.println("插入失败");
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteLessee(int l_id) {
		Connection conn = DBUtil.getConnection();
		String sql="delete from lessee where l_id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, l_id);
			int rowNum = ps.executeUpdate();
			if(rowNum>0) {
				System.out.println("删除成功");
			}else {
				System.out.println("删除失败");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Lessee findLesseeById(int l_id) {
		Connection conn = DBUtil.getConnection();
		String sql = "select * from lessee where l_id=?";
		Lessee les=null;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, l_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				les = new Lessee();
				
				les.setL_id(rs.getInt("l_id"));
				les.setL_name(rs.getString("l_name"));
				les.setL_tel(rs.getString("l_tel"));
				les.setL_sex(rs.getString("l_sex"));
				les.setL_nativeplace(rs.getString("l_nativeplace"));
				les.setL_idcard(rs.getString("l_idcard"));
				les.setL_addtime(rs.getDate("l_addtime"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return les;
	}

	@Override
	public void updateLessee(Lessee lessee) {
		Connection conn = DBUtil.getConnection();
		String sql = "update lessee set l_name=?,l_tel=?,l_sex=?,l_nativeplace=?,l_idcard=?,l_addtime=? where l_id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1,lessee.getL_name());
			ps.setString(2,lessee.getL_tel());
			ps.setString(3,lessee.getL_sex());
			ps.setString(4,lessee.getL_nativeplace());
			ps.setString(5,lessee.getL_idcard());
			ps.setString(6, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(lessee.getL_addtime()));
			ps.setInt(7, lessee.getL_id());
			int rowNum = ps.executeUpdate();
			
			if(rowNum>0) {
				System.out.println("更新成功");
			}else {
				System.out.println("更新失败");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public Lessee detailLesseeById(int l_id) {

		Connection conn = DBUtil.getConnection();
		String sql="select * from lessee where l_id=?";
		Lessee les=null;
		System.out.println("sql");
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, l_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("dao层");
				les=new Lessee();
				les.setL_id(rs.getInt("l_id"));
				les.setL_name(rs.getString("l_name"));
				les.setL_tel(rs.getString("l_tel"));
				les.setL_sex(rs.getString("l_sex"));
				les.setL_nativeplace(rs.getString("l_nativeplace"));
				les.setL_idcard(rs.getString("l_idcard"));
				les.setL_addtime(rs.getDate("l_addtime"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return les;
	}

	

}
