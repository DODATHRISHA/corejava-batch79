package com.languagefundamentals.methods;

public class TestMethodDemo1 {
	
	public static void  welcome() {
		System.out.println("welcome to java world");
	}

	public static void main(String[] args) {
		
		TestMethodDemo1 t = new TestMethodDemo1();
		
		System.out.println("main method started");
		
//		 Calling methods
//		static method can call directly or by using class name
		welcome();
		TestMethodDemo1.welcome();
		t.hello();
		
		System.out.println("main method ended");

	}
	
//		instance variable
	public void hello() {
		System.out.println("hello good morning");
	}
	

}
