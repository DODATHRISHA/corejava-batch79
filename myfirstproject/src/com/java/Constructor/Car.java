package com.java.Constructor;

public class Car {
	String model;
	String brand;
	double price;
	String color;
	int year;
	
	 Car(){
		 System.out.println("no arg constructor");
		 model = "unknown";
		 brand = "unknown";
		 color = "unknown";
		 price = 400000.0;
		 year = 2020;
		 
	 }
	 Car(String model,String brand,String color,double price,int year){
		 System.out.println("Parameterized constructor called");
		 this.model = model;
		 this.brand = brand;
		 this.color = color;
		 this.price = price;
		 this.year = year;
		 
	 }

	public static void main(String[] args) {
	System.out.println("main method started");
	
	 Car c1 = new  Car();
	 c1.carInfo();
	 
	 Car c2 = new Car("Swift","Maruti Suzuki","White", 750000.0,2025);
	 c2.carInfo();
	 
	 
	}
	void carInfo() {
		System.out.println("****************");
		System.out.println("model:"+model);
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("year:"+year);
	}

}
