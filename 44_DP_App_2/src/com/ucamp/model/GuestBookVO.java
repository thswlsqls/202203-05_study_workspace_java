package com.ucamp.model;

import java.sql.Date;

public class GuestBookVO {
	private int guestNo;
	private String userId;
	private String title;
	private String content;
	private Date inDate;
	
	public GuestBookVO() {}
	public GuestBookVO(int guestNo, String userId, String title, String content, Date inDate) {
		setGuestNo(guestNo);
		setUserId(userId);
		setTitle(title);
		setContent(content);
		setInDate(inDate);
	}
	
	public int getGuestNo() {
		return guestNo;
	}
	public void setGuestNo(int guestNo) {
		this.guestNo = guestNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getInDate() {
		return inDate;
	}
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	
	@Override
	public String toString() {
		return "GuestBookVO [guestNo=" + guestNo + ", userId=" + userId + ", title=" + title + ", content=" + content
				+ ", inDate=" + inDate + "]\n";
	}
}
