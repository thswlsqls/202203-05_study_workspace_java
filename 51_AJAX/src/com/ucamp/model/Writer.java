package com.ucamp.model;

public class Writer {
	
	private int writerNumber;
	private String content;
	private String userId;
	private String password;
	private String writerName;
	private String writerDate;
	
	
	public Writer() {}
	
	public Writer(int writerNumber, String content, String userId, String writerName, String writerDate) {
		this(writerNumber, content, userId, null, writerName, writerDate);
	}
	
	public Writer(int writerNumber, String content, String userId, String password, String writerName, String writerDate) {
		setWriterNumber(writerNumber);
		setContent(content);
		setUserId(userId);
		setPassword(password);
		setWriterName(writerName);
		setWriterDate(writerDate);
	}
	public int getWriterNumber() {
		return writerNumber;
	}
	public void setWriterNumber(int writerNumber) {
		this.writerNumber = writerNumber;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getWriterDate() {
		return writerDate.substring(0, 10);
	}
	public void setWriterDate(String writerDate) {
		this.writerDate = writerDate;
	}
	@Override
	public String toString() {
		return "Writer [writerNumber=" + writerNumber + ", content=" + content + ", userId=" + userId + ", writerName="
				+ writerName + ", writerDate=" + writerDate + "]";
	}
	
	

}
