package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();  // Student 클래스에서 여러가지 instance가 생성될 수 있음(홍길동, 김철수...)
		
		studentLee.studentId = 12345; 
		studentLee.address = "LA"; // studentId, address = 멤버변수
		studentLee.setStudentName("Lee"); // method
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentId = 54321;
		studentKim.address = "newyork";
		studentKim.setStudentName("Kim");
		
		studentKim.showStudentInfo();		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
