package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {

		int dan;
		int count;
		
//		for(dan = 2; dan <10; dan++) {
//			for(count = 1; count<10; count++) {
//				
//				System.out.println(dan + " X " + count + " = " + dan * count);
//			}
//		}
		
		dan = 2;
		while(dan<10) {
			
			count = 1; // 초기화 안해놓으면 이미 count는 10이 넘어서 3단이 나오지 않는다.
			while(count<10) {
				
				System.out.println(dan + " X " + count + " = " + dan * count);
				count++;
			}
			dan++;
		}
		
		
		
	}

}
