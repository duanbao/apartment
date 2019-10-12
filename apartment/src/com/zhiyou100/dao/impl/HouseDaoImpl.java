package com.zhiyou100.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.zhiyou100.dao.HouseDao;
import com.zhiyou100.model.House;
import com.zhiyou100.util.DBUtil;

public class HouseDaoImpl implements HouseDao {


	public List<House> findAllHouse() {
		Connection conn = DBUtil.getConnection();
		String sql="select * from house";
		System.out.println(sql);
		List<House> house1=new ArrayList<>();
		try {
			Statement s=conn.createStatement();
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				House house=new House();
				house.setH_id(rs.getInt("h_id"));
				house.setH_area(rs.getString("h_area"));
				house.setH_estate(rs.getString("h_estate"));
				house.setH_unitNumber(rs.getString("h_unitNumber"));
				house.setH_floor(rs.getInt("h_floor"));
				house.setH_roomNo(rs.getString("h_roomNo"));
				house.setH_acreage(rs.getString("h_acreage"));
				house.setH_direction(rs.getString("h_direction"));
				house.setH_fitment(rs.getString("h_fitment"));
				house.setH_isDoubleAir(rs.getInt("h_isDoubleAir"));
				house.setH_limit(rs.getInt("h_limit"));
				house.setH_facility(rs.getString("h_facility"));
				house.setH_price(rs.getDouble("h_price"));
				house.setH_status(rs.getInt("h_status"));
				house.setH_img(rs.getString("h_img"));
				house.setH_address(rs.getString("h_address"));
				house.setH_addtime(rs.getDate("h_addtime"));
				house.setH_updateTime(rs.getDate("h_updateTime"));
				//添加集合
				house1.add(house);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return house1;
	}

	@Override
	public void insertHouse(House house) {
		Connection conn = DBUtil.getConnection();
		System.out.println("charuzhixing");
		String sql = "insert into house (h_id,h_area,h_estate,h_unitNumber,h_floor,h_roomNo,h_acreage,h_direction,h_fitment,h_limit,h_facility,h_price,h_status,h_img,h_address,h_addtime,h_updateTime) value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		//获得预处理对象
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, house.getH_id());
			ps.setString(2, house.getH_area());
			ps.setString(3, house.getH_estate());
			ps.setString(4, house.getH_unitNumber());
			ps.setInt(5, house.getH_floor());
			ps.setString(6, house.getH_roomNo());
			ps.setString(7, house.getH_acreage());
			ps.setString(8, house.getH_direction());
			ps.setString(9, house.getH_fitment());
			//ps.setInt(9, house.getH_isDoubleAir());
			ps.setInt(10, house.getH_limit());
			ps.setString(11, house.getH_facility());
			ps.setDouble(12, house.getH_price());
			ps.setInt(13, house.getH_status());
			ps.setString(14, house.getH_img());
			ps.setString(15, house.getH_address());
			ps.setString(16, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(house.getH_addtime()));
			ps.setString(17, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(house.getH_updateTime()));
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
	public void deleteHouse(int h_id) {
		Connection conn = DBUtil.getConnection();
		//执行sql语句
		String sql = "delete from house where h_id = ?";
		try {
			//创建执行语句对像
			PreparedStatement ps =conn.prepareStatement(sql);
			
			ps.setInt(1, h_id);
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
	public void updateHouse(House house) {
		Connection conn = DBUtil.getConnection();
		String sql = "update house set h_area=?,h_estate=?,h_unitNumber=?,h_floor=?,h_roomNo=?,h_acreage=?,h_direction=?,h_fitment=?,h_isDoubleAir=?,h_limit=?,h_facility=?,h_price=?,h_status=?,h_img=?,h_address=?,h_addtime=?,h_updateTime=? where h_id =?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			//ps.setInt(1, house.getH_id());
			
			ps.setString(1, house.getH_area());
			ps.setString(2, house.getH_estate());
			ps.setString(3, house.getH_unitNumber());
			ps.setInt(4, house.getH_floor());
			ps.setString(5, house.getH_roomNo());
			ps.setString(6, house.getH_acreage());
			ps.setString(7, house.getH_direction());
			ps.setString(8, house.getH_fitment());
			ps.setInt(9, house.getH_isDoubleAir());
			ps.setInt(10, house.getH_limit());
			ps.setString(11, house.getH_facility());
			ps.setDouble(12, house.getH_price());
			ps.setInt(13, house.getH_status());
			ps.setString(14, house.getH_img());
			ps.setString(15, house.getH_address());
			ps.setString(16, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(house.getH_addtime()));
			ps.setString(17, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(house.getH_updateTime()));
			ps.setInt(18, house.getH_id());
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
	public House findHouseById(int h_id) {
		Connection conn = DBUtil.getConnection();
		String sql="select * from house where h_id=?";
		House house=null;
		System.out.println(sql);
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, h_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("根据id查找数据  dao层");
				house =new House();
				//ps.setInt(18, house.getH_id());
				house.setH_id(rs.getInt("h_id"));
				house.setH_area(rs.getString("h_area"));
				house.setH_estate(rs.getString("h_estate"));
				house.setH_unitNumber(rs.getString("h_unitNumber"));
				house.setH_floor(rs.getInt("h_floor"));
				house.setH_roomNo(rs.getString("h_roomNo"));
				house.setH_acreage(rs.getString("h_acreage"));
				house.setH_direction(rs.getString("h_direction"));
				house.setH_fitment(rs.getString("h_fitment"));
				house.setH_isDoubleAir(rs.getInt("h_isDoubleAir"));
				house.setH_limit(rs.getInt("h_limit"));
				house.setH_facility(rs.getString("h_facility"));
				house.setH_price(rs.getDouble("h_price"));
				house.setH_status(rs.getInt("h_status"));
				house.setH_img(rs.getString("h_img"));
				house.setH_address(rs.getString("h_address"));
				house.setH_addtime(rs.getDate("h_addtime"));
				house.setH_updateTime(rs.getDate("h_updateTime"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return house;
}
	

		

		
			


			@Override
			public House detailHouseById(int h_id) {//详情
				Connection conn = DBUtil.getConnection();
				String sql="select * from house where h_id=?";
				House house=null;
				System.out.println(sql);
				try {
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ps.setInt(1, h_id);
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						System.out.println("dao层");
						house =new House();
						//house.setH_updateTime(rs.getDate("h_updateTime"));
						house.setH_id(rs.getInt("h_id"));
						house.setH_area(rs.getString("h_area"));
						house.setH_estate(rs.getString("h_estate"));
						house.setH_unitNumber(rs.getString("h_unitNumber"));
						house.setH_floor(rs.getInt("h_floor"));
						house.setH_roomNo(rs.getString("h_roomNo"));
						house.setH_acreage(rs.getString("h_acreage"));
						house.setH_direction(rs.getString("h_direction"));
						house.setH_fitment(rs.getString("h_fitment"));
						house.setH_isDoubleAir(rs.getInt("h_isDoubleAir"));
						house.setH_limit(rs.getInt("h_limit"));
						house.setH_facility(rs.getString("h_facility"));
						house.setH_price(rs.getDouble("h_price"));
						house.setH_status(rs.getInt("h_status"));
						house.setH_img(rs.getString("h_img"));
						house.setH_address(rs.getString("h_address"));
						house.setH_addtime(rs.getDate("h_addtime"));
						house.setH_updateTime(rs.getDate("h_updateTime"));
					}
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
				return house;
				
			
			}
				
			}
