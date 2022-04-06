package com.school;

// ���, �̸�, �޿�, �μ���ȣ, �μ��� ��
public class EmployeeVO {
	private int employeeId;
	private String name;
	private float salary;
	private int departmentId;	
	private String departmentName;
	
	// ������ - �������� �������� ����� ��ü, �����ڸ� ���� �Է°��� ����
	// overloading = �̸� ���� �Է°��� �ٸ� ��, ������ ����
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
