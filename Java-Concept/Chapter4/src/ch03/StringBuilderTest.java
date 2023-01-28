package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		buffer.append(android);  // java에 android를 연결
		
		String test = buffer.toString();
		System.out.println(test);
	}

}
