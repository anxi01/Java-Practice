package ch14;

public class Student {

	String studentName;
	int money;
	
	public Student(String studentName, int money) { // 생성자
		
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {   // 메서드
		bus.take(1000);  //버스 지불 비용
		this.money -= 1000;
	}  // 협력
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+ "입니다");
	}
	
	
	
}
