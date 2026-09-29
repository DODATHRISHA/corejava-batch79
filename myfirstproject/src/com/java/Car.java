package com.java;

public class Car {
// static variable
	static String brand = "Toyota";
	
//	instance variable
	String model;
	int price;
	String colour;
	
//	static block
	static {
		System.out.println("brand:"+ brand );
	}
	
//	instance block
	{
		System.out.println("Car object created");
	}
	
//	instance method
	void cardetails() {
		 System.out.println("Model:"+model);
		 System.out.println("Price:"+price);
		 System.out.println("Colour:"+colour);
	}
	
//	static method
	static void carbrand(){
		System.out.println("brand:"+ brand );
	}

	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car();
		
		c.model = "BMW";
		c.price = 10000000;
		c.colour = "blue";
		
		c1.model = "tata";
		c1.price = 10000000;
		c1.colour = "red";
		
		c.cardetails();
		c1.cardetails();
		Car.carbrand();
	}

}
