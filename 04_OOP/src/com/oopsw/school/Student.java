package com.oopsw.school;

public class Student extends Person { // 공통의 코드가 있으면 무조건 상속부터 함
	// A2 - 상속 받은 멤버 데이터 외의 멤버를 추가함
	private String studentNumber;

	// A3 - 생성자는 모든 멤버 데이터를 초기화할 수 있다. -> 자동생성할 때 원하면 수정 가능함.
	public Student(String studentNumber, String name) {
		super(name); // 셍성자에서 다른 생성자를 호출 1번만 가능함 - 없으먄 기본 생성자라도 호출(VM)
	//	this.studentNumber = studentNumber;
		setStudentNumber(studentNumber);
	}

	// A4 
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	//A5 - 상속받은 멤버 중에서 구현부가 맘에 안드는 것 있으면 선택 변경 ==> overriding
	@Override
	public void print() {
		System.out.print("학번 : "+ studentNumber);
		super.print(); // 부모의 메서드를 추가로 사용하고 싶으면 호출함. 
	}

	@Override
	public String toString() {
//		return "Student [studentNumber=" + studentNumber + "]";
		return "학번: " + studentNumber + super.toString();
	}
	
	
	
}


/**
package com.oopsw.school;

public class Student extends Person{  //A1
	//A2 - 상속받은 멤버 데이터 외의 멤버를 추가
	private String studentNumber;

	//A3 - 생성자는 모든 멤버 데이터를 초기화 할 수 있다. = 자동생성할때 원하면 수정 가능
	public Student(String studentNumber, String name) {
		super(name);  //생성자에서 다른 생성자를 호출 1번만 가능-없으면 기본 생성자라도 호출(VM)
		setStudentNumber(studentNumber);
	}
	//A4	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	//A5 - (상속)받은 멤버 중에서 (구현부가 맘에 안드는것) 있으면 선택 변경 ==> overriding ==> 재사용에 따른 유지보수를 위한 코드
	@Override
	public void print() {
		System.out.print("학번 : "+ studentNumber);
		super.print();  //부모의 메서드를 추가로 사용하고 싶으면 호출
	}
	@Override
	public String toString() {
		return "학번 : "+ studentNumber+ super.toString();
	}

}

 */