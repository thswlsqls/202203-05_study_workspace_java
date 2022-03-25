package test.com.oopsw;

import java.util.HashSet;

import com.oopsw.Employee;
import com.oopsw.ManagerService;
import com.oopsw.ManagerServiceImpl;
import com.oopsw.ManagerServiceImpl_10_Min;
import com.oopsw.ManagerServiceImpl_10_Object;
import com.oopsw.Programmer;

public class ManagerServiceTest_Object {

	public static void main(String[] args) { 
		
		ManagerService ms; 
		ms = new ManagerServiceImpl_10_Object(new ManagerServiceImpl(new HashSet())); // �䱸���� ���߿� ����, �޸� ���� ���� ���� ������
		
		/**9. ȸ�翡�� �����ϴ� ����� �� �޿� Ȯ��*/
		System.out.println("\n9. ȸ�翡�� �����ϴ� ����� �� �޿� Ȯ��");
		try {
			System.out.println("ȸ�翡�� �����ϴ� ����� �� �޿�: "+ms.getEmployeeTotalSalary());
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		/**10. ȸ�翡�� �����ϴ� ����� ��� �޿� Ȯ�� */
		System.out.println("\n10. ȸ�翡�� �����ϴ� ����� ��� �޿� Ȯ��");
		try {
			System.out.println("ȸ�翡�� �����ϴ� ����� ��� �޿�: "+ms.getEmployeeTotalAvgSalary());
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
