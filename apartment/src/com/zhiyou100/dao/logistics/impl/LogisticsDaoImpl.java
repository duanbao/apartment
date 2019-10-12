package com.zhiyou100.dao.logistics.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.zhiyou100.dao.logistics.LogisticsDao;
import com.zhiyou100.model.House;
import com.zhiyou100.model.Logistics;
import com.zhiyou100.util.DBUtil;

public class LogisticsDaoImpl implements LogisticsDao {

	@Override
	public List<Logistics> findAllLogistics() {
		Connection conn = DBUtil.getConnection();
		String sql="select * from logistics";
		System.out.println(sql);
		List<Logistics> log=new ArrayList<>();
		
		try {
			Statement s=conn.createStatement();
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				Logistics log1=new Logistics();
				log1.setLo_id(rs.getInt("lo_id"));
				log1.setLo_name(rs.getString("lo_name"));
				log1.setLo_idcard(rs.getString("lo_idcard"));
				log1.setLo_tel(rs.getString("lo_tel"));
				log1.setLo_time(rs.getDate("lo_time"));
			
				log.add(log1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return log;
	}

	@Override
	public void insertLogistics(Logistics log) {
		Connection conn = DBUtil.getConnection();
		String sql = "insert into logistics (lo_id,lo_name,lo_idcard,lo_tel,lo_time) value (?,?,?,?,?)";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, log.getLo_id());
			ps.setString(2, log.getLo_name());
			ps.setString(3, log.getLo_idcard());
			ps.setString(4, log.getLo_tel());
			ps.setString(5, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(log.getLo_time()));
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
	public void deleteLogistics(int lo_id) {
		Connection conn = DBUtil.getConnection();
		//执行sql语句
		String sql = "delete from logistics where lo_id = ?";
		try {
			PreparedStatement ps =conn.prepareStatement(sql);
			ps.setInt(1, lo_id);
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
	public Logistics findLogisticsById(int lo_id) {
		Connection conn = DBUtil.getConnection();
		String sql="select * from logistics where lo_id=?";
		
		Logistics log =null;
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, lo_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				 log=new Logistics();
				log.setLo_id(rs.getInt("lo_id"));
				log.setLo_name(rs.getString("lo_name"));
				log.setLo_idcard(rs.getString("lo_idcard"));
				log.setLo_tel(rs.getString("lo_tel"));
				log.setLo_time(rs.getDate("lo_time"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return log;
}

	@Override
	public void updateLogistics(Logistics log) {
		Connection conn = DBUtil.getConnection();
		String sql = "update logistics set lo_name=?,lo_idcard=?,lo_tel=?,lo_time=? where lo_id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, log.getLo_name());
			ps.setString(2, log.getLo_idcard());
			ps.setString(3, log.getLo_tel());
			ps.setString(4, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(log.getLo_time()));
			ps.setInt(5, log.getLo_id());
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
	public Logistics detailLogisticsById(int lo_id) {
		Connection conn = DBUtil.getConnection();
		String sql="select * from logistics where lo_id=?";
		
		Logistics log =null;
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, lo_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				 log=new Logistics();
				log.setLo_id(rs.getInt("lo_id"));
				log.setLo_name(rs.getString("lo_name"));
				log.setLo_idcard(rs.getString("lo_idcard"));
				log.setLo_tel(rs.getString("lo_tel"));
				log.setLo_time(rs.getDate("lo_time"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return log;
	}
}
