package com.project.model;

import java.util.Comparator;

public class FollowListVO {
	private String followNo;
	private String followDate;
	private String followeeID;
	private String followerID;
	private String followeePenName;
	
	public FollowListVO() {}
	

	public FollowListVO(String followDate, String followee_id) {
		this(null, followDate, followee_id, null, null);
	}
	
	public FollowListVO(String followNo
			, String followDate
			, String followeeID
			, String followerID
			, String followeePenName) {
		super();
		setFollowNo(followNo);
		setFollowDate(followDate);
		setFolloweeID(followeeID);
		setFollowerID(followerID);
		setFolloweePenName(followeePenName);
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
	public String getFolloweePenName() {
		return followeePenName;
	}

	public void setFolloweePenName(String followeePenName) {
		this.followeePenName = followeePenName;
	}

	@Override
	public String toString() {
		return "FollowListVO [followNo=" + followNo + ", followDate=" + followDate + ", followeeID=" + followeeID
				+ ", followerID=" + followerID + "]\n";
	}
	
}
