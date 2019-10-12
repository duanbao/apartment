package com.zhiyou100.dao.contract.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.zhiyou100.dao.contract.ContractDao;
import com.zhiyou100.model.Contract;
import com.zhiyou100.model.House;
import com.zhiyou100.util.DBUtil;

public class ContractDaoImpl implements ContractDao {

	@Override
	public List<Contract> findAllHouse() {
		Connection conn = DBUtil.getConnection();
		String sql="select * from contract";
		System.out.println(sql);
		List<Contract> contract=new ArrayList<>();
		try {
			Statement s=conn.createStatement();
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				Contract con=new Contract();
				con.setC_id(rs.getInt("c_id"));
				con.setH_id(rs.getInt("h_id"));
				con.setL_id(rs.getInt("l_id"));
				con.setC_time(rs.getDate("c_time"));
				con.setC_starttime(rs.getDate("c_starttime"));
				con.setC_endtime(rs.getDate("c_endtime"));
				con.setC_rental(rs.getDouble("c_rental"));
				con.setC_cash(rs.getDouble("c_cash"));
				con.setC_name(rs.getString("c_name"));
				con.setC_status(rs.getInt("c_status"));
				
				//添加集合
				contract.add(con);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return contract;

	}


	
	@Override
	public void insertContract(Contract con) {
		Connection conn = DBUtil.getConnection();
		String sql = "insert into contract (c_id,h_id,l_id,c_time,c_starttime,c_endtime,c_rental,c_cash,c_name,c_status) value (?,?,?,?,?,?,?,?,?,?)";
		//获得预处理对象
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,con.getC_id());
			ps.setInt(2, con.getH_id());
			ps.setInt(3, con.getL_id());
			ps.setString(4, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(con.getC_time()));
			ps.setString(5, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(con.getC_starttime()));
			ps.setString(6, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(con.getC_endtime()));
			ps.setDouble(7, con.getC_rental());
			ps.setDouble(8, con.getC_cash());
			ps.setString(9, con.getC_name());
			ps.setInt(10, con.getC_status());
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
	public void deleteContract(int c_id) {
		Connection conn = DBUtil.getConnection();
		//执行sql语句
		String sql ="delete from contract where c_id =?";
		//创建执行语句对象
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, c_id);
			int rowName=ps. executeUpdate();
			if(rowName >0) {
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
	public void updateContract(Contract con) {
		Connection conn = DBUtil.getConnection();
		String sql ="update contract set h_id=?,l_id=?,c_time=?,c_starttime=?,c_endtime=?,c_rental=?,c_cash=?,c_name=?,c_status=? where c_id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setInt(1, con.getH_id());
			ps.setInt(2, con.getL_id());
			ps.setString(3, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(con.getC_time()));
			ps.setString(4, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(con.getC_starttime()));
			ps.setString(5, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(con.getC_endtime()));
			ps.setDouble(6, con.getC_rental());
			ps.setDouble(7, con.getC_cash());
			ps.setString(8, con.getC_name());
			ps.setInt(9, con.getC_status());
			ps.setInt(10, con.getC_id());
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
	public Contract findContractById(int c_id) {
		Connection conn = DBUtil.getConnection();
		String sql="select * from contract where c_id=?";
		Contract contract =null; 
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, c_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				contract=new Contract();
				
				contract.setC_id(rs.getInt("c_id"));
				contract.setH_id(rs.getInt("h_id"));
				contract.setL_id(rs.getInt("l_id"));
				contract.setC_time(rs.getDate("c_time"));
				contract.setC_starttime(rs.getDate("c_starttime"));
				contract.setC_endtime(rs.getDate("c_endtime"));
				contract.setC_rental(rs.getDouble("c_rental"));
				contract.setC_cash(rs.getDouble("c_cash"));
				contract.setC_name(rs.getString("c_name"));
				contract.setC_status(rs.getInt("c_status"));
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contract;
	}



	@Override
	public Contract detailContractById(int c_id) {
		Connection conn = DBUtil.getConnection();
		String sql="select * from contract where c_id=?";
		Contract contract =null; 
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, c_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				contract=new Contract();
				
				contract.setC_id(rs.getInt("c_id"));
				contract.setH_id(rs.getInt("h_id"));
				contract.setL_id(rs.getInt("l_id"));
				contract.setC_time(rs.getDate("c_time"));
				contract.setC_starttime(rs.getDate("c_starttime"));
				contract.setC_endtime(rs.getDate("c_endtime"));
				contract.setC_rental(rs.getDouble("c_rental"));
				contract.setC_cash(rs.getDouble("c_cash"));
				contract.setC_name(rs.getString("c_name"));
				contract.setC_status(rs.getInt("c_status"));
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contract;
	}
}




