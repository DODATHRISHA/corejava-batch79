package com.logicalstatements;

import java.util.Scanner;

public class SmartCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");

		System.out.println("enter a choice");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("enter 2 numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Addition:" + (a + b));
			break;

		case 2:
			System.out.println("enter 2 numbers");
			int a1 = sc.nextInt();
			int b1 = sc.nextInt();
			System.out.println("subtraction:" + (a1 - b1));
			break;

		case 3:
			System.out.println("enter 2 numbers");
			int a2 = sc.nextInt();
			int b2 = sc.nextInt();
			System.out.println("multiplication:" + (a2 * b2));
			break;

		case 4:
			System.out.println("enter 2 numbers");
			int a3 = sc.nextInt();
			int b3 = sc.nextInt();
			System.out.println("division:" + (a3 / b3));
			break;

		case 5:
			System.out.println("enter 2 numbers");
			int a4 = sc.nextInt();
			int b4 = sc.nextInt();
			System.out.println("modulus:" + (a4 % b4));
			break;

		default:
			System.out.println("invalid method");
		}

	}

}
