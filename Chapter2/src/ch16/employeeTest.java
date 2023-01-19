package ch16;

public class employeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신"); // 인스턴스 1
		
//		System.out.println(employeeLee.serialNum);
//		System.out.println(Employee.serialNum); // 클래스 이름으로도 참조해서 씀
		System.out.println(Employee.getSerialNum());  // private 메서드일시 
		
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신"); // 인스턴스 2
		
//		System.out.println(employeeLee.serialNum);
//		System.out.println(employeeKim.serialNum);
//		// 두개의 인스턴스 시리얼 값(static) 증가  ==> static는 여러 인스턴스를 공유하여 같은 값을 생성
		
	    System.out.println(employeeLee.getEmployeeId());
	    System.out.println(employeeKim.getEmployeeId()); // 각자 증가된 사번을 가짐
	
		
	}

}
