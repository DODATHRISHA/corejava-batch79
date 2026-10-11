package com.languagefundamentals.methods;

public class MethodPractice3 {

	static void display() {
		System.out.println("hello world");
	}

	static void showDetails() {
		System.out.println("name:" + "trisha");
		System.out.println("age:" + 18);
		System.out.println("city:" + "hyd");
	}
	
	static void printNumbers() {
		for (int i = 1; i <= 10; i++) {
		    System.out.println(i);
		}
	}
	
	static void printEvenNumbers() {
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	static void printOddNumbers() {
		for(int i = 1; i <= 20; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	static void multiplicationTable() {
		for(int i=1; i <= 10; i++) {
			System.out.println("5 x"+ i + "="+(5*i));
		}
	}
	
	static void showWelcomeMessage() {
		System.out.println("Welcome to Java Programming");
	}
	
	static void calculateAndDisplaySum() {
		System.out.println(2+3);
	}
	
	static void displayStudentDetails() {
		System.out.println("student name:"+"trsiha");
		System.out.println("roll num:"+101);
		System.out.println("marks:"+50);
	}
	
	static void printSquareNumbers() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i*i);
		}
	}
	public static void main(String[] args) {
		display();
		showDetails();
		printNumbers();
		printEvenNumbers();
		printOddNumbers();
		multiplicationTable();
		showWelcomeMessage();
		calculateAndDisplaySum();
		displayStudentDetails();
		printSquareNumbers();
		

	}

}
