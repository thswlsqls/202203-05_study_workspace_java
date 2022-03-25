package com.oopsw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ManagerServiceImpl implements ManagerService {

	private Collection<Employee> employees; // N���� �����ϴ� �޸�, ���� �����ؾ� ��.
	
	/** (��, ����� �ߺ� �������� ����)*/
	/** �����ڴ� 1�ٿ� 1���� �ٸ� �����ڸ� ȣ�� - �Ű����� ���� �ͺ��� ������ */
	public ManagerServiceImpl() {
//		this.employees = new ArrayList();
//		employees = new HashSet<Employee>();
		this(new ArrayList());
	}
	public ManagerServiceImpl(Collection<Employee> employees) {
		this.employees = employees;
	}
	
	
	/**1. �Ϲ� ��� �� ������ ����� ������ ���� 2�� �̻� �Է�(�� 4�� �̻�)*/
	@Override
	public void addEmployee(Employee e) {
		if(!(isEmployeeId(e.getEmployeeId()))) {
			System.out.println("false");
			employees.add(e);
			System.out.println("��� ���� �߰��� �����߽��ϴ�.");
		}else {
			System.out.println("true");
			System.out.println("����� Ȯ���ϼ���");
		}
	}

	/**2. ��� �ߺ� ���� Ȯ��*/
	@Override
	public boolean isEmployeeId(String employeeId) {
		System.out.println(employeeId+"�� �ߺ� ����Դϱ�?");
		return getEmployee(employeeId)!=null;
//		for (Employee employee : employees) {
//			if(employee.getEmployeeId().equals(employeeId)) {
//				return true;
//			}
//		}
//		return false;
	}

	/**3. �Էµ� ��� ����� ����� Ȯ��*/
	@Override
	public Collection<Employee> getEmployees() {
		return employees;
	}

	/**4. �Էµ� ����� �������� ��ϸ� Ȯ��*/
	@Override
	public Collection<Programmer> getProgrammers() {
		Collection<Programmer> programmers = new ArrayList();
		for (Employee employee : employees) {
			if(employee instanceof Programmer) {
				programmers.add((Programmer)employee);
			}
		}
		return programmers;
	}

	/** ������ �ϴٺ��� �־��� ������ �ƴѵ� �����ο� �ڵ带 ����  - private */
	private Employee getEmployee(String employeeId) {
		Employee emp=null;
		for (Employee employee : employees) {
			if(employee.getEmployeeId().equals(employeeId)) {
				return employee;
			}
		}
		return null;
	}
	
	/**5. Ư�� ����� �޿�(salary)�� Ȯ��*/
	@Override
	public int getEmployeeSalary(String employeeId) {
		System.out.println(employeeId + "����� �޿�");
		
		Employee e=getEmployee(employeeId);
		if(e !=null) {
			return e.getSalary();
		}
		
//		for (Employee employee : employees) {
//			if(employee.getEmployeeId().equals(employeeId)) {
//				return employee.getSalary();
//			}
//		}
		System.out.println("(����� Ȯ���ϼ���.)");
		return 0;
	}

	/**6. Ư�� ����� �μ���(departmentName)�� ����*/
	@Override
	public boolean setDepartmentName(String employeeId, String updateDepName) {
		System.out.println("�μ��� ������ �����߽��ϱ�? "+updateDepName);

		Employee e=getEmployee(employeeId);
		if(e !=null) {
			e.setDepartmentName(updateDepName);
			return true;
		}
		
//		for (Employee employee : employees) {
//			if(employee.getEmployeeId().equals(employeeId)) {
//				employee.setDepartmentName(updateDepName);
//
//				return true;
//			}
//		}
		
		System.out.println("(����� Ȯ���ϼ���.)");
		return false;
	}

	/**7. Ư�� ����� ���SW�̸�(swName) ����*/
	@Override
	public boolean setSwName(String employeeId, String updateSwName) {
		System.out.println("���SW�̸� ������ �����߽��ϱ�? " + updateSwName);
		for (Employee employee : employees) {
			if(employee instanceof Programmer) { // ������ ��� �������� ���� 
				if(employee.getEmployeeId().equals(employeeId)) {
					((Programmer) employee).setSoftwareName(updateSwName);
					return true;
				}
			}
		}
		System.out.println("(����� Ȯ���ϼ���.)");
		return false;
	}

	/**8. ���� �̸��� ���� ����� ��� ��� Ȯ�� */
	/** �׽�Ʈ�� ������ ����� ���� �ſ� �߿��� */
	@Override
	public ArrayList<String> getEmployeeIds(String name) {
		Collection<String> employeeIds = new ArrayList<String>(); 
		System.out.println(name+"�԰� ���� �̸��� ���� ����� ��� ���"+"("+name+"�� ����)");
		for (Employee employee : employees) {
			if(employee.getName().equals(name)) {
				employeeIds.add(employee.getEmployeeId());
			}
		}
		if(employeeIds.isEmpty()) {
			System.out.println("�̸��� Ȯ���ϼ���.");
		}
		return (ArrayList<String>) employeeIds;
	}

	/**9. ȸ�翡�� �����ϴ� ����� �� �޿� Ȯ��*/
	/* @throws RuntimeException - ����� ���� �� */
	@Override
	public int getEmployeeTotalSalary() {
		if(employees.size()==0) { // ���ܸ� Ȱ���ϸ� �ߺ� �ڵ带 ������ �� ����
			throw new RuntimeException("����� �����ϴ�.");
//			return -1; // ���� ������ �𸦶� ���
		}
		
		int totalSalary = 0;
		for (Employee employee : employees) {
			totalSalary += employee.getSalary();
		}
		return totalSalary;
	}

	/**10. ȸ�翡�� �����ϴ� ����� ��� �޿� Ȯ�� */
	/** ��, 0���� ���, -1 �Ǵ� ���� ��Ȳ Exception �߻� */
	@Override
	public float getEmployeeTotalAvgSalary() {
		if(employees.size()==0) {
//			throw new RuntimeException("����� �����ϴ�."); // �������� ��Ģ�� ����, 10���� ���� �ڵ带 �״�� �ΰ� ������ Ŭ������ ����.
			return -1;
		}
		return (float)getEmployeeTotalSalary()/getEmployees().size();
	}
}
