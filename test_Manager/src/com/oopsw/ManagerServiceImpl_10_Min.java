package com.oopsw;

import java.util.Collection;

public class ManagerServiceImpl_10_Min extends ManagerServiceImpl{
	
	public ManagerServiceImpl_10_Min(Collection<Employee> employees) {
		super(employees);
	}
	
	/**10. ȸ�翡�� �����ϴ� ����� ��� �޿� Ȯ�� */
	/** ��, 0���� ���, -1 �Ǵ� ���� ��Ȳ Exception �߻� */
	@Override
	public float getEmployeeTotalAvgSalary() {
		float flag = super.getEmployeeTotalAvgSalary();
		if(flag==-1) {
			throw new RuntimeException("��������� ����.");
		}
		return flag;
	}
	
}
