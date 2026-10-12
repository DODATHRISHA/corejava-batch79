package com.languagefundamentals.methods;

public class Patterns {

	static void RightAngleTriangle() {
		System.out.println("Right-Angle Triangle");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void InvertedTriangle() {
		System.out.println("Inverted Triangle");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void SquarePattern() {
		System.out.println("Square Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void PyramidPattern() {
		System.out.println("Pyramid Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = 9; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void RightAlignedTriangle() {
		System.out.println("RightAlignedTriangle");
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		RightAngleTriangle();
		InvertedTriangle();
		SquarePattern();
		PyramidPattern();
		RightAlignedTriangle();

	}

}
