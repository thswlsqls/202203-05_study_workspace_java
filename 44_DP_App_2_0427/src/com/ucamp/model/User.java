package com.ucamp.model;

public class User {
	private String userId;
	private String pw;
	private String name;
	private String inDate;
	
	
	public User() {}
	public User(String userId, String pw, String name) {
		this(userId, pw, name, null);
	}
	public User(String userId, String pw, String name, String inDate) {
		super();
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
	public String getInDate() {
		return inDate;
	}
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", inDate=" + inDate + "]";
	}
	
	
}
