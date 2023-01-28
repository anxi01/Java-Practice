package ch14;

public class Taxi {
	
	String taxiName;
	int money;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money = money;
		money += 10000;
	}
	
	public void taxiInfo() {
		
		System.out.println(taxiName+ "'s expense is " + money);
	}
}
