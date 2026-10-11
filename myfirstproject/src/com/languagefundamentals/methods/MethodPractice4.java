package com.languagefundamentals.methods;

public class MethodPractice4 {

	static void add(int a, int b) {
		System.out.println("add");
		System.out.println(a + b);
	}

	static void subtract(int a, int b) {
		System.out.println("subtract");
		System.out.println(a - b);
	}

	static void multiply(int a, int b) {
		System.out.println("multiply");
		System.out.println(a * b);
	}

	static void checkEvenOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

	static void checkPositiveNegative(int n) {
		if (n > 0) {
			System.out.println("positive");
		} else {
			if (n < 0) {
				System.out.println("negative");
			} else {
				System.out.println("zero");
			}
		}
	}

	static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("n x" + i + "=" + (n * i));
		}
	}

	static void displayStudent(String name, int marks) {
		System.out.println("name:" + name);
		System.out.println("marks:" + marks);
	}

	static void findSquare(int n) {
		System.out.println("square");
		System.out.println(n * n);
	}

	static void calculateArea(int length, int breadth) {
		System.out.println("area of rectangle");
		System.out.println(length * breadth);
	}

	static void calculateBill(int price, int quantity) {
		System.out.println("total bill");
		System.out.println(price * quantity);
	}

	public static void main(String[] args) {
		add(4, 8);
		subtract(10, 8);
		multiply(5, 5);
		checkEvenOdd(6);
		checkPositiveNegative(-9);
		printTable(2);
		displayStudent("trisha", 80);
		findSquare(5);
		calculateArea(10, 66);
		calculateBill(100, 8);

	}

}
