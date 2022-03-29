package com.oopsw.team2;

import java.util.Collection;

public interface PersonService {
	
//	/* 이름 50자까지 허용 */
//	void addPerson(Object p);
//	
//	/* 국적 확인 */
//	Collection<Object> getPersons();
	
	/* 이름 50자까지 허용 */
	void addPerson(Person p);
	
	/* 국적 확인 */
	Collection<Person> getPersons();
	
}



