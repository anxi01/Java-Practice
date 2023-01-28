package ch10;

public class Practice {

	
	public static void main(String[] args) {

		football son = new football();
		
		son.setBall("nike");
		System.out.println(son.getBall());
		
		
		
		
	}

}

class football{
	
	private String ball;
	
	public String getBall() {
		return ball;
	}
	
	public void setBall(String ball) {
		this.ball = ball;
	}
	
}