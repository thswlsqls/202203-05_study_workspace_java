package com.oopsw.school;

public class SchoolServiceImpl implements SchoolService {

	private Person[] list;
	private int listIndex; // 0
	
	public SchoolServiceImpl() {
		list = new Person[4];
	}
	
	@Override
	public void addPerson(Person p) {
		list[listIndex++] = p;
	}

	@Override
	public void printAll() {
		for(Person person : list) {
			System.out.println(person);
		}
	}

	@Override
	public void setPhoneNumber(Student update) {
		for (Person person : list) {
			if(person instanceof Student) {
				Student tmp = (Student)person;
				if(tmp.getStudentNumber().equals(update.getStudentNumber())) {
					tmp.setPhone(update.getPhone()); // 수정
				}
			} // if
		} // for
	}

	@Override
	public void setPhoneNumber(Teacher update) {
		for (Person person : list) {
			if(person instanceof Teacher) {
				Teacher tmp = (Teacher)person;
				if(tmp.getTeacherNumber().equals(update.getTeacherNumber())) {
					tmp.setPhone(update.getPhone()); // 수정
				}
			} // if
		} // for
	}

	@Override
	public String[] getTeacherNames() {
		listIndex = 0;
		for (Person person : list) {
			if(person instanceof Teacher) {
					listIndex++;
			} // if
		} // for
	
		int namesIndex=0;
		String[] names = new String[listIndex];
		for(Person person : list) {
			if(person instanceof Teacher) {
				names[namesIndex++] = person.getName();
			}
		}	
		return names;
	}

	@Override
	public String getSubject(String teacherNumber) {
		for (Person person : list) {
			if(person instanceof Teacher) {
				Teacher tmp = (Teacher)person;
				if(tmp.getTeacherNumber().equals(teacherNumber)) {
					return tmp.getSubjectName();
				}
			} // if
		} // for
		return null;
	}

}
