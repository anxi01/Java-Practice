package ch21;

public class BreakTest {

	public static void main(String[] args) {

		int sum = 0;
		int num;
		
		for(num = 1; ; num++) {
			
			sum += num;
			if(sum >= 100) break;
			}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
//1 2 3 4 5 6 7 8 9 10 11 12 13 <91> 14 15

// num = 14, sum = 105;