package ch16;

import java.util.Scanner;

public class SwitchExpressionTest1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		/*int day = switch(month) {
		
			case 1,3,5,7,8,10,12->
				31;
				
			case 2 ->
				28;
				
			case 4,6,9,11 -> 
				30;
				
			default -> {
				System.out.println("잘못입력하셨습니다.");
				yield -1; // 수행문과 같이 반환할 때 yield 사용
			}
		};*/
		
		//System.out.println(month + "월은 " + day + "일 입니다.");
	}

}
