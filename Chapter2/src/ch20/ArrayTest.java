package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];  // new는 배열 초기화 (int는 0으로, string은 null)
		int total = 0;
		
		// 배열 입력
		for(int i = 0, num = 1; i < arr.length; i++) {

			arr[i] = num++; // arr[0] = 1, [1] = 2, ... [9] = 10
		}
		
		// 또는 int[] arr = new int[] {1,2,3,4,5...};
		
		//enhanced for문
		for(int a : arr) {
			total += a;
		}
		
		System.out.println(total);
	}

}
