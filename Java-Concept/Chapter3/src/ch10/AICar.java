package ch10;

public class AICar extends Car {

	@Override
	public void drive() {

		System.out.println("free driving");
		System.out.println("turn left or right by itself");
	}

	@Override
	public void stop() {

		System.out.println("stop by itself");
	}

	@Override
	public void wiper() {
		
	}

	@Override
	public void washCar() {

		System.out.println("auto Washcar");
	}

	
	
}
