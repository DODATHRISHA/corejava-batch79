package com.languagefundamentals.methods;

public class Method21Type {

	static void displayName(String name) {
		System.out.println(name);
	}

	static void displayCity(String city) {
		System.out.println(city);
	}

	static void displayAge(int age) {
		System.out.println(age);
	}

	static void displayNumber(int number) {
		System.out.println(number);
	}

	static void displayMessage(String message) {
		System.out.println(message);
	}

	static void showDetails(String name, int age) {
		System.out.println(name + " "+age);
	}

	static void showStudent(String name, String course) {
		System.out.println(name + " "+course);
	}

	static void showEmployee(String name, int id) {
		System.out.println(name +" "+ id);
	}

	static void showProduct(String name, double price) {
		System.out.println(name + " "+price);
	}

	static void showBook(String title, String author) {
		System.out.println(title +" "+ author);
	}

	public static void main(String[] args) {
		displayName("trisha");
		displayCity("hyd");
		displayAge(20);
		displayNumber(101);
		displayMessage("hello everyone");
		showDetails("trisha", 20);
		showStudent("trisha", "JFS");
		showEmployee("trisha", 102);
		showProduct("trisha", 10.00);
		showBook("friendship", "trisha");

	}

}
