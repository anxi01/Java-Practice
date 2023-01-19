package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();  // 기본 생성자 제공
		// default 생성자는 클래스에 생성자가 없을 경우에만 생성 
		// but, 생성자가 형성되었기 때문에 에러 발생 ==> default 생성자 만들기*overloading
		
		System.out.println(studentLee.showStudentInfo());  
		// 멤버변수는 자동으로 초기화됨
		
		Student studentKim = new Student(12345, "Kim", 1);
		
		System.out.println(studentKim.showStudentInfo());
	}

}
