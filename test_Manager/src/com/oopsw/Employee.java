package com.oopsw;

public class Employee {

	private String employeeId;
	private String name;
	private String departmentName;
	private int salary;
	
	public Employee() {
		super();
	}
	public Employee(String employeeId, String name, String departmentName, int salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		setDepartmentName(departmentName);
		this.salary = salary;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "사번=" + employeeId + ", 이름=" + name + ", 부서명=" + departmentName
				+ ", 급여=" + salary;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
	
}

/**
 * 
 * package com.oopsw;

public class Employee {
	private String employeeId;
	private String name;
	private String departmentName;
	private int salary;
	
	public Employee(String employeeId, String name, String departmentName, int salary) {
		setEmployeeId(employeeId);
		setName(name);
		setDepartmentName(departmentName);
		setSalary(salary);
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {	
		return "사번 : " + employeeId + " 이름 : " + name + " 부서 : " + departmentName + " 급여 : " + salary;
	}
	
	
	
}

 * */
