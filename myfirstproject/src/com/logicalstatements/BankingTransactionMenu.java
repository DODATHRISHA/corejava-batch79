package com.logicalstatements;

import java.util.Scanner;

public class BankingTransactionMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a avalilableblnc");
		int avalilableblnc = sc.nextInt();
		
		System.out.println("1. deposit money");
		System.out.println("2. withdraw money");

		System.out.println("enter your choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("deposit money");
			double depositmoney = sc.nextInt();
			if(depositmoney>0) {
			double deposit = avalilableblnc+depositmoney;
			System.out.println("update:"+deposit);
			}else {
				System.out.println("invalid deposit money");
			}
			break;
			
		case 2:
			System.out.println("withdraw money");
			double withdrawmoney = sc.nextInt();
			if(withdrawmoney>0 && withdrawmoney<=avalilableblnc) {
			double withdraw = avalilableblnc-withdrawmoney;
			System.out.println("avalilableblnc:"+withdraw);
			}else {
				System.out.println("exit");
			}
			break;
			
			default:
				System.out.println("invalid money");
			
		}
		

	}

}
