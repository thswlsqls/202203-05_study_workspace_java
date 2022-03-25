package test.com.oopsw.team2;

import java.util.ArrayList;

import com.oopsw.team2.Person;
import com.oopsw.team2.PersonService;
import com.oopsw.team2.PersonServiceImpl;

public class PersonTest {

	public static void main(String[] args) {
		
		PersonService p;
		p=new PersonServiceImpl(new ArrayList());
	
		p.addPerson(new Person("º’¿∫∫Û"));
	
		for (Object person : p.getPersons()) {
			System.out.println(person);
		}
	}
	
}
