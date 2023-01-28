package ch09;

// 추상 클래스
public abstract class Computer {

	// 추상 메서드
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("TURN ON");
	}
	
	public void turnOff() {
		System.out.println("TURN OFF");
	}
}
