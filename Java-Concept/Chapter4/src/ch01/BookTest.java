package ch01;

class Book{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
}


public class BookTest {

	public static void main(String[] args) {

		Book book = new Book("Demian", "herman");
		
		System.out.println(book); // package.class @ virtual address
		System.out.println(book.toString());
		
		
		String str = new String("text");
		System.out.println(str);
		System.out.println(str.toString());
		
	}

}
