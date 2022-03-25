package com.oopsw.team2;

import java.util.Collection;

public class PersonServiceImpl_refactor_1 implements PersonService {

	private Collection<Object> persons;
	private PersonService ps;
	
	public PersonServiceImpl_refactor_1(Collection<Object> persons) {
		this.persons = persons;
	}
	
	public PersonServiceImpl_refactor_1(PersonService ps) {
		this.ps = ps;
	}
	
	@Override
	public void addPerson(Object p) {
		ps.addPerson(p);
	}

	@Override
	public Collection<Object> getPersons() {
		return persons;
	}

}