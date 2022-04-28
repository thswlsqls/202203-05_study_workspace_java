package com.test.model;

import java.sql.Date;

public class UserVO {

	private String userId;
	private String pw;
	private String name;
	private Date inDate;
	public UserVO(String userId, String pw, String name, Date inDate) {
		setUserId(userId);
		setPw(pw);
		setName(name);
		setInDate(inDate);
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getInDate() {
		return inDate;
	}
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", name=" + name + ", inDate=" + inDate + "]\n";
	}

}
