package ucamp.model;

public class MemberVO {
	private String memberId;
	private String memberName;
	private String memberPw;
	private String memberGender;
	private String memberBlood;
	private String memberHobby;
	public MemberVO() {}
	public MemberVO(String memberId, String memberName, String memberGender, String memberBlood,
			String memberHobby) {
		this(memberId, memberName, null, memberGender, memberBlood, memberHobby);
	}
	
	public MemberVO(String memberId, String memberName, String memberPw, String memberGender, String memberBlood,
			String memberHobby) {
		super();
		setMemberId(memberId);
		setMemberName(memberName);
		setMemberPw(memberPw);
		setMemberGender(memberGender);
		setMemberBlood(memberBlood);
		setMemberHobby(memberHobby);
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberBlood() {
		return memberBlood;
	}
	public void setMemberBlood(String memberBlood) {
		this.memberBlood = memberBlood;
	}
	public String getMemberHobby() {
		return memberHobby;
	}
	public void setMemberHobby(String memberHobby) {
		this.memberHobby = memberHobby;
	}
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberName=" + memberName + ", memberPw=" + memberPw
				+ ", memberGender=" + memberGender + ", memberBlood=" + memberBlood + ", memberHobby=" + memberHobby
				+ "]";
	}
	
}
