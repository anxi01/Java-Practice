package ch04;

public class VIPCustomer extends Customer{

	double salesRatio;
	private String agentID;
	
	/*public VIPCustomer() {
		//super(); // 상속해주는 생성자(Customer())를 호출 해줌 (원래는 생성자처럼 default로 생성해줌)
		
		super(0, "null");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() Call");

	}*/
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}



	public String getAgentID() {
		return agentID;
	}
	
}
