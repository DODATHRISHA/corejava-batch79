package com.languagefundamentals.methods;

public class MethodPractice6 {

	int add(int a, int b) {
		int add = a + b;
		return add;
	}

	int subtract(int a, int b) {
		int sub = a - b;
		return sub;
	}

	int multiply(int a, int b) {
		int mul = a * b;
		return mul;
	}

	int divide(int a, int b) {
		int div = a / b;
		return div;
	}

	int findMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	int findSquare(int n) {
		int a = n * n;
		return a;
	}

	int findCube(int n) {
		int cube = n * n * n;
		return cube;
	}

	int calculateArea(int length, int breadth) {
		int area = length * breadth;
		return area;
	}

	int calculateSalary(int basicSalary, int bonus) {
		int total = basicSalary + bonus;
		return total;
	}

	double calculateDiscount(double price, double discountPercentage) {
		double dis = price * discountPercentage / 100;
		double finalPrice = price - discountPercentage;
		return  finalPrice;
	}

	public static void main(String[] args) {
		MethodPractice6 m = new MethodPractice6();

		m.add(3, 5);
		m.subtract(7, 4);
		m.multiply(6, 9);
		m.divide(7, 9);
		m.findMax(3, 8);
		m.findSquare(8);
		m.findCube(2);
		m.calculateArea(12, 56);
		m.calculateSalary(50000, 300);
		m.calculateDiscount(500, 30);

		System.out.println("add value:" + m.add(3, 5));
		System.out.println("add value:" + m.subtract(7, 4));
		System.out.println("add value:" + m.multiply(6, 9));
		System.out.println("add value:" + m.divide(7, 9));
		System.out.println("add value:" + m.findMax(3, 8));
		System.out.println("add value:" + m.findSquare(8));
		System.out.println("add value:" + m.findCube(2));
		System.out.println("add value:" + m.calculateArea(12, 56));
		System.out.println("add value:" + m.calculateSalary(50000, 300));
		System.out.println("add value:" + m.calculateDiscount(500, 30));

	}

}
