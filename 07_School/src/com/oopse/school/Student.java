package com.oopse.school;

public class Student extends Person{

	private String studentNumber;
	
	private int kor;
	private int eng;
	private int math;
	
	private int score;

	public Student(String studentNumber, String name, int score) {
		super(name);
		this.studentNumber = studentNumber;
		this.score = score;
	}
	
	public Student(String studentNumber, String name) {
		super(name);
		this.studentNumber = studentNumber;
		this.score = getSum();
	}
	
	public Student(String studentNumber, String name, int kor, int eng, int math) {
		super(name);
		this.studentNumber = studentNumber;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getScore() {
		return getSum();
	}

	@Override
	public String toString() {
		return "studentNumber=" + studentNumber + ", kor=" + kor + ", eng=" + eng + ", math=" + math;
	}
	
	public String printScores() {
		return "kor=" + kor + ", eng=" + eng + ", math=" + math;  
	}
	
	public int printScore() {
		return getScore();
	}
	
	public int getSum() {
		int sum = 0;
		sum = getKor() + getEng() + getMath();
		return sum;
	}

	public float getAvg() {
		float avg = 0;
		avg = (float)getSum()/3;
		return avg;
	}
	
}


//package com.oopsw.school;
////B)
//public class Student extends Person{
//	private String studentNumber;
//
//	public Student(String studentNumber, String name) {
//		super(name);
//		setStudentNumber(studentNumber);
//	}
//
//	public String getStudentNumber() {
//		return studentNumber;
//	}
//
//	public void setStudentNumber(String studentNumber) {
//		this.studentNumber = studentNumber;
//	}
//	
//	@Override
//	public String toString() {
//		return "ÇĞ¹ø = "+studentNumber+", "+ super.toString();
//	}
//	
//}
