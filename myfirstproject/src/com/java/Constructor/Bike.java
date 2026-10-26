package com.java.Constructor;

public class Bike {
	String model;
	String brand;
	double price;
	String color;
	int year;
	
	//no-arg Constructor 
	Bike(){
		System.out.println("no arg constructor called");
		model = "unknown";
		brand = "unknown";
		color = "unknown";
		price = 100000.00;
		year=2025;
	}
	
	//one-arg Constructor 
	Bike(String model){
		System.out.println("one arg Constructor ");
		this.model=model;
		
	}
	
	//two-arg Constructor
	Bike(String model,String brand){
		System.out.println("two arg Constructor");
		this.model=model;
		this.brand = brand;
	}
	
	//three-arg Constructor
	Bike(String model,String brand,String color){
		System.out.println("two arg Constructor");
		this.model=model;
		this.brand = brand;
		this.color = color;
	}
	
	//four-arg Constructor
	Bike(String model,String brand,String color,double price){
		System.out.println("two arg Constructor");
		this.model=model;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	//four-arg Constructor
		Bike(String model,String brand,String color,double price,int year){
			System.out.println("two arg Constructor");
			this.model=model;
			this.brand = brand;
			this.color = color;
			this.price = price;
			this.year = year;
		}

	public static void main(String[] args) {
		System.out.println("main method stated");
		Bike b = new Bike();
		b.bikeInfo();
		
		Bike b1 = new Bike("Pulsar");
		System.out.println(b1.model);
		b1.bikeInfo();
		
		Bike b2 = new Bike("Pulsar","Bajaj");
		System.out.println(b2.brand);
		b2.bikeInfo();
		
		Bike b3 = new Bike("Pulsar","Bajaj","White");
		System.out.println(b3.color);
		b3.bikeInfo();
		
		Bike b4 = new Bike("Pulsar","Bajaj","White",750000.0);
		System.out.println(b4.price);
		b4.bikeInfo();
		
		Bike b5 = new Bike("Pulsar","Bajaj","White",750000.0,2025);
		System.out.println(b4.price);
		b5.bikeInfo();
		
		
		System.out.println("main method ended");

	}
	
	void bikeInfo() {
		System.out.println("****************");
		System.out.println("model of the bike:" + model);
		System.out.println("brand of the bike:" + brand);
		System.out.println("price of the bike:" + price);
		System.out.println("color of the bike:" + color);
		System.out.println("year of the bike:" + year);
	}

}
