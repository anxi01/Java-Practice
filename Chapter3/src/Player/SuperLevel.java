package Player;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("run so fast");
	}

	@Override
	public void jump() {
		System.out.println("Very High Jump");		
	}

	@Override
	public void turn() {
		System.out.println("Available Turn");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** Super Level ******");		
	}

}
