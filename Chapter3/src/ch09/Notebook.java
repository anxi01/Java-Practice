package ch09;

// typing 추상 메서드를 구현하지 않았으므로 abstract 클래스로 변환
public abstract class Notebook extends Computer{

	@Override
	public void display() {

		System.out.println("Notebook display");
	}


}
