package com.languagefundamentals.methods;

public class Patterns1 {

	static void RightAngleTriangle() {
		System.out.println("Right-Angle Triangle");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void InvertedRightAngleTriangle() {
		System.out.println("Inverted Right-Angle Triangle");
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

	static void IncreasingNumberTriangle() {
		System.out.println("Increasing Number Triangle");
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	static void RepeatedNumberTriangle() {
		System.out.println("Repeated Number Triangle");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}

			System.out.println();
		}
	}

	static void InvertedNumberTriangle() {
		System.out.println("Inverted Number Triangle");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println();
		}
	}

	static void RightAlignedTriangle() {
		System.out.println("Pyramid Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	static void PyramidPattern() {
		System.out.println("Pyramid Pattern");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	static void InvertedPyramid() {
		System.out.println("Inverted Pyramid");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void DiamondPattern() {
	    System.out.println("Diamond Pattern");

	    for (int i = 1; i <= 5; i++) {
	        for (int j = 1; j <= 5 - i; j++) {
	            System.out.print(" ");
	        }
	        for (int k = 1; k <= 2 * i - 1; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	    for (int i = 4; i >= 1; i--) {
	        for (int j = 1; j <= 5 - i; j++) {
	            System.out.print(" ");
	        }
	        for (int k = 1; k <= 2 * i - 1; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}

	public static void main(String[] args) {
		RightAngleTriangle();
		InvertedRightAngleTriangle();
		SquarePattern();
		IncreasingNumberTriangle();
		RepeatedNumberTriangle();
		InvertedNumberTriangle();
		RightAlignedTriangle();
		PyramidPattern();
		InvertedPyramid();
		DiamondPattern();

	}

}
