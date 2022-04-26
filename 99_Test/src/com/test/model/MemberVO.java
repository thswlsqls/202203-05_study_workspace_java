package com.test.model;

import java.sql.Date;

public class MemberVO {
	private String userId;
	private String pw;
	private String name;
	private String phoneNumber;
	private String gender;
	private String hobby;
	private Date birthday;
	
	public MemberVO() {}

	public MemberVO(String userId, String pw, String name, String phoneNumber, String gender, String hobby,
			Date birthday) {
		setUserId(userId);
		setPw(pw);
		setName(name);
		setPhoneNumber(phoneNumber);
		setGender(gender);
		setHobby(hobby);
		setBirthday(birthday);
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "MemberVO [userId=" + userId + ", pw=" + pw + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", gender=" + gender + ", hobby=" + hobby + ", birthday=" + birthday + "]\n";
	}
	
}