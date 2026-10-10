package com.languagefundamentals.methods;

public class Student1 {
	static int stuid = 1;
   static  String name = "trisha";
    static String city = "hyd";
	
	static void displayStudent() {
		System.out.println("Student id:"+stuid);
		System.out.println("Student name:"+name);
		System.out.println("Student city:"+city);
		
	}
	
	static void printNumbers(int a, int b) {
		System.out.println("printNumbers");
		System.out.println(a);
		System.out.println(b);
	}
	
	static void calculateTotal(int price, int quantity) {
		System.out.println("total amount");
		System.out.println(price*quantity);
	}
	
	static void calculateRemaining(int total, int spent) {
		System.out.println("Remaining");
		System.out.println(total-spent);
	}

	public static void main(String[] args) {
		displayStudent();
		printNumbers(1,2);
		calculateTotal(101,3);
		calculateRemaining(5000,1000);

	}

}
