package com.test.model;

import java.sql.Date;

public class UserWriterVO {

	private int userWriterNo;
	private String writerPw;
	private String contents;
	private Date writerDate;
	private String userId;
	private String writerName;
	
	public UserWriterVO(int userWriterNo, String writerPw, String contents, Date writerDate, String userId,
			String writerName) {
		setUserWriterNo(userWriterNo);
		setWriterPw(writerPw);
		setContents(contents);
		setWriterDate(writerDate);
		setUserId(userId);
		setWriterName(writerName);
	}
	public int getUserWriterNo() {
		return userWriterNo;
	}
	public void setUserWriterNo(int userWriterNo) {
		this.userWriterNo = userWriterNo;
	}
	public String getWriterPw() {
		return writerPw;
	}
	public void setWriterPw(String writerPw) {
		this.writerPw = writerPw;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getWriterDate() {
		return writerDate;
	}
	public void setWriterDate(Date writerDate) {
		this.writerDate = writerDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	
	@Override
	public String toString() {
		return "UserWriterVO [userWriterNo=" + userWriterNo + ", writerPw=" + writerPw + ", contents=" + contents
				+ ", writerDate=" + writerDate + ", userId=" + userId + ", writerName=" + writerName + "]\n";
	}

}
