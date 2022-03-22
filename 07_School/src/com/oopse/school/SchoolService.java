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
	public Collection<Integer> getAllStudentScoreList(Collection<Person> persons);
	
	/** ��� �л� ���� �հ�*/
	public int getAllStudentScoreSum(Collection<Person> persons);
	
	/** ��� �л� ���� ��� */
	public float getAllStudentScoreAvg(Collection<Person> persons);
	
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

