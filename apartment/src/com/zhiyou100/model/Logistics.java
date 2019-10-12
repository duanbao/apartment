package com.zhiyou100.model;

import java.util.Date;

public class Logistics{
	private int lo_id;
	private String lo_name;
	private String lo_idcard;
	private String lo_tel;
	private Date lo_time;
	public int getLo_id() {
		return lo_id;
	}
	@Override
	public String toString() {
		return "Logistics [lo_id=" + lo_id + ", lo_name=" + lo_name + ", lo_idcard=" + lo_idcard + ", lo_tel=" + lo_tel
				+ ", lo_time=" + lo_time + "]";
	}
	public void setLo_id(int lo_id) {
		this.lo_id = lo_id;
	}
	public String getLo_name() {
		return lo_name;
	}
	public void setLo_name(String lo_name) {
		this.lo_name = lo_name;
	}
	public String getLo_idcard() {
		return lo_idcard;
	}
	public void setLo_idcard(String lo_idcard) {
		this.lo_idcard = lo_idcard;
	}
	public String getLo_tel() {
		return lo_tel;
	}
	public void setLo_tel(String lo_tel) {
		this.lo_tel = lo_tel;
	}
	public Date getLo_time() {
		return lo_time;
	}
	public void setLo_time(Date lo_time) {
		this.lo_time = lo_time;
	}
}
