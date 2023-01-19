package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "Lee");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() +" and "+ price);
		
		VIPCustomer customerKim = new VIPCustomer(20010, "Kim");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() +" and "+ price);
		
		Customer vc = new VIPCustomer(12345, "sls");
		price = vc.calcPrice(10000);
		System.out.println(price); // 
		
		
	}

}
