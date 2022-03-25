package test.com.oopsw.team2;

import java.util.ArrayList;

import com.oopsw.team2.PersonService;
import com.oopsw.team2.PersonServiceImpl;
import com.oopsw.team2.PersonServiceImpl_refactor_1;
import com.oopsw.team2.Person_refactor_1;

public class Person_refactor_1Test {
	
	public static void main(String[] args) {
		
		PersonService ps;
		ps = new PersonServiceImpl_refactor_1(new PersonServiceImpl(new ArrayList()));
	
		try {
			ps.addPerson(new Person_refactor_1("颊后后", "茄惫"));
			ps.addPerson(new Person_refactor_1("颊后后", "茄惫"));
			ps.addPerson(new Person_refactor_1("颊后后", "茄惫"));
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

		try {
			for (Object person : ps.getPersons()) {
				System.out.println(person);
			}
		}catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
	}

}
