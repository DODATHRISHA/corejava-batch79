package com.languagefundamentals.methods;

public class TestMethodDemo2 {

//WAP to print calculation values for addition subtraction  multiplication division and modulus
//by using arithmetic operators----> + - * / %

	public static void main(String[] args) {
		System.out.println("main method started");

//		call by value
//		method calling by passing value : arguments
		addition(20, 30);// sum
		subtraction(30, 20);// difference
		multiplication(20, 30);// product
		divison(20, 30);// quotient
		modulus(20, 30);// reminder

		System.out.println("main method ended");

	}

//	a & b consider by parameter
	static void addition(int a, int b) {
		System.out.println("addition method called");
		System.out.println(a+b);
	}

	static void subtraction(int a, int b) {
		System.out.println("subtraction method called");
		System.out.println(a-b);
	}

	static void multiplication(int a, int b) {
		System.out.println("multiplication method called");
		System.out.println(a*b);
	}

	static void divison(int a, int b) {
		System.out.println("divison method called");
		System.out.println(a/b);
	}

	static void modulus(int a, int b) {
		System.out.println("modulus method called");
		System.out.println(a%b);
	}

}
