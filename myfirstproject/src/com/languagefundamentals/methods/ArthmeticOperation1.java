package com.languagefundamentals.methods;

public class ArthmeticOperation1 {

	static void addNumbers(int a, int b) {
		System.out.println("sum");
		System.out.println(a + b);
	}

	static void subtractNumbers(int a, int b) {
		System.out.println("differene");
		System.out.println(a - b);
	}

	static void multiplyNumbers(int a, int b) {
		System.out.println("number");
		System.out.println(a * b);
	}

	static void divideNumbers(int a, int b) {
		System.out.println("number1");
		System.out.println(a / b);
	}

	static void printNumbers(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		addNumbers(1, 2);
		subtractNumbers(1, 7);
		multiplyNumbers(2, 6);
		divideNumbers(6, 8);
		printNumbers(3, 9);

	}

}
