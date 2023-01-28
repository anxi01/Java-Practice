package ch21;

//객체 복사 (깊은 복사)

public class ObjectCopyTest2 {

	public static void main(String[] args) {

		Book[] library = new Book[5]; 
		Book[] copyLibrary = new Book[5];
	
		library[0] = new Book("a", "aa");
		library[1] = new Book("b", "bb");
		library[2] = new Book("c", "cc");
		library[3] = new Book("d", "dd");
		library[4] = new Book("e", "ee");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
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
