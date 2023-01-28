package ch10;

public class CarTest {

	public static void main(String[] args) {

		Car aiCar = new AICar();
		Car manualCar = new ManualCar();
		
		aiCar.run();
		System.out.println("==========================");
		manualCar.run();
	}

}
