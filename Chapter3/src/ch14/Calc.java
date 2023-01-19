package ch14;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//default Method
	default void description() {
		System.out.println("integer's the four fundamental arithmetic operations");
		myMethod();
	}
	
	// 정적 메서드
	static int total(int[] arr) {
		
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	
	// private method
	private void myMethod() {
		System.out.println("myMethod");
	}

	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}
