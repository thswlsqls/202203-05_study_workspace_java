package com.school;

// 사번, 이름, 급여, 부서번호, 부서명 등
public class EmployeeVO {
	private int employeeId;
	private String name;
	private float salary;
	private int departmentId;	
	private String departmentName;
	
	// 생성자 - 업무별로 공통으로 사용할 객체, 생성자를 통해 입력값을 구분
	// overloading = 이름 같고 입력값이 다른 것, 보통은 재사용
	public EmployeeVO() {
		super();
	}

	public EmployeeVO(int employeeId, String name, float salary) {
//		super();
		this(employeeId, name, salary, 0);
	}

	public EmployeeVO(int employeeId, String name, float salary, int departmentId) {
//		super();
		this(employeeId, name, salary, departmentId, null);
	}

	public EmployeeVO(int employeeId, String name, float salary, int departmentId, String departmentName) {
//		super();
		setEmployeeId(employeeId);
		setName(name);
		setSalary(salary);
		setDepartmentId(departmentId);
		setDepartmentName(departmentName); 
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "EmployeeVO [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", departmentId="
				+ departmentId + ", departmentName=" + departmentName + "]\n";
	}
	
	
	
}
