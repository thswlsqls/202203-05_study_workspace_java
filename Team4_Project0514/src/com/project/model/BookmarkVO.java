package com.project.model;

public class BookmarkVO {
	private String bookmartDate;
	private String suggestionName;
	private String penName;
	
	public BookmarkVO() {}
	
	public BookmarkVO(String bookmartDate, String suggestionName, String penName) {
		super();
		setBookmartDate(bookmartDate);
		setSuggestionName(suggestionName);
		setPenName(penName);
	}
	public String getBookmartDate() {
		return bookmartDate;
	}
	public void setBookmartDate(String bookmartDate) {
		this.bookmartDate = bookmartDate;
	}
	public String getSuggestionName() {
		return suggestionName;
	}
	public void setSuggestionName(String suggestionName) {
		this.suggestionName = suggestionName;
	}
	public String getPenName() {
		return penName;
	}
	public void setPenName(String penName) {
		this.penName = penName;
	}
	@Override
	public String toString() {
		return "BookmarkVO [bookmartDate=" + bookmartDate + ", suggestionName=" + suggestionName + ", penName="
				+ penName + "]\n";
	}
	
}
