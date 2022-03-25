package com.oopsw.team2;

import java.util.ArrayList;
import java.util.Collection;

public class PersonServiceImpl implements PersonService{

	private Collection<Object> persons;
	
	public PersonServiceImpl(Collection<Object> persons) {
		this.persons = persons;
	}

	@Override
	public void addPerson(Object p) {
		persons.add(p);
	}

	@Override
	public Collection<Object> getPersons() {
		return persons;
	}

	
}
