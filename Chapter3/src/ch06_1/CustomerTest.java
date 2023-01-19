package ch06_1;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customer1 = new Customer(10001, "Tomas");
		Customer customer2 = new Customer(10002, "a");
		Customer customer3 = new GoldCustomer(10004, "b");
		Customer customer4 = new GoldCustomer(10005, "c");
		Customer customer5 = new VIPCustomer(10010, "d");
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
//		for(Customer customer : customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
//		
//		int price = 10000;
//		for(Customer customer : customerList) {
//			
//			int cost = customer.calcPrice(price);
//			System.out.println(customer.getCustomerName() + cost);
//			System.out.println(customer.getCustomerName() + customer.bonusPoint);
//		}
		if(customer3 instanceof GoldCustomer) {
			GoldCustomer vc = (GoldCustomer)customer3; // customer - goldcustomer
			System.out.println(customer3.showCustomerInfo());
		}
	}

}
