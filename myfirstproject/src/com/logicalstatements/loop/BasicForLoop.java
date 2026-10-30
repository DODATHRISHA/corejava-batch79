package com.logicalstatements.loop;

//import java.util.Scanner;

public class BasicForLoop {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

		System.out.println("number 1 to 10");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}

		System.out.println("even");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("odd");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		System.out.println("number 1 to 100");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + " ");
		}

		System.out.println("multiplication");

		for (int i = 1; i <= 100; i++) {
			System.out.println(5 + " * " + i + " = " + (5 * i));

		}

	}

}
