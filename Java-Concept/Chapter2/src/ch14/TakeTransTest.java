package ch14;

public class TakeTransTest {

	public static void main(String[] args) {

		Student a = new Student("James", 5000);
		Student b = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		a.takeBus(bus100); // 100번 버스를 탐
		
		Subway gsubway = new Subway(2);
		b.takeSubway(gsubway); // 초록색 지하철을 탐
		
		a.showInfo();
		b.showInfo();
		
		bus100.showBusInfo();
		gsubway.showBusInfo();
		
		
		Student c = new Student("Edward", 20000);
		Taxi taxiWell = new Taxi("Well done");
		c.takeTaxi(taxiWell);
		
		c.showInfo();
		taxiWell.taxiInfo();
	}

}
