package com.languagefundamentals.methods;

public class Methods113 {
	
	static void printInvertedTriangle() {
		System.out.println("InvertedTriangle");
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void printNumberPyramid() {
		System.out.println("NumberPyramid");
	    for (int i = 1; i <= 5; i++) {
	        for (int j = 1; j <= 5 - i; j++) {
	            System.out.print(" ");
	        }
	        for (int j = 1; j <= 2 * i - 1; j++) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }
	}
	
	static void printFloydTriangle() {
		System.out.println("FloydTriangle");
	    int num = 1;

	    for (int i = 1; i <= 5; i++) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print(num + " ");
	            num++;
	        }
	        System.out.println();
	    }
	}
	static void printHollowRectangle() {
		System.out.println("HollowRectangle");
	    for (int i = 1; i <= 4; i++) {
	        for (int j = 1; j <= 5; j++) {
	            if (i == 1 || i == 4 || j == 1 || j == 5) {
	                System.out.print("* ");
	            } else {
	                System.out.print("  ");
	            }
	        }
	        System.out.println();
	    }
	}
	
	static void showAllTypesDemo() {
	    System.out.println("Type 1: No Parameters + No Return Value");
	    System.out.println("Type 2: Parameters + No Return Value");
	    System.out.println("Type 3: No Parameters + Return Value");
	    System.out.println("Type 4: Parameters + Return Value");
	}

	public static void main(String[] args) {
		printInvertedTriangle();
		printNumberPyramid();
		printFloydTriangle();
		printHollowRectangle();
		showAllTypesDemo();

	}

}
