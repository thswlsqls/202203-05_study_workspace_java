package com.oopsw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class StudentService {

	private Collection<Student> studnets;
	//a3) 
	private static StudentService s;
	
	//a1)생성자를 막고 (new) 1번만 메모리에 등록해서 쓰고싶다. 
	private StudentService() {
		studnets=new HashSet<Student>();
	}
	/* 이름을 여러개 등록이 가능 - 단 이름은 중복 저장하지 않는다. */
	public boolean add(Student student) {
		return studnets.add(student);
	}
	//a2)
	public static StudentService getInstance() {
		if(s==null) s=new StudentService(); // 메모리에 없으면 올리고, 있으면 리턴함
		
		return s;
	}
	/* 기존 이름에서 새로 입력할 이름과 같은지 여부를 확인 */
	// 데이터 클래스에서 equals, hashCode를 오버라이딩해서 구현함
	/* 등록된 모든 이름을 확인 */
	public Collection<Student> getStudents(){
		return studnets;
	}
	
}
