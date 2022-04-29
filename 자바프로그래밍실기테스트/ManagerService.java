package com.oopsw;

import java.util.ArrayList;
import java.util.Collection;

public interface ManagerService {
	
	/** 사원 입력 */
	void addEmployee(Employee e);
	/** 사번 중복 확인 */
	boolean isEmployeeId(String employeeId);
	
	/** 모든 사원 확인 */
	Collection<Employee> getEmployees();
	
	/** 모든 개발자 확인 */
	Collection<Programmer> getProgrammers();
	
	/** 특정 사원 급여 확인 */
	int getEmployeeSalary(String employeeId);
	
	/** 특정 사원 부서명 수정 */
	boolean setDepartmentName(String employeeId, String updateDepName);
	
	/** 특정 사원 담당 SW 이름 수정 */
	boolean setSwName(String employeeId, String updateSwName);
	
	/** 특정 이름을 가진 사원(들) 출력 */
	ArrayList<String> getEmployeeIds(String name);
	
	/** 총 급여 확인 */
	int getEmployeeTotalSalary();
	
	/** 평균 급여 확인 */
	float getEmployeeTotalAvgSalary();
}

