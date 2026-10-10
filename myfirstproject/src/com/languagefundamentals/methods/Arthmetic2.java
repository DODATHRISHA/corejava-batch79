package com.languagefundamentals.methods;

public class Arthmetic2 {

	static void calculateRectangleArea(int length, int width) {
		System.out.println("rectangle");
		System.out.println(length * width);
	}

	static void calculateRectanglePerimeter(int length, int width) {
		System.out.println("perimeter");
		System.out.println(2 * (length + width));
	}

	static void findRemainder(int a, int b) {
		System.out.println("remender");
		System.out.println(a % b);
	}

	static void swapNumbers(int a, int b) {
		System.out.println("swap");
		System.out.println(b);
		System.out.println(a);
	}

	static void calculatePercentage(int obtainedMarks, int totalMarks) {
		System.out.println("percentage");
		System.out.println(obtainedMarks * 100.0 / totalMarks);
	}

	public static void main(String[] args) {
		calculateRectangleArea(101, 47);
		calculateRectanglePerimeter(76, 90);
		findRemainder(23, 87);
		swapNumbers(36, 98);
		calculatePercentage(102, 200);

	}

}
