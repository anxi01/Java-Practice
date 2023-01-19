package ch21;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[5]; // 객체 + 배열
		
//		for(int i = 0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		// 배열 값 넣기
		library[0] = new Book("a", "aa");
		library[1] = new Book("b", "bb");
		library[2] = new Book("c", "cc");
		library[3] = new Book("d", "dd");
		library[4] = new Book("e", "ee");
		
		for(Book book : library) {
			System.out.println(book); // address
			book.showInfo();
		}
		
		
		
		
	}

}
