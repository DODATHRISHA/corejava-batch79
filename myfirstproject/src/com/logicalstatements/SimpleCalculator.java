package com.logicalstatements;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter b number");
		int b = sc.nextInt();
		System.out.println("choose");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("addition:" + (a + b));
			break;

		case 2:
			System.out.println("subtraction:" + (a - b));
			break;

		case 3:
			System.out.println("multiplication:" + (a * b));
			break;

		case 4:
			System.out.println("division:" + (a / b));
			break;

		}

	}

}
