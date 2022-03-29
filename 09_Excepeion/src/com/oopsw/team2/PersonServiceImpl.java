package com.oopsw.team2;

import java.util.ArrayList;
import java.util.Collection;

public class PersonServiceImpl implements PersonService{

	private Collection<Person> persons;
	
	public PersonServiceImpl(Collection<Person> persons) {
		this.persons = persons;
	}

	@Override
	public void addPerson(Person p) {
		persons.add(p);
	}

	@Override
	public Collection<Person> getPersons() {
		return persons;
	}

}
