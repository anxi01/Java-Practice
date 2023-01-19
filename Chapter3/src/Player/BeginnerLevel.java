package Player;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("run slowly");
	}

	@Override
	public void jump() {
		System.out.println("No Jump");
	}

	@Override
	public void turn() {
		System.out.println("No Turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** Beginner Level ******");
	}
}
