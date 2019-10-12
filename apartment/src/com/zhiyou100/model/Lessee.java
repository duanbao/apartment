package com.zhiyou100.model;

import java.util.Date;

public class Lessee {
	private int l_id;
	private String l_name;
	private String l_tel;
	private String l_sex;
	@Override
	public String toString() {
		return "Lessee [l_id=" + l_id + ", l_name=" + l_name + ", l_tel=" + l_tel + ", l_sex=" + l_sex
				+ ", l_nativeplace=" + l_nativeplace + ", l_idcard=" + l_idcard + ", l_addtime=" + l_addtime + "]";
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getL_tel() {
		return l_tel;
	}
	public void setL_tel(String l_tel) {
		this.l_tel = l_tel;
	}
	public String getL_sex() {
		return l_sex;
	}
	public void setL_sex(String l_sex) {
		this.l_sex = l_sex;
	}
	public String getL_nativeplace() {
		return l_nativeplace;
	}
	public void setL_nativeplace(String l_nativeplace) {
		this.l_nativeplace = l_nativeplace;
	}
	public String getL_idcard() {
		return l_idcard;
	}
	public void setL_idcard(String l_idcard) {
		this.l_idcard = l_idcard;
	}
	public Date getL_addtime() {
		return l_addtime;
	}
	public void setL_addtime(Date l_addtime) {
		this.l_addtime = l_addtime;
	}
	private String l_nativeplace;
	private String l_idcard;
	private Date  l_addtime;
}
