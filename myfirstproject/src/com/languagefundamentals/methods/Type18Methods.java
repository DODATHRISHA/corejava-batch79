package com.languagefundamentals.methods;

public class Type18Methods {

	static void checkEven() {
		int a = 2;
		System.out.println(a % 2 == 0);
	}

	static void checkOdd() {
		int s = 2;
		System.out.println(s % 3 != 0);
	}

	static void checkPositive() {
		int i = 2;

		if (i > 0) {
			System.out.println("Positive");
		} else if (i < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}

	static void checkNegative() {
		int a = -9;

		if (a > 0) {
			System.out.println("Positive");
		} else if (a < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}

	static void checkZero() {
	    int a = 0;

	    if (a > 0) {
	        System.out.println("Positive");
	    } else if (a < 0) {
	        System.out.println("Negative");
	    } else {
	        System.out.println("Zero");
	    }
	}

	static void checkVotingEligibility() {
		int age = 18;
		if (age >= 18) {
			System.out.println("eligible");
		} else {
			System.out.println("not eligible");
		}
	}

	static void checkLeapYear() {
		int year = 2024;

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is a Leap Year");
		} else {
			System.out.println(year + " is Not a Leap Year");
		}
	}

	static void checkDivisibility() {
		int a = 4;
		System.out.println(a % 5 == 0);
	}

	static void findLargest() {
		int a = 8;
		int b = 7;
		int c = 6;

		if (a > b && a > c) {
			System.out.println("Largest: " + a);
		} else if (b > a && b > c) {
			System.out.println("Largest: " + b);
		} else {
			System.out.println("Largest: " + c);
		}
	}

	static void findSmallest() {
		int a = 8;
		int b = 7;
		int c = 6;
		if (a < b && a < c) {
			System.out.println("smallest: " + a);
		} else if (b < a && b < c) {
			System.out.println("smallest: " + b);
		} else {
			System.out.println("smallest: " + c);
		}
	}

	public static void main(String[] args) {

		checkEven();
		checkOdd();
		checkPositive();
		checkNegative();
		checkZero();
		checkVotingEligibility();
		checkLeapYear();
		checkDivisibility();
		findLargest();
		findSmallest();

	}

}
