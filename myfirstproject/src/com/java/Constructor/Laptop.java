package com.java.Constructor;

class product{
	String model;
	String brand;
	double price;
	String color;
	
	public static void main(String[]args) {
		System.out.println("main method started from product");
	}
}

public class Laptop extends product{
	
	public Laptop() {
		System.out.println("no arg constructor called from laptop");
	}

	public static void main(String[] args) {
		System.out.println("main method started from laptop");
		Laptop l = new Laptop();
		l.laptopInfo();

	}
	void laptopInfo() {
		System.out.println("model of the laptop:" + model);
		System.out.println("brand of the laptop:" + brand);
		System.out.println("price of the laptop:" + price);
		System.out.println("color of the laptop:" + color);
	}

}
