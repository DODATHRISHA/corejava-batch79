package com.java;

 class Product {
	 
	int Productprice = 150;
	byte Quantity = 5;
	double Discount = 10.5;
	char Productgrade = 'A';
	boolean Available = true;

	public static void main(String[] args) {
		Product p = new Product();
		
		System.out.println("Product price:"+p.Productprice);
		System.out.println("Quantity:"+p.Quantity);
		System.out.println("Discount:"+p.Discount);
		System.out.println("Product grade:"+p.Productgrade);
		System.out.println("Available:"+p.Available);


	}

}
