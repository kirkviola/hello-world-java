package com.maxtrain.tutorial; // Same as namespace in C#


import com.maxtrain.tutorial.models.Customer;
import com.maxtrain.tutorial.models.PrimeCustomer;
// import com.maxtrain.tutorial.models.*; --> imports all classes in package
public class HelloWorldJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WOW comments are fun
		
		var primeCustomer = new PrimeCustomer("MAX");

		System.out.println("Hello, world - Java");
		int i = 0;
		int j = i + 1;
		
		var q = 5;

		var customer = new Customer();
		customer.setName("Fred Inc.");
		customer.setSales(0);
		customer.setSales(customer.getSales() + 1000);
		var message = String.format("Customer: %d | %s | %f", 
										customer.getId(), 
										customer.getName(),
										customer.getSales());

		
		System.out.println(message);
		
	}

}
