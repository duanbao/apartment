package com.zhiyou100.model;

import java.util.Date;

public class House {
	private  int h_id;
	private	 String h_area;
	private  String h_estate;
	private  String h_unitNumber;
	private  int  h_floor;
	private  String  h_roomNo;
	private  String  h_acreage;
	private  String  h_direction;
	private  String  h_fitment;
	private  int  h_isDoubleAir;
	private  int  h_limit;
	private  String  h_facility;
	private  double  h_price;
	private  int  h_status;
	private  String  h_img;
	private  String  h_address;
	private  Date  h_addtime;
	private  Date  h_updateTime;
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public String getH_area() {
		return h_area;
	}
	public void setH_area(String h_area) {
		this.h_area = h_area;
	}
	public String getH_estate() {
		return h_estate;
	}
	public void setH_estate(String h_estate) {
		this.h_estate = h_estate;
	}
	public String getH_unitNumber() {
		return h_unitNumber;
	}
	public void setH_unitNumber(String h_unitNumber) {
		this.h_unitNumber = h_unitNumber;
	}
	public int getH_floor() {
		return h_floor;
	}
	public void setH_floor(int h_floor) {
		this.h_floor = h_floor;
	}
	public String getH_roomNo() {
		return h_roomNo;
	}
	public void setH_roomNo(String h_roomNo) {
		this.h_roomNo = h_roomNo;
	}
	public String getH_acreage() {
		return h_acreage;
	}
	public void setH_acreage(String h_acreage) {
		this.h_acreage = h_acreage;
	}
	public String getH_direction() {
		return h_direction;
	}
	public void setH_direction(String h_direction) {
		this.h_direction = h_direction;
	}
	public String getH_fitment() {
		return h_fitment;
	}
	public void setH_fitment(String h_fitment) {
		this.h_fitment = h_fitment;
	}
	public int getH_isDoubleAir() {
		return h_isDoubleAir;
	}
	public void setH_isDoubleAir(int h_isDoubleAir) {
		this.h_isDoubleAir = h_isDoubleAir;
	}
	public int getH_limit() {
		return h_limit;
	}
	public void setH_limit(int h_limit) {
		this.h_limit = h_limit;
	}
	public String getH_facility() {
		return h_facility;
	}
	public void setH_facility(String h_facility) {
		this.h_facility = h_facility;
	}
	public double getH_price() {
		return h_price;
	}
	public void setH_price(double h_price) {
		this.h_price = h_price;
	}
	
	public int getH_status() {
		return h_status;
	}
	public void setH_status(int h_status) {
		this.h_status = h_status;
	}
	public String getH_img() {
		return h_img;
	}
	public void setH_img(String h_img) {
		this.h_img = h_img;
	}
	public String getH_address() {
		return h_address;
	}
	public void setH_address(String h_address) {
		this.h_address = h_address;
	}
	public Date getH_addtime() {
		return h_addtime;
	}
	public void setH_addtime(Date h_addtime) {
		this.h_addtime = h_addtime;
	}
	public Date getH_updateTime() {
		return h_updateTime;
	}
	public void setH_updateTime(Date h_updateTime) {
		this.h_updateTime = h_updateTime;
	}
	@Override
	public String toString() {
		return "House [h_id=" + h_id + ", h_area=" + h_area + ", h_estate=" + h_estate + ", h_unitNumber="
				+ h_unitNumber + ", h_floor=" + h_floor + ", h_roomNo=" + h_roomNo + ", h_acreage=" + h_acreage
				+ ", h_direction=" + h_direction + ", h_fitment=" + h_fitment + ", h_isDoubleAir=" + h_isDoubleAir
				+ ", h_limit=" + h_limit + ", h_facility=" + h_facility + ", h_price=" + h_price + ", h_status="
				+ h_status + ", h_img=" + h_img + ", h_address=" + h_address + ", h_addtime=" + h_addtime
				+ ", h_updateTime=" + h_updateTime + "]";
	}
	
	
}
