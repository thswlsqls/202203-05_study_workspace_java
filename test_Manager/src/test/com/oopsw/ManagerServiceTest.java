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
		ManagerService ms = new ManagerServiceImpl(new HashSet()); // 요구사항 나중에 수정, 메모리 형태 가변 수정 가능함
		
		/**1. 일반 사원 외 개발자 사원의 정보를 각각 2명 이상 입력(총 4명 이상)*/
		System.out.println("1. 일반 사원 외 개발자 사원의 정보를 각각 2명 이상 입력(총 4명 이상)");
		ms.addEmployee(new Employee("e0001", "김사원", "영업부", 3000));
		ms.addEmployee(new Employee("e0002", "박사원", "영업부", 3000));
		ms.addEmployee(new Programmer("e0003", "김사원", "개발부", 3000, "회계관리시스템"));
		ms.addEmployee(new Programmer("e0004", "박사원", "개발부", 3000, "근태관리시스템"));
		/** 중복값 불허함 - HashSet메모리 사용하고 DTO에 equals(), hashCode()를 구현함 */
		ms.addEmployee(new Programmer("e0004", "박사원", "개발부", 3000, "근태관리시스템"));

		
		/**2. 사번 중복 여부 확인*/
		System.out.println("\n2. 사번 중복 여부 확인");
		System.out.println(ms.isEmployeeId("e0001"));
		System.out.println(ms.isEmployeeId("e0005"));
		
		/**3. 입력된 모든 사원의 목록을 확인*/
		System.out.println("\n3. 입력된 모든 사원의 목록을 확인");
		for (Employee employee : ms.getEmployees()) {
			if(employee instanceof Programmer) {
				System.out.println(((Programmer)employee).toString());
			}else {
				System.out.println(employee.toString());
			}
		}
		
		/**4. 입력된 사원중 개발자의 목록만 확인*/
		System.out.println("\n4. 입력된 사원중 개발자의 목록만 확인");
		for (Programmer programmer : ms.getProgrammers()) {
			System.out.println(programmer.toString());
		}
		
		/**5. 특정 사원의 급여(salary)를 확인*/
		System.out.println("\n5. 특정 사원의 급여(salary)를 확인");
		System.out.println(ms.getEmployeeSalary("e0001"));
		System.out.println(ms.getEmployeeSalary("e0005"));
		
		/**6. 특정 사원의 부서명(departmentName)을 수정*/
		System.out.println("\n6. 특정 사원의 부서명(departmentName)을 수정");
		System.out.println(ms.setDepartmentName("e0001", "기획부"));
		System.out.println(ms.setDepartmentName("e0005", "기획부"));
		
		/**7. 특정 사원의 담당SW이름(swName) 수정*/
		System.out.println("\n7. 특정 사원의 담당SW이름(swName) 수정");
		System.out.println(ms.setSwName("e0003", "영업관리시스템"));
		System.out.println(ms.setSwName("e0001", "영업관리시스템"));

		/**8. 같은 이름을 가진 사원의 사번 목록 확인 */
		System.out.println("\n8. 같은 이름을 가진 사원의 사번 목록 확인 ");
		for(String employeeId : ms.getEmployeeIds("김사원")) {
			System.out.println(employeeId);
		}
		for(String employeeId : ms.getEmployeeIds("한사원")) {
			System.out.println(employeeId);
		}

		/**9. 회사에서 지급하는 사원의 총 급여 확인*/
		System.out.println("\n9. 회사에서 지급하는 사원의 총 급여 확인");
		System.out.println("회사에서 지급하는 사원의 총 급여: "+ms.getEmployeeTotalSalary());
		
		/**10. 회사에서 지급하는 사원의 평균 급여 확인 */
		System.out.println("\n10. 회사에서 지급하는 사원의 평균 급여 확인");
		System.out.println("회사에서 지급하는 사원의 평균 급여: "+ms.getEmployeeTotalAvgSalary());
		
		/** 수정된 부서명과 담당SW이름 확인 */
		System.out.println("\n수정된 부서명과 담당SW이름 확인");
		for (Employee employee : ms.getEmployees()) {
			if(employee instanceof Programmer) {
				System.out.println(((Programmer)employee).toString());
			}else {
				System.out.println(employee.toString());
			}
		}
		
	}

}
