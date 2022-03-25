package com.oopsw;

import java.util.ArrayList;
import java.util.Collection;

public class ManagerServiceImpl_10_Object implements ManagerService {

	private ManagerService service;
	
	public ManagerServiceImpl_10_Object(ManagerService service) {
		this.service = service;
	}
	
	@Override
	public void addEmployee(Employee e) {
		service.addEmployee(e); // adaptee.firstTask() ...
	}

	@Override
	public boolean isEmployeeId(String employeeId) {
		return service.isEmployeeId(employeeId);
	}

	@Override
	public Collection<Employee> getEmployees() {
		return service.getEmployees();
	}

	@Override
	public Collection<Programmer> getProgrammers() {
		return service.getProgrammers();
	}

	@Override
	public int getEmployeeSalary(String employeeId) {
		return service.getEmployeeSalary(employeeId);
	}

	@Override
	public boolean setDepartmentName(String employeeId, String updateDepName) {
		return service.setDepartmentName(employeeId, updateDepName);
	}

	@Override
	public boolean setSwName(String employeeId, String updateSwName) {
		return service.setSwName(employeeId, updateSwName);
	}

	@Override
	public ArrayList<String> getEmployeeIds(String name) {
		return service.getEmployeeIds(name);
	}

	@Override
	public int getEmployeeTotalSalary() {
		return service.getEmployeeTotalSalary();
	}

	@Override
	public float getEmployeeTotalAvgSalary() {
		
		float flag=service.getEmployeeTotalAvgSalary();
		if(flag==-1) {
			throw new RuntimeException("사원정보가 없음..");
		}
		return flag;
		
	}
	
}
