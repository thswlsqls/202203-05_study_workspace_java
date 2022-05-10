package com.project.model;

public class FollowListVO {
	private String followNo;
	private String followDate;
	private String followeeID;
	private String followerID;
	
	public FollowListVO() {}
	
	public FollowListVO(String followDate, String followee_id) {
		this(null, followDate, followee_id, null);
	}
	
	public FollowListVO(String followNo, String followDate, String followeeID, String followerID) {
		super();
		setFollowNo(followNo);
		setFollowDate(followDate);
		setFolloweeID(followeeID);
		setFollowerID(followerID);
	}
	public String getFollowNo() {
		return followNo;
	}
	public void setFollowNo(String followNo) {
		this.followNo = followNo;
	}
	public String getFollowDate() {
		return followDate;
	}
	public void setFollowDate(String followDate) {
		this.followDate = followDate;
	}
	public String getFolloweeID() {
		return followeeID;
	}
	public void setFolloweeID(String followeeID) {
		this.followeeID = followeeID;
	}
	public String getFollowerID() {
		return followerID;
	}
	public void setFollowerID(String followerID) {
		this.followerID = followerID;
	}
	@Override
	public String toString() {
		return "FollowListVO [followNo=" + followNo + ", followDate=" + followDate + ", followeeID=" + followeeID
				+ ", followerID=" + followerID + "]\n";
	}
	
	
}
