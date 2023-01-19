package ch16;

public class Employee {

	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() { // 생성자 => 객체를 초기화과정을 거침
		
		serialNum++;
		employeeId = serialNum;
	}
	
	public static int getSerialNum() { // static 메서드
		
		int i = 0; //함수 내부의 지역변수
		
		// employeeName = "Lee"; // 인스턴스 변수 사용 x (ex> employeeId, department...)
		return serialNum; // 스태틱 변수
	}


	// private이기 때문에 get, set 생성
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
