package ch23;

import java.util.ArrayList;

import ch21.Book; // Book 클래스 갖고 오기

public class ArrayListTest {

	public static void main(String[] args) {
		
		//ArrayList 생성
		ArrayList<Book> library = new ArrayList<>();
		
		//add로 내용 추가
		library.add(new Book("a", "aa"));
		library.add(new Book("a1", "aa"));
		library.add(new Book("a2", "aa"));
		library.add(new Book("a3", "aa"));
		library.add(new Book("a4", "aa"));
		
		//배열 표현
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
		
	}

}
