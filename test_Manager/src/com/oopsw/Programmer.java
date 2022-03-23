package com.oopsw;

public class Programmer extends Employee {

	private String softwareName;

	public Programmer(String employeeNumber, String name, String departmentName, int salary, String softwareName) {
		super(employeeNumber, name, departmentName, salary);
		setSoftwareName(softwareName);
	}
	
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	@Override
	public String toString() {
		return super.toString()+" ," + "담당SW이름=" + softwareName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((softwareName == null) ? 0 : softwareName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Programmer other = (Programmer) obj;
		if (softwareName == null) {
			if (other.softwareName != null)
				return false;
		} else if (!softwareName.equals(other.softwareName))
			return false;
		return true;
	}
	
}
