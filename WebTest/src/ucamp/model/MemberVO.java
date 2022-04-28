package ucamp.model;

public class MemberVO {
	
	private String memberId;
	private String name;
	private String pw;
	private String gender;
	private String hobby;
	private String blood;
	
	public MemberVO() {}
	public MemberVO(String memberId, String name, String pw, String gender, String hobby, String blood) {
		setMemberId(memberId);
		setName(name);
		setPw(pw);
		setGender(gender);
		setHobby(hobby);
		setBlood(blood);
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}

	/**비밀번호는 출력하지 않음*/
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", name=" + name + ", gender=" + gender + ", hobby=" + hobby
				+ ", blood=" + blood + "]\n";
	}
	
	
}
