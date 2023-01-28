package ch15;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("a1");
		bookQueue.enQueue("a2");
		bookQueue.enQueue("a3");
		bookQueue.enQueue("a4");
		bookQueue.enQueue("a5");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue()); 
	}

}
