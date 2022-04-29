package com.oopsw;

import java.util.ArrayList;
import java.util.Collection;

public interface ManagerService {
	
	/** ��� �Է� */
	void addEmployee(Employee e);
	/** ��� �ߺ� Ȯ�� */
	boolean isEmployeeId(String employeeId);
	
	/** ��� ��� Ȯ�� */
	Collection<Employee> getEmployees();
	
	/** ��� ������ Ȯ�� */
	Collection<Programmer> getProgrammers();
	
	/** Ư�� ��� �޿� Ȯ�� */
	int getEmployeeSalary(String employeeId);
	
	/** Ư�� ��� �μ��� ���� */
	boolean setDepartmentName(String employeeId, String updateDepName);
	
	/** Ư�� ��� ��� SW �̸� ���� */
	boolean setSwName(String employeeId, String updateSwName);
	
	/** Ư�� �̸��� ���� ���(��) ��� */
	ArrayList<String> getEmployeeIds(String name);
	
	/** �� �޿� Ȯ�� */
	int getEmployeeTotalSalary();
	
	/** ��� �޿� Ȯ�� */
	float getEmployeeTotalAvgSalary();
}

