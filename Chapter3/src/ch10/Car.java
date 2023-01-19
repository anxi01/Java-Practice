package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("TURN ON");
	}
	public void turnOff() {
		System.out.println("TURN OFF");
	}
	
	public void washCar() {} //구현부 O 추상메서드 X 
	
	// 템플릿 메서드 *변하면 안됨
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
