package ch02;

public class EqualsTest {

	public static void main(String[] args) {

		// 같은 학생 2명 만들기
		Student stu1 = new Student(20200001, "Lee");
		Student stu2 = new Student(20200001, "Lee");
		
		System.out.println(stu1 == stu2); // 주소는 다르지만
		System.out.println(stu1.equals(stu2)); // 논리적으로 같음 ==> true
		
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		
		System.out.println("-------------------------------------------------------------"); 
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println("-------------------------------------------------------------"); 
		
		Integer i = 100; // new 사용 X
		System.out.println(i.hashCode()); // 주소값은 정수 그대로
	}

}
