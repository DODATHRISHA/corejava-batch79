package com.java;

public class Bankaccount1 {
	int accountnumber;
	String accountholder;
	int balance;
	String accounttype;
	boolean isactive;

	public static void main(String[] args) {
		Bankaccount1 b = new Bankaccount1();
		b.accountnumber = 123445;
		b.accountholder = "trisha";
		b.balance = 340000;
		b.accounttype = "savings";
		b.isactive = true;
		
		System.out.println("accountnumber:"+b.accountnumber);
		System.out.println("accountholder:"+b.accountholder);
		System.out.println("balance:"+b.balance);
		System.out.println("accounttype:"+b.accounttype);
		System.out.println("isactive:"+b.isactive );

	}

}
