package com.oopse.school;

import java.util.*;

//C1) 메서드 구현하기 전에 공통으로 사용할 멤버 데이터를 추론
public class SchoolServiceImpl implements SchoolService {
	//C1-1) 
	private Collection<Person> persons; // 선언, 생성 
	//C1-2) 
	public SchoolServiceImpl() {
//		super();
//		this.list = list;
		persons=new ArrayList(); // 가장 많이 쓰는 클래스임
	}	
	//C1-4)
	@Override
	public void addPerson(Person p) {
		persons.add(p);
	}
	//C1-3)
	@Override
	public Collection<Person> getPersons() {
		return persons;
	}
	//C1-5)
	@Override
	public Collection<Student> getStudents() {
		// 임시 변수
		Collection<Student> tmp=new ArrayList<Student>();
		for(Person person : persons) {
			if(person instanceof Student) {
				tmp.add((Student)person);
			}
		}
		return tmp;
	}

	@Override
	public String getStudentName(String studentNumber) {
		for (Person person : persons) {
			if(person instanceof Student) {
				Student stu=(Student)person;
				if(stu.getStudentNumber().equals(studentNumber)) {
					return stu.getName();
				}
			}
		}
		return null;
	}

	@Override
	public boolean setStudentName(String studentNumber, String updateName) {
		for (Person person : persons) {
			if(person instanceof Student) {
				Student stu=(Student)person;
				if(stu.getStudentNumber().equals(studentNumber)) {
					stu.setName(updateName);
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public boolean isStudent(String studentNumber) {
		for (Person person : persons) {
			if(person instanceof Student) {
				Student std = (Student) person;
				if(std.getStudentNumber().equals(studentNumber)) {
					System.out.println(std.getStudentNumber()+"의 점수 목록: "+std.printScores());
					System.out.println(std.getStudentNumber()+"의 점수 합계: "+std.getSum());
					System.out.println(std.getStudentNumber()+"의 점수 평균: "+std.getAvg());
					return true;
				}else {
					System.out.println("존재하지 않는 학생입니다.");
					return false;
				}
			}
		}
		return false;
	}
	@Override
	public Collection<Integer> getAllStudentScoreList() {
		Collection<Integer> AllStudentScore = new ArrayList();
		for (Person person : persons) {
			if(person instanceof Student) {
				AllStudentScore.add(((Student) person).getScore());
			}
		}
		return AllStudentScore;
	}
	@Override
	public int getAllStudentScoreSum() {
		int sum = 0;
		for (Person person : persons) {
			if(person instanceof Student) {
				sum += ((Student) person).getScore();
			}
		}
		return sum;
	}
	
	@Override
	public float getAllStudentScoreAvg() {
		return (float)getAllStudentScoreSum()/getStudentCount();
	}
	
	private int getStudentCount() {
		int cnt = 0;
		for (Person person : persons) {
			if(person instanceof Student) {
				cnt += 1;
			}
		}
		return cnt;
	}

}


//package com.oopsw.school;
//
//import java.util.ArrayList;
//import java.util.Collection;
////C1) 메서드 구현하기 전에 공통으로 사용할 멤버 데이터를 추론
//public class SchoolServiceImpl implements SchoolService {
//	//C1-1)
//	private Collection<Person> persons;  //선언, 생성
//	//C1-2)
//	public SchoolServiceImpl() {
//		persons=new ArrayList();  //가장 많이 쓰는 클래스
//	}
//	//C1-4
//	@Override
//	public void addPerson(Person p) {
//		persons.add(p);
//	}
//	//C1-3)
//	@Override
//	public Collection<Person> getPersons() {		
//		return persons;
//	}
//
//	//C1-5)
//	@Override
//	public Collection<Student> getStudents() {
//		//임시 변수
//		Collection<Student> tmp=new ArrayList<Student>();
//		for (Person person : persons) {
//			if(person instanceof Student)
//				tmp.add((Student)person);
//		}
//		return tmp;
//	}
//
//	@Override
//	public String getStudentName(String studentNumber) {
//		for (Person person : persons) {
//			if(person instanceof Student) {
//				Student stu=(Student)person;
//				if(stu.getStudentNumber().equals(studentNumber))
//					return stu.getName();
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public boolean setStudentName(String studentNumber, String updateName) {
//		for (Person person : persons) {
//			if(person instanceof Student) {
//				Student stu=(Student)person;
//				if(stu.getStudentNumber().equals(studentNumber)) {
//					stu.setName(updateName);
//					return true;
//				}
//					
//			}
//		}
//		return false;
//	}
//
//}

