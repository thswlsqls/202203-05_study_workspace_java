package com.oopsw.team2;

import java.util.Collection;

public class PersonServiceImpl_team2 implements PersonService{

//	private Collection<Object> persons;
	private PersonService ps;
	
//	public PersonServiceImpl_team2(Collection<Object> persons) {
//		this.persons = persons;
//	}
	
	public PersonServiceImpl_team2(PersonService ps) {
		this.ps = ps;
	}

	@Override
	public void addPerson(Object p) {
		ps.addPerson(p);
	}

	@Override
	public Collection<Object> getPersons() {
		return ps.getPersons();
	}

}



