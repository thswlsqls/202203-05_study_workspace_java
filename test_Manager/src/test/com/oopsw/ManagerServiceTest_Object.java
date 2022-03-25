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
		ms = new ManagerServiceImpl_10_Object(new ManagerServiceImpl(new HashSet())); // 요구사항 나중에 수정, 메모리 형태 가변 수정 가능함
		
		/**9. 회사에서 지급하는 사원의 총 급여 확인*/
		System.out.println("\n9. 회사에서 지급하는 사원의 총 급여 확인");
		try {
			System.out.println("회사에서 지급하는 사원의 총 급여: "+ms.getEmployeeTotalSalary());
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		/**10. 회사에서 지급하는 사원의 평균 급여 확인 */
		System.out.println("\n10. 회사에서 지급하는 사원의 평균 급여 확인");
		try {
			System.out.println("회사에서 지급하는 사원의 평균 급여: "+ms.getEmployeeTotalAvgSalary());
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
