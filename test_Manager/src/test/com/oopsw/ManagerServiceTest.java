package test.com.oopsw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import com.oopsw.Employee;
import com.oopsw.ManagerService;
import com.oopsw.ManagerServiceImpl;
import com.oopsw.Programmer;

public class ManagerServiceTest {

	public static void main(String[] args) {
		
//		ManagerService ms = new ManagerServiceImpl();
		ManagerService ms = new ManagerServiceImpl(new HashSet()); // �䱸���� ���߿� ����, �޸� ���� ���� ���� ������
		
		/**1. �Ϲ� ��� �� ������ ����� ������ ���� 2�� �̻� �Է�(�� 4�� �̻�)*/
		System.out.println("1. �Ϲ� ��� �� ������ ����� ������ ���� 2�� �̻� �Է�(�� 4�� �̻�)");
		ms.addEmployee(new Employee("e0001", "����", "������", 3000));
		ms.addEmployee(new Employee("e0002", "�ڻ��", "������", 3000));
		ms.addEmployee(new Programmer("e0003", "����", "���ߺ�", 3000, "ȸ������ý���"));
		ms.addEmployee(new Programmer("e0004", "�ڻ��", "���ߺ�", 3000, "���°����ý���"));
		/** �ߺ��� ������ - HashSet�޸� ����ϰ� DTO�� equals(), hashCode()�� ������ */
		ms.addEmployee(new Programmer("e0004", "�ڻ��", "���ߺ�", 3000, "���°����ý���"));

		
		/**2. ��� �ߺ� ���� Ȯ��*/
		System.out.println("\n2. ��� �ߺ� ���� Ȯ��");
		System.out.println(ms.isEmployeeId("e0001"));
		System.out.println(ms.isEmployeeId("e0005"));
		
		/**3. �Էµ� ��� ����� ����� Ȯ��*/
		System.out.println("\n3. �Էµ� ��� ����� ����� Ȯ��");
		for (Employee employee : ms.getEmployees()) {
			if(employee instanceof Programmer) {
				System.out.println(((Programmer)employee).toString());
			}else {
				System.out.println(employee.toString());
			}
		}
		
		/**4. �Էµ� ����� �������� ��ϸ� Ȯ��*/
		System.out.println("\n4. �Էµ� ����� �������� ��ϸ� Ȯ��");
		for (Programmer programmer : ms.getProgrammers()) {
			System.out.println(programmer.toString());
		}
		
		/**5. Ư�� ����� �޿�(salary)�� Ȯ��*/
		System.out.println("\n5. Ư�� ����� �޿�(salary)�� Ȯ��");
		System.out.println(ms.getEmployeeSalary("e0001"));
		System.out.println(ms.getEmployeeSalary("e0005"));
		
		/**6. Ư�� ����� �μ���(departmentName)�� ����*/
		System.out.println("\n6. Ư�� ����� �μ���(departmentName)�� ����");
		System.out.println(ms.setDepartmentName("e0001", "��ȹ��"));
		System.out.println(ms.setDepartmentName("e0005", "��ȹ��"));
		
		/**7. Ư�� ����� ���SW�̸�(swName) ����*/
		System.out.println("\n7. Ư�� ����� ���SW�̸�(swName) ����");
		System.out.println(ms.setSwName("e0003", "���������ý���"));
		System.out.println(ms.setSwName("e0001", "���������ý���"));

		/**8. ���� �̸��� ���� ����� ��� ��� Ȯ�� */
		System.out.println("\n8. ���� �̸��� ���� ����� ��� ��� Ȯ�� ");
		for(String employeeId : ms.getEmployeeIds("����")) {
			System.out.println(employeeId);
		}
		for(String employeeId : ms.getEmployeeIds("�ѻ��")) {
			System.out.println(employeeId);
		}

		/**9. ȸ�翡�� �����ϴ� ����� �� �޿� Ȯ��*/
		System.out.println("\n9. ȸ�翡�� �����ϴ� ����� �� �޿� Ȯ��");
		System.out.println("ȸ�翡�� �����ϴ� ����� �� �޿�: "+ms.getEmployeeTotalSalary());
		
		/**10. ȸ�翡�� �����ϴ� ����� ��� �޿� Ȯ�� */
		System.out.println("\n10. ȸ�翡�� �����ϴ� ����� ��� �޿� Ȯ��");
		System.out.println("ȸ�翡�� �����ϴ� ����� ��� �޿�: "+ms.getEmployeeTotalAvgSalary());
		
		/** ������ �μ���� ���SW�̸� Ȯ�� */
		System.out.println("\n������ �μ���� ���SW�̸� Ȯ��");
		for (Employee employee : ms.getEmployees()) {
			if(employee instanceof Programmer) {
				System.out.println(((Programmer)employee).toString());
			}else {
				System.out.println(employee.toString());
			}
		}
		
	}

}
