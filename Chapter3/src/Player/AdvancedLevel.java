package Player;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("run fast");
	}

	@Override
	public void jump() {
		System.out.println("High Jump");		
	}

	@Override
	public void turn() {
		System.out.println("No Turn");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** Advanced Level ******");		
	}

	
	
}
