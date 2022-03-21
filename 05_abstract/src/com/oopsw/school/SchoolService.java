package com.oopsw.school;

import java.util.ArrayList;

// 추상적인 동작 중심의 요구사항 - 업무 규칙 ==> interface 정의
public interface SchoolService {
	/** 학생 또는 교사 정보를 입력 
	 * 입력값 - 매개인자 - Person
	 * 출력값 - 리턴타입(값) - boolean or void
	 * */
	void addPerson(Person p);
	
	/** 입력된 정보를 확인 - 모니터 */
	void printAll();
//	void printAll(ArrayList<Person> Persons);
	
	/** 교사 또는 학생의 전화번호를 수정 - 오버로딩 */
//	void setStudentPhoneNumber(String studentNumber, String phoneNumber);
//	void setTeacherPhoneNumber(String studentNumber, String phoneNumber);
	void setPhoneNumber(Student update);
	void setPhoneNumber(Teacher update);

	/** 교사의 이름을 확인 */
	String[] getTeacherNames();
//	String[] getTeacherNames(ArrayList<Teacher> teachers);
	
	/** 특정 교사의 과목을 확인 */
	String getSubject(String teacherNumber);
	
	
}
