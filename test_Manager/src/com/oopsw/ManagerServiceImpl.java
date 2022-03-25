package com.oopsw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ManagerServiceImpl implements ManagerService {

	private Collection<Employee> employees; // N명이 공유하는 메모리, 접근 제한해야 함.
	
	/** (단, 사번은 중복 저장하지 않음)*/
	/** 생성자는 1줄에 1번만 다른 생성자를 호출 - 매개인자 많은 것부터 구현함 */
	public ManagerServiceImpl() {
//		this.employees = new ArrayList();
//		employees = new HashSet<Employee>();
		this(new ArrayList());
	}
	public ManagerServiceImpl(Collection<Employee> employees) {
		this.employees = employees;
	}
	
	
	/**1. 일반 사원 외 개발자 사원의 정보를 각각 2명 이상 입력(총 4명 이상)*/
	@Override
	public void addEmployee(Employee e) {
		if(!(isEmployeeId(e.getEmployeeId()))) {
			System.out.println("false");
			employees.add(e);
			System.out.println("사원 정보 추가에 성공했습니다.");
		}else {
			System.out.println("true");
			System.out.println("사번을 확인하세요");
		}
	}

	/**2. 사번 중복 여부 확인*/
	@Override
	public boolean isEmployeeId(String employeeId) {
		System.out.println(employeeId+"는 중복 사번입니까?");
		return getEmployee(employeeId)!=null;
//		for (Employee employee : employees) {
//			if(employee.getEmployeeId().equals(employeeId)) {
//				return true;
//			}
//		}
//		return false;
	}

	/**3. 입력된 모든 사원의 목록을 확인*/
	@Override
	public Collection<Employee> getEmployees() {
		return employees;
	}

	/**4. 입력된 사원중 개발자의 목록만 확인*/
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

	/** 개발을 하다보면 주어진 업무는 아닌데 구현부에 코드를 재사용  - private */
	private Employee getEmployee(String employeeId) {
		Employee emp=null;
		for (Employee employee : employees) {
			if(employee.getEmployeeId().equals(employeeId)) {
				return employee;
			}
		}
		return null;
	}
	
	/**5. 특정 사원의 급여(salary)를 확인*/
	@Override
	public int getEmployeeSalary(String employeeId) {
		System.out.println(employeeId + "사원의 급여");
		
		Employee e=getEmployee(employeeId);
		if(e !=null) {
			return e.getSalary();
		}
		
//		for (Employee employee : employees) {
//			if(employee.getEmployeeId().equals(employeeId)) {
//				return employee.getSalary();
//			}
//		}
		System.out.println("(사번을 확인하세요.)");
		return 0;
	}

	/**6. 특정 사원의 부서명(departmentName)을 수정*/
	@Override
	public boolean setDepartmentName(String employeeId, String updateDepName) {
		System.out.println("부서명 수정에 성공했습니까? "+updateDepName);

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
		
		System.out.println("(사번을 확인하세요.)");
		return false;
	}

	/**7. 특정 사원의 담당SW이름(swName) 수정*/
	@Override
	public boolean setSwName(String employeeId, String updateSwName) {
		System.out.println("담당SW이름 수정에 성공했습니까? " + updateSwName);
		for (Employee employee : employees) {
			if(employee instanceof Programmer) { // 수정할 사원 종류부터 구분 
				if(employee.getEmployeeId().equals(employeeId)) {
					((Programmer) employee).setSoftwareName(updateSwName);
					return true;
				}
			}
		}
		System.out.println("(사번을 확인하세요.)");
		return false;
	}

	/**8. 같은 이름을 가진 사원의 사번 목록 확인 */
	/** 테스트는 흔적을 남기는 것이 매우 중요함 */
	@Override
	public ArrayList<String> getEmployeeIds(String name) {
		Collection<String> employeeIds = new ArrayList<String>(); 
		System.out.println(name+"님과 같은 이름을 가진 사원의 사번 목록"+"("+name+"님 포함)");
		for (Employee employee : employees) {
			if(employee.getName().equals(name)) {
				employeeIds.add(employee.getEmployeeId());
			}
		}
		if(employeeIds.isEmpty()) {
			System.out.println("이름을 확인하세요.");
		}
		return (ArrayList<String>) employeeIds;
	}

	/**9. 회사에서 지급하는 사원의 총 급여 확인*/
	/* @throws RuntimeException - 사원이 없을 때 */
	@Override
	public int getEmployeeTotalSalary() {
		if(employees.size()==0) { // 예외를 활용하면 중복 코드를 제거할 수 있음
			throw new RuntimeException("사원이 없습니다.");
//			return -1; // 예외 문법을 모를때 사용
		}
		
		int totalSalary = 0;
		for (Employee employee : employees) {
			totalSalary += employee.getSalary();
		}
		return totalSalary;
	}

	/**10. 회사에서 지급하는 사원의 평균 급여 확인 */
	/** 단, 0명인 경우, -1 또는 예외 상황 Exception 발생 */
	@Override
	public float getEmployeeTotalAvgSalary() {
		if(employees.size()==0) {
//			throw new RuntimeException("사원이 없습니다."); // 유지보수 원칙에 따라, 10번은 원본 코드를 그대로 두고 별도의 클래스를 만듦.
			return -1;
		}
		return (float)getEmployeeTotalSalary()/getEmployees().size();
	}
}
