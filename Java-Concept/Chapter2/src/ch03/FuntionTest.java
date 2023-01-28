package ch03;

public class FuntionTest {

	public static int addNum(int num1, int num2) {  //매개변수와 return
		
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) { // return X
		
		System.out.println(greeting);
	}
	
	public static int calcSum() {  // 매개변수 X
		
		int sum = 0;
		int i;
		
		for(i=0;i<=100;i++) {
			
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {

		int n1 = 10, n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("Hi");
		
		total = calcSum();
		System.out.println(total);
		
	}

}
