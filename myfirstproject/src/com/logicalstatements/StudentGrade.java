package com.logicalstatements;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a choice");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Grade A");
			break;

		case 2:
			System.out.println("Grade B");
			break;

		case 3:
			System.out.println("Grade C");
			break;

		case 4:
			System.out.println("Fail");
			break;

		default:
			System.out.println("invalid grade");

		}

	}

}
