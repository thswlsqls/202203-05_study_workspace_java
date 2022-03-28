package com.oopsw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class StudentService {

	private Collection<Student> studnets;
	//a3) 
	private static StudentService s;
	
	//a1)�����ڸ� ���� (new) 1���� �޸𸮿� ����ؼ� ����ʹ�. 
	private StudentService() {
		studnets=new HashSet<Student>();
	}
	/* �̸��� ������ ����� ���� - �� �̸��� �ߺ� �������� �ʴ´�. */
	public boolean add(Student student) {
		return studnets.add(student);
	}
	//a2)
	public static StudentService getInstance() {
		if(s==null) s=new StudentService(); // �޸𸮿� ������ �ø���, ������ ������
		
		return s;
	}
	/* ���� �̸����� ���� �Է��� �̸��� ������ ���θ� Ȯ�� */
	// ������ Ŭ�������� equals, hashCode�� �������̵��ؼ� ������
	/* ��ϵ� ��� �̸��� Ȯ�� */
	public Collection<Student> getStudents(){
		return studnets;
	}
	
}
