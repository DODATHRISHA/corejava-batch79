package com.languagefundamentals.methods;

public class Calcuation {

	static void calculateSquare(int a) {
		System.out.println("square");
		System.out.println(a * a);
	}

	static void calculateCube(int a) {
		System.out.println("cube");
		System.out.println(a * a * a);
	}

	static void calculateAverage(int a, int b, int c) {
		System.out.println("average");
		System.out.println((a + b + c) / 3.0);
	}

	static void calculateTotal(int price, int quantity) {
		System.out.println("total");
		System.out.println(price * quantity);
	}

	static void calculateRemaining(int total, int spent) {
		System.out.println("remaing");
		System.out.println(total - spent);
	}

	public static void main(String[] args) {
		calculateSquare(5);
		calculateCube(8);
		calculateAverage(2, 4, 5);
		calculateTotal(100, 7);
		calculateRemaining(800, 700);

	}

}
