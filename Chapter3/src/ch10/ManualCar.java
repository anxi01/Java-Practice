package ch10;

public class ManualCar extends Car {

	@Override
	public void drive() {
		
		System.out.println("driving by human");
		System.out.println("handle controled by human");
	}

	@Override
	public void stop() {
		System.out.println("push the break & stop");
	}

	@Override
	public void wiper() {
		
	}

	
}
