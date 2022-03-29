package com.oopsw.team2;
import java.util.Collection;

public class PersonServiceImpl_refactor_1 implements PersonService {

//	private Collection<Person> persons;
	private PersonService ps;
	
//	public PersonServiceImpl_refactor_1(Collection<Person> persons) {
//		this.persons = persons;
//	}
	
	public PersonServiceImpl_refactor_1(PersonService ps) {
		this.ps = ps;
	}
	
	@Override
	public void addPerson(Person p) {
		ps.addPerson(p);
	}

	@Override
	public Collection<Person> getPersons() {
		return ps.getPersons();
	}

}
