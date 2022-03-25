package com.oopsw;

import java.util.Collection;

public class ManagerServiceImpl_10_Min extends ManagerServiceImpl{
	
	public ManagerServiceImpl_10_Min(Collection<Employee> employees) {
		super(employees);
	}
	
	/**10. 회사에서 지급하는 사원의 평균 급여 확인 */
	/** 단, 0명인 경우, -1 또는 예외 상황 Exception 발생 */
	@Override
	public float getEmployeeTotalAvgSalary() {
		float flag = super.getEmployeeTotalAvgSalary();
		if(flag==-1) {
			throw new RuntimeException("사원정보가 없음.");
		}
		return flag;
	}
	
}
