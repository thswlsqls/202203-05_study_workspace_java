package test.com.oopsw.team2;

import java.util.ArrayList;

import com.oopsw.team2.NameLengthException;
import com.oopsw.team2.Person;
import com.oopsw.team2.PersonService;
import com.oopsw.team2.PersonServiceImpl;
import com.oopsw.team2.PersonServiceImpl_refactor_1;
import com.oopsw.team2.Person_refactor_1;

public class Person_refactor_1Test {
	public static void main(String[] args) {
		
		PersonService ps;
		ps = new PersonServiceImpl_refactor_1(new PersonServiceImpl(new ArrayList()));
	
		try {
			ps.addPerson(new Person_refactor_1("김사람", "한국"));
			ps.addPerson(new Person_refactor_1("박사람", "미국"));
			ps.addPerson(new Person_refactor_1("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesett", "한국"));
		}catch(NameLengthException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(RuntimeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		for (Object person : ps.getPersons()) {
			System.out.println(person);
		}

//		try {
//			for (Object person : ps.getPersons()) {
//				System.out.println(person);
//			}
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		
	}

}
