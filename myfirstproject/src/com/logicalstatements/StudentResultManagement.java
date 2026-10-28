package com.logicalstatements;

import java.util.Scanner;

public class StudentResultManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your marks");
		int marks = sc.nextInt();

		int choice;

		if (marks >= 90) {
			choice = 1;
		} else if (marks >= 75 && marks <= 89) {
			choice = 2;
		} else if (marks >= 60 && marks <= 74) {
			choice = 3;
		} else if (marks >= 35 && marks <= 59) {
			choice = 4;
		} else {
			choice = 5;
		}

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
			System.out.println("Grade D");
			break;

		case 5:
			System.out.println("fail");
			break;

		default:
			System.out.println("invalid marks");
		}

	}

}
