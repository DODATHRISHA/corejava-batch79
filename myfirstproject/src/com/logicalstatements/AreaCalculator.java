package com.logicalstatements;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a connection");
		int area = sc.nextInt();

		System.out.println("enter a A");
		int a = sc.nextInt();

		System.out.println("enter length and width");
		int length = sc.nextInt();
		int width = sc.nextInt();

		System.out.println("enter a radius");
		int radius = sc.nextInt();

		switch (area) {
		case 1:
			System.out.println("Square:" + a * a);
			break;

		case 2:
			System.out.println("Rectangle:" + length * width);
			break;

		case 3:
			System.out.println("Circle:" + Math.PI * radius * radius);
			break;
		}

	}

}
