package com.languagefundamentals.methods;

public class MethodPractice1 {

	static String bookname = "java programming";
	static String Author = "James Gosling";
	static int     Price = 500;
	
	static void displayBook() {
		System.out.println("book name:"+ bookname);
		System.out.println("Author:"+Author);
		System.out.println("Price:"+Price);
	}

	public static void main(String[] args) {
		
		displayBook();

	}

}
