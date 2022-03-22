package com.oopse.school;

import java.util.*;

//C1) �޼��� �����ϱ� ���� �������� ����� ��� �����͸� �߷�
public class SchoolServiceImpl implements SchoolService {
	//C1-1) 
	private Collection<Person> persons; // ����, ���� 
	//C1-2) 
	public SchoolServiceImpl() {
//		super();
//		this.list = list;
		persons=new ArrayList(); // ���� ���� ���� Ŭ������
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
		// �ӽ� ����
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
					System.out.println(std.getStudentNumber()+"�� ���� ���: "+std.printScores());
					System.out.println(std.getStudentNumber()+"�� ���� �հ�: "+std.getSum());
					System.out.println(std.getStudentNumber()+"�� ���� ���: "+std.getAvg());
					return true;
				}else {
					System.out.println("�������� �ʴ� �л��Դϴ�.");
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
////C1) �޼��� �����ϱ� ���� �������� ����� ��� �����͸� �߷�
//public class SchoolServiceImpl implements SchoolService {
//	//C1-1)
//	private Collection<Person> persons;  //����, ����
//	//C1-2)
//	public SchoolServiceImpl() {
//		persons=new ArrayList();  //���� ���� ���� Ŭ����
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
//		//�ӽ� ����
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

