package com.java;

public class TypeConversion {
	
//	integer to double
	static int age = 23;
	static double marks = age;
	
//	double to integer
	static double number = 23.9;
	static int  num1 = (int) number;
	
//	char to integer
	static char grade = 'a' ;
	static int  num = grade;

//	integer to char
	static int  a1 = 11;
	static char a2 = (char) a1;
	
	public static void main(String[] args) {
		System.out.println(marks);
		System.out.println(number);
		System.out.println(num);
		System.out.println(a1);
	}

}
