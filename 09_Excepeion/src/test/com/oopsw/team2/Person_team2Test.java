//package test.com.oopsw.team2;
//
//import java.util.ArrayList;
//
//import com.oopsw.team2.NameLengthException;
//import com.oopsw.team2.Person;
//import com.oopsw.team2.PersonService;
//import com.oopsw.team2.PersonServiceImpl;
//import com.oopsw.team2.PersonServiceImpl_team2;
//import com.oopsw.team2.Person_team2;
//
//public class Person_team2Test {
//
//	public static void main(String[] args) {
//		
//		PersonService p;
//		p=new PersonServiceImpl_team2(new PersonServiceImpl(new ArrayList()));
//	
//		try {
//			p.addPerson(new Person_team2("김사람", "한국"));
//			p.addPerson(new Person_team2("박사람", "미국"));
//			p.addPerson(new Person_team2("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", "한국"));
//		} catch(NameLengthException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} catch(RuntimeException e) {
//			e.getMessage();
//			e.printStackTrace();
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//
//		try {
//			for (Object person : p.getPersons()) {
//				System.out.println(person);
//			}
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		
//	}
//	
//}
