package com.oopse.school;
import java.util.*;

// interface - ���� �������� ������
// data�� �䱸������ ���� - �л��� �й�, �̸��� �ִ�. ����� �����ȣ, �̸�, �������� �ִ�. ==> ���� Person - name
public interface SchoolService {

	/**
	 * �Է°��� Person �迭�̴�.
	 * ���� ���� : �߰�
	 * */
	public void addPerson(Person p);
	
	/** ��ϵ� ��� Person �迭�� ������ Ȯ�� */
	public Collection<Person> getPersons();
	
	/** Person �߿��� �л� ������ Ȯ�� */
	public Collection<Student> getStudents();
	
	/** Ư�� �й��� �л��� �̸� Ȯ�� */
	public String getStudentName(String studentNumber);
	
	/** Ư�� �л��� �̸��� ����  */
	public boolean setStudentName(String studentNumber, String updateName);
	
	/** Ư�� �л� ���� Ȯ�� */
	boolean isStudent(String studentNumber); //����, ����, ��� ��� ����� Ȯ�� 
	
	/** ��� �л� ���� */
	public Collection<Integer> getAllStudentScoreList();
	
	/** ��� �л� ���� �հ�*/
	public int getAllStudentScoreSum();
	
	/** ��� �л� ���� ��� */
	public float getAllStudentScoreAvg();
	
}

//package com.oopsw.school;
//
//import java.util.Collection;
//
////A)interface - ���� �������� ����
////data�䱸���� ���� - �л��� �й�, �̸� �� �ִ�. ����� �����ȣ, �̸�, ��� ������ �ִ�.  ==>���� Person - name
//public interface SchoolService {
//	
//	/** �Է°��� Person �迭�̴�. 
//	 * ���� ���� : �߰�*/
//	public void addPerson(Person p);
//	
//	/** ��ϵ� ��� Person �迭 ������ Ȯ�� */
//	public Collection<Person> getPersons();
//	
//	/**Person �߿��� �л� ������ Ȯ��*/
//	public Collection<Student> getStudents();
//	
//	/** Ư�� �й��� �л��� �̸� Ȯ��*/
//	public String getStudentName(String studentNumber);
//	
//	/** Ư�� �л��� �̸��� ����*/
//	public boolean setStudentName(String studentNumber, String updateName);
//
//}

