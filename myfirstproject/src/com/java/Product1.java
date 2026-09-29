package com.java;

public class Product1 {
	byte soap;
	short remote;
	int mobile;
	long adharnumber;
	float productpercentage;
	double balance;
	char grade;
	boolean coustomerregular;
	
	public static void main(String[] args) {
		Product1 p = new Product1();
		p.soap=10;
		p.remote=100;
		p.mobile=300000;
		p.adharnumber = 1234567891L;
		p.productpercentage = 65.00F;
		p.balance = 1234.345;
		p.grade ='A';
		p.coustomerregular = true;
		
		System.out.println("Soap:"+p.soap);
		System.out.println("Remote:"+p.remote);
		System.out.println("Mobile:"+p.mobile);
		System.out.println("Adhar number:" + p.adharnumber);
		System.out.println("Productpercentage:"+p.productpercentage);
		System.out.println("Balance:"+p.balance);
		System.out.println("Coustomer regular:"+p.coustomerregular);
		System.out.println("Grade:"+p.grade);
	}
}
