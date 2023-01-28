package ch19;

public class CarFactory {

	// 싱글톤
	
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		
		return instance;
	}
	
	// createCar() 메서드 만들기
	public Car createCar() {
		
		Car car = new Car();
		return car;
	}

}
