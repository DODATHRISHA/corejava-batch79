
package com.logicalstatements;

import java.util.Scanner;

public class caculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Addition :" + (a + b));
			break;

		case 2:
			System.out.println("Substraction:" + (a - b));
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