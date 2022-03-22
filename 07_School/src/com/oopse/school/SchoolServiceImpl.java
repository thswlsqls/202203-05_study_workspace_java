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

