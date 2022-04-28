package com.ucamp.model;

public class UserWriter {
	private int writerNumber;
	private String writerId;
	private String writerName;
	private String contents;
	private String writerPw;
	private String writerDate;
	
	
	public UserWriter() {}
	public UserWriter(int writerNumber, String writerId, String writerName, String contents, String writerDate) {
		this(writerNumber, writerId, writerName, contents, null, writerDate);
	}
	
	public UserWriter(int writerNumber, String writerId, String writerName, String contents, String writerPw,String writerDate) {
		super();
		this.writerNumber = writerNumber;
		this.writerId = writerId;
		this.writerName = writerName;
		this.contents = contents;
		this.writerPw = writerPw;
		this.writerDate = writerDate;
	}
	public int getWriterNumber() {
		return writerNumber;
	}
	public void setWriterNumber(int writerNumber) {
		this.writerNumber = writerNumber;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriterPw() {
		return writerPw;
	}
	public void setWriterPw(String writerPw) {
		this.writerPw = writerPw;
	}
	public String getWriterDate() {
		return writerDate;
	}
	public void setWriterDate(String writerDate) {
		this.writerDate = writerDate;
	}
	@Override
	public String toString() {
		return "UserWriter [writerNumber=" + writerNumber + ", writerId=" + writerId + ", writerName=" + writerName
				+ ", contents=" + contents + ", writerDate=" + writerDate + "]";
	}
	
	
}
