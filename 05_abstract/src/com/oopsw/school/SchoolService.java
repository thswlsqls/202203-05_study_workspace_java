package com.oopsw.school;

import java.util.ArrayList;

// �߻����� ���� �߽��� �䱸���� - ���� ��Ģ ==> interface ����
public interface SchoolService {
	/** �л� �Ǵ� ���� ������ �Է� 
	 * �Է°� - �Ű����� - Person
	 * ��°� - ����Ÿ��(��) - boolean or void
	 * */
	void addPerson(Person p);
	
	/** �Էµ� ������ Ȯ�� - ����� */
	void printAll();
//	void printAll(ArrayList<Person> Persons);
	
	/** ���� �Ǵ� �л��� ��ȭ��ȣ�� ���� - �����ε� */
//	void setStudentPhoneNumber(String studentNumber, String phoneNumber);
//	void setTeacherPhoneNumber(String studentNumber, String phoneNumber);
	void setPhoneNumber(Student update);
	void setPhoneNumber(Teacher update);

	/** ������ �̸��� Ȯ�� */
	String[] getTeacherNames();
//	String[] getTeacherNames(ArrayList<Teacher> teachers);
	
	/** Ư�� ������ ������ Ȯ�� */
	String getSubject(String teacherNumber);
	
	
}
