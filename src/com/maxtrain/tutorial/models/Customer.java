package com.maxtrain.tutorial.models;

public class Customer {
	
	// Properties at the top, just like C#
	private int id;
	private String name;
	private double sales;
	
	// Constructors
	public Customer(String name) {
		this.setName(name);
	}
	
	public Customer(String name, double sales) {
		this(name);
		this.setSales(sales);
	}
	// Methods
	public void Print() throws Exception { // Announces the method may throw exception.
		var trueOrFalse = true;				// Used with methods where no try catch block present.
		if(!trueOrFalse) {
			throw new Exception();
		}	
	}
	
	public void Debug() throws Exception{
		Print();
	}
	
	// Getters and Setters at the bottom
	public int getId() { // This is a getter
		return id;
	}
	
	private void setId(int id) { // This is a setter
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}
	
	public Customer () {
		this.id = 1;
	}
}
