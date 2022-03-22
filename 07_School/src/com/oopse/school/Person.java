package com.oopse.school;

public class Person {

	private String name;
	public Person() {}
	public Person(String name) {
//		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "¿Ã∏ß=" + name;
	}

}


/**
 * package com.oopsw.school;
//B)
public class Person {
	private String name;
	public Person() {}
	public Person(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "name=" + name ;
	}
	
	
	
	
}

 * */
