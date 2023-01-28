package ch10;

public class BirthDayTest {

	public static void main(String[] args) {

		BirthDay date = new BirthDay();
		date.setYear(2001);
		date.setMonth(04);
		date.setDay(05);
		
		// date.month = 100; 
		// private를 안하면 month 객체의 역할을 오용할 수 있다.  ==> set 메서드를 활용하여 제어한다.
		
		date.showDate();
		
	}

}
