/**
 * 학생은 학번, 이름, 성별이 있다.
 * 학생의 정보를 확인할 수 있다.
 * 딘, 멤버 데이터의 조건을 확인, 직접접근 막기(캡슐화), 힌까반에 초기하(생성자)
 * 
 *
 */

public class Student{
	//1. 일반적으로 캡슐화 원칙에 따라, 멤버 접근제어자는 pricate임
	private String studentNumber;
	private String name;
	private char gender;
	
	//3. 생성자는 가장 마지막에 작성 권장함. - 초기화(필수로 저장하는 값)
	
	// overloading = 이름은 같고, 매개인자 정보가 다른 동작을 오버로딩이라고 함
	public Student() {};
	
	// 생성자는 없을 때만 JVM이 매개인자 없는 기본 생성자를 제공함. 
	public Student(String studentNumber, String name, char gender) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
	}
	
	//2. 간접접근 - setXXX, getXXX 페탄 장의 
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}


/**학생은 학번, 이름, 성별이 있다.
학생의 정보를 확인할 수 있다.
단 멤버 데이터의 조건을 확인-직접접근막는다=캡슐화, 한꺼번에 초기화=생성자 
*/
/**
 * 
 * 
 * public class Student {
	//1. 일반적으로 멤버 데이터는 private
	private String studentNumber;
	private String name;
	private char gender; //M, F
	//3. 생성자는 마지막에 정의 권장 - 초기화(필수로 저장 값) - 생성자는 없을때만 VM이 매개인자 없는 생성자를 제공
	//overloading = 이름은 같고, 매개인자 정보가 다른 동작
	public Student() {}
	public Student(String studentNumber, String name, char gender) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
	}
	
	
	//2. 간접접근 setXxx, getXxx 패턴 정의
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}

 */

