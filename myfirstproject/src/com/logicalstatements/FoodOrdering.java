package com.logicalstatements;

import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("menu: choose your order");
		System.out.println("1.Pizza: 200 RS");
		System.out.println("2.Burger: 120 RS");
		System.out.println("3.Biryani: 180 RS");
		System.out.println("4.Noodles: 100 RS");

		String menu = sc.next();

		switch (menu) {

		case "1":
			System.out.println("enter a item and quantity");
			String item = sc.next();
			int quantity = sc.nextInt();

			int totalbill1 = 200 * quantity;
			System.out.println(totalbill1);
			break;

		case "2":
			System.out.println("enter a item and quantity");
			String item1 = sc.next();
			int quantity1 = sc.nextInt();

			int totalbill2 = 120 * quantity1;
			System.out.println(totalbill2);
			break;

		case "3":
			System.out.println("enter a item and quantity");
			String item2 = sc.next();
			int quantity2 = sc.nextInt();

			int totalbill3 = 180 * quantity2;
			System.out.println(totalbill3);
			break;

		case "4":
			System.out.println("enter a item and quantity");
			String item3 = sc.next();
			int quantity3 = sc.nextInt();

			int totalbill4 = 100 * quantity3;
			System.out.println(totalbill4);
			break;

		default:
			System.out.println("Invalid menu option");
		}

		sc.close();
	}
}
