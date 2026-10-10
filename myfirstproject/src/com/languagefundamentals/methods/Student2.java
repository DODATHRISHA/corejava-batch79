package com.languagefundamentals.methods;

public class Student2 {
	static int id = 1;
	static String name = "trisha";
	static String city = "hyd";

	static void displayStudent() {
		System.out.println("student id:" + id);
		System.out.println("student name:" + name);
		System.out.println("city:" + city);
	}

	static void calculateBill(int price, int quantity, int discount) {
		System.out.println("bill");
		System.out.println((price + quantity) - discount);
	}

	static void checkbalance() {
		System.out.println("balance");
	}

	static void calculateSavings(int monthlyIncome, int monthlyExpenses) {
		System.out.println("saving");
		System.out.println(monthlyIncome - monthlyExpenses);
	}

	static void calculateTotalMarks(int a, int b, int c, int d, int e) {
		System.out.println("total");
		System.out.println(a + b + c + d + e);
	}

	static void calculateAverageMarks(int totalMarks, int numberOfSubjects) {
		System.out.println("average");
		System.out.println(totalMarks / (double) numberOfSubjects);
	}

	public static void main(String[] args) {
		Student2.displayStudent();
		calculateBill(100, 4, 20);
		checkbalance();
		calculateSavings(500000, 20000);
		calculateTotalMarks(1, 2, 3, 4, 5);
		calculateAverageMarks(100, 3);

	}

}
