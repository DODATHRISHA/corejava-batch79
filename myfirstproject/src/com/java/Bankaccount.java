package com.java;

public class Bankaccount {
//	instance variables
	String accname;
	int amount;
	
//	static variable
	static String banklocation;
	
//	static block
	static { banklocation = "hyderabad";
	}
	
//	instance variables
	{
		System.out.println("instance block execution");
	}
	
//	object count
	static int count = 0;
//	 Constructor
	Bankaccount(){
		count++;
	}

	public static void main(String[] args) {
		Bankaccount b1 = new Bankaccount();
		b1.accname = "SBI";
		b1.amount = 500000;
		Bankaccount b2 = new Bankaccount();
		b2.accname = "union";
		b2.amount = 600000;
		Bankaccount b3 = new Bankaccount();
		b3.accname = "HDFC";
		b3.amount = 700000;
		
		System.out.println("accname:"+b1.accname+" "+"amount:"+b1.amount);
		System.out.println("accname:"+b2.accname+" "+"amount:"+b2.amount);
		System.out.println("accname:"+b3.accname+" "+"amount:"+b3.amount);
		System.out.println("banklocation:"+banklocation);
		System.out.println("the number of object:"+count);
		
		 {
			
		}
		

	}

}
