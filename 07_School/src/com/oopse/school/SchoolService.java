package com.oopse.school;
import java.util.*;

// interface - 업무 전문가가 제공함
// data의 요구사항을 제공 - 학생은 학번, 이름이 있다. 교사는 교사번호, 이름, 담당과목이 있다. ==> 공통 Person - name
public interface SchoolService {

	/**
	 * 입력값은 Person 계열이다.
	 * 업무 내용 : 추가
	 * */
	public void addPerson(Person p);
	
	/** 등록된 모든 Person 계열의 정보를 확인 */
	public Collection<Person> getPersons();
	
	/** Person 중에서 학생 정보만 확인 */
	public Collection<Student> getStudents();
	
	/** 특정 학번의 학생의 이름 확인 */
	public String getStudentName(String studentNumber);
	
	/** 특정 학생의 이름을 수정  */
	public boolean setStudentName(String studentNumber, String updateName);
	
	/** 특정 학생 여부 확인 */
	boolean isStudent(String studentNumber); //점수, 총점, 평균 계산 결과를 확인 
	
	/** 모든 학생 점수 */
	public Collection<Integer> getAllStudentScoreList(Collection<Person> persons);
	
	/** 모든 학생 점수 합계*/
	public int getAllStudentScoreSum(Collection<Person> persons);
	
	/** 모든 학생 점수 평균 */
	public float getAllStudentScoreAvg(Collection<Person> persons);
	
}

//package com.oopsw.school;
//
//import java.util.Collection;
//
////A)interface - 업무 전문가가 제공
////data요구사항 제공 - 학생은 학번, 이름 이 있다. 교사는 교사번호, 이름, 담당 과목이 있다.  ==>공통 Person - name
//public interface SchoolService {
//	
//	/** 입력값은 Person 계열이다. 
//	 * 업무 내용 : 추가*/
//	public void addPerson(Person p);
//	
//	/** 등록된 모든 Person 계열 정보를 확인 */
//	public Collection<Person> getPersons();
//	
//	/**Person 중에서 학생 정보만 확인*/
//	public Collection<Student> getStudents();
//	
//	/** 특정 학번의 학생의 이름 확인*/
//	public String getStudentName(String studentNumber);
//	
//	/** 특정 학생의 이름을 수정*/
//	public boolean setStudentName(String studentNumber, String updateName);
//
//}

