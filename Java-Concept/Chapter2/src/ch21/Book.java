package ch21;

public class Book {

	private String title;
	private String author;
	
	public Book() {} // 생성자 => 안써도 되지만 ObjectCopyTest에서 copyLibrary 객체 만들 때 사용
	
	public Book(String title, String author) { // 생성자 - 초기화
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title + "," + author);
	}
	
}
