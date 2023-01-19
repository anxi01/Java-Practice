package ch20;

public class CharArrayTest {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alphabets.length;i++) {
			
			alphabets[i] = ch++;
		}
		
		// enhanced for문으로 배열 값 확인하기
		for(char alpha : alphabets) {
			System.out.println(alpha);
		}
		
	}

}
