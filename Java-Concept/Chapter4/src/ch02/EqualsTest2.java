package ch02;

public class EqualsTest2 {

	public static void main(String[] args) throws CloneNotSupportedException {

		// 같은 학생 2명 만들기
		Student stu1 = new Student(20200001, "Lee");
		Student stu2 = new Student(20200001, "Lee");
		
		System.out.println(stu1 == stu2); // 주소는 다르지만
		System.out.println(stu1.equals(stu2)); // 논리적으로 같음 ==> true
		
		// 재정의한 hashCode()
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		
		// 실제 갖는 가상 메모리 주소
		System.out.println(System.identityHashCode(stu1));
		System.out.println(System.identityHashCode(stu2));
		
	
		//clone()	
		stu1.setStudentName("Kim"); 
		Student copyStudent = (Student)stu1.clone();
		System.out.println(copyStudent.toString());
	}

}
