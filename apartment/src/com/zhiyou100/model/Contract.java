package com.zhiyou100.model;

import java.util.Date;

public class Contract {
	private  int c_id;
	private  int h_id;
	private  int l_id;
	private  Date c_time;
	private  Date c_starttime;
	private  Date c_endtime;
	private  double c_rental;
	private  double c_cash;
	private  String c_name;
	private  int c_status;
	@Override
	public String toString() {
		return "Contract [c_id=" + c_id + ", h_id=" + h_id + ", l_id=" + l_id + ", c_time=" + c_time + ", c_starttime="
				+ c_starttime + ", c_endtime=" + c_endtime + ", c_rental=" + c_rental + ", c_cash=" + c_cash
				+ ", c_name=" + c_name + ", c_status=" + c_status + "]";
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public Date getC_time() {
		return c_time;
	}
	public void setC_time(Date c_time) {
		this.c_time = c_time;
	}
	public Date getC_starttime() {
		return c_starttime;
	}
	public void setC_starttime(Date c_starttime) {
		this.c_starttime = c_starttime;
	}
	public Date getC_endtime() {
		return c_endtime;
	}
	public void setC_endtime(Date c_endtime) {
		this.c_endtime = c_endtime;
	}
	public double getC_rental() {
		return c_rental;
	}
	public void setC_rental(double c_rental) {
		this.c_rental = c_rental;
	}
	public double getC_cash() {
		return c_cash;
	}
	public void setC_cash(double c_cash) {
		this.c_cash = c_cash;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_status() {
		return c_status;
	}
	public void setC_status(int c_status) {
		this.c_status = c_status;
	}
	
}
