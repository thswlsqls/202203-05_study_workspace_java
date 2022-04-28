package ucamp.model;

import java.sql.Date;

public class VisitorVO {

	private int visitorSeq;
	private String memberId;
	private String pw;
	private String contents;
	private Date writerDate;

	public VisitorVO() {}
	public VisitorVO(int visitorSeq, String memberId, String pw, String contents, Date writerDate) {
		setVisitorSeq(visitorSeq);
		setMemberId(memberId);
		setPw(pw);
		setContents(contents);
		setWriterDate(writerDate);
	}
	
	public int getVisitorSeq() {
		return visitorSeq;
	}
	public void setVisitorSeq(int visitorSeq) {
		this.visitorSeq = visitorSeq;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
	
	/**비밀번호는 출력하지 않음*/
	@Override
	public String toString() {
		return "VisitorVO [visitorSeq=" + visitorSeq + ", memberId=" + memberId + ", contents=" + contents
				+ ", witerDate=" + writerDate + "]\n";
	}

	
	
	
}
