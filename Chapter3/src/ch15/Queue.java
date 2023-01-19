package ch15;

public interface Queue {

	void enQueue(String title);
	String deQueue(); // 문자열 메소드 반환
	
	int getSize();
}
