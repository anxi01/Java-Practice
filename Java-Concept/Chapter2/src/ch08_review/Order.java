package ch08_review;

public class Order {

	public String orderNumber;
	public String phoneNumber;
	public String address;
	public int day;
	public int clock;
	public int price;
	public String menuNumber;
	
	public Order() {}
	
	public Order(String orderNumber, String phoneNumber, String address, int day, int clock, int price, String menuNumber) {
		
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.day = day;
		this.clock = clock;
		this.price = price;
		this.menuNumber = menuNumber;
		
	}
	
	public void showInfo() {
		
		System.out.println("주문 접수 번호 :" + orderNumber);
		System.out.println("주문 핸드폰 번호 :" + phoneNumber);
		System.out.println("주문 집 주소 :" + address);
		System.out.println("주문 날짜 :" + day);
		System.out.println("주문 시간 :" + clock);
		System.out.println("주문 가격 :" + price);
		System.out.println("메뉴 번호 :" + menuNumber);
		
	}
	
}
