package com.java;

public class BankAccount3 {
	
   static int balance = 1000;
	
	
	void balancedeposit() {
		int balance1=600;
		balance = balance+balance1;
		System.out.println(balance);
	}
	
	void balancewithdraw() {
		int balance2=300;
		balance = balance-balance2;
		System.out.println(balance);
		
	}
	
	void balancecheck() {
	    System.out.println( balance);
	}

	public static void main(String[] args) {
		BankAccount3 b = new BankAccount3();
		
		b.balancedeposit();
		b.balancewithdraw();
		b.balancecheck();
	}

}
