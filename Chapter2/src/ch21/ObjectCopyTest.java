package ch21;

//객체 복사

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5]; 
		Book[] copyLibrary = new Book[5];
	
		library[0] = new Book("a", "aa");
		library[1] = new Book("b", "bb");
		library[2] = new Book("c", "cc");
		library[3] = new Book("d", "dd");
		library[4] = new Book("e", "ee");
		
		// 복사 => System.arraycopy(복사 source, 어디서부터 할지, 복사 destination, 어디서부터 복사본을 넣을지, 배열 크기);
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
//		System.out.println("===lib===");
//		for(Book book : library) {
//			System.out.println(book); 
//			book.showInfo();
//		}
//		System.out.println("===cpy===");
//		for(Book book : copyLibrary) {
//			System.out.println(book); 
//			book.showInfo();
//		}
		
		// 배열 첫번째 내용 수정 ==> library만 바꿨어도 copy까지 같이 바뀜.
		library[0].setAuthor("kk");
		library[0].setTitle("ll");
		
		System.out.println("===lib===");
		for(Book book : library) {
			System.out.println(book); 
			book.showInfo();
		}
		System.out.println("===cpy===");
		for(Book book : copyLibrary) {
			System.out.println(book); 
			book.showInfo();
		}
		
		
	}

}
