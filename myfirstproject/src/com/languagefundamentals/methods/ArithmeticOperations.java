package com.languagefundamentals.methods;

public class ArithmeticOperations {
	
	static void sumnumbers(int a,int b,int c) {
		System.out.println("sum");
		System.out.println(a+b+c);
	}
	
	static void squarenumber(int a) {
		System.out.println("square");
		System.out.println(a*a);
	}
	static void cubenumbers(int a){
            System.out.println("cube");
            System.out.println(a*a*a);
	}
	
	static void averagenumber(int a,int b,int c) {
		System.out.println("average");
		System.out.println((a+b+c)/3.0);
	}
	
	static void arearectangle(int length,int width) {
		System.out.println("area of a rectangle");
		System.out.println(length*width);
	}
	public static void main(String[] args) {
		sumnumbers(4, 5, 8);
		 squarenumber(3);
		 cubenumbers(7);
		 averagenumber(56, 5, 7);
		 arearectangle(4, 6);

	}

}
