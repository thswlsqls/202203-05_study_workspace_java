package ucamp.model;

public class MemberVisitVO {
	private int visitorNo;
	private String visitorId;
	private String visitorPw;
	private String visitorContents;
	private String writeDate;
	public MemberVisitVO() {}
	public MemberVisitVO(int visitorNo, String visitorId, String visitorContents, String writeDate) {
		this(visitorNo, visitorId, null, visitorContents, writeDate);
	}
	
	public MemberVisitVO(int visitorNo, String visitorId, String visitorPw, String visitorContents, String writeDate) {
		super();
		setVisitorNo(visitorNo);
		setVisitorId(visitorId);
		setVisitorPw(visitorPw);
		setVisitorContents(visitorContents);
		setWriteDate(writeDate);
	}
	public int getVisitorNo() {
		return visitorNo;
	}
	public void setVisitorNo(int visitorNo) {
		this.visitorNo = visitorNo;
	}
	public String getVisitorId() {
		return visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}
	public String getVisitorPw() {
		return visitorPw;
	}
	public void setVisitorPw(String visitorPw) {
		this.visitorPw = visitorPw;
	}
	public String getVisitorContents() {
		return visitorContents;
	}
	public void setVisitorContents(String visitorContents) {
		this.visitorContents = visitorContents;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "MemberVisitVO [visitorNo=" + visitorNo + ", visitorId=" + visitorId + ", visitorPw=" + visitorPw
				+ ", visitorContents=" + visitorContents + ", writeDate=" + writeDate + "]\n";
	}
	
}

