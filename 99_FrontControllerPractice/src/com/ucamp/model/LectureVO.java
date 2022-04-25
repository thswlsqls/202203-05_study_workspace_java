package com.ucamp.model;

public class LectureVO {
//	lcode, lname, hours, room, capacity, persons
	private String lcode;
	private String lname;
	private int hours;
	private String room;
	private int capacity;
	private int persons;
	
	public LectureVO(String lcode, String lname, int hours, String room, int capacity, int persons) {
		this.lcode = lcode;
		this.lname = lname;
		this.hours = hours;
		this.room = room;
		this.capacity = capacity;
		this.persons = persons;
	}
	
	public String getLcode() {
		return lcode;
	}
	public String getLname() {
		return lname;
	}
	public int getHours() {
		return hours;
	}
	public String getRoom() {
		return room;
	}
	public int getCapacity() {
		return capacity;
	}
	public int getPersons() {
		return persons;
	}

	@Override
	public String toString() {
		return "LectureVO [lcode=" + lcode + ", lname=" + lname + ", hours=" + hours + ", room=" + room + ", capacity="
				+ capacity + ", persons=" + persons + "]\n";
	}
	
}
