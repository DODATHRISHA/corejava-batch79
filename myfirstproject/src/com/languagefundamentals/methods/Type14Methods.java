package com.languagefundamentals.methods;

public class Type14Methods {

	static void showSuccessMessage() {
		System.out.println("operation success message");
	}

	static void printTriangle() {
		System.out.println("right-angled star triangle");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void printRectangle() {
		System.out.println("printRectangle");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void printHollowSquare() {
		System.out.println("printHollowSquare");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	static void printNumberTable() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	static void printAsciiMessage() {
		System.out.println("===== ASCII MESSAGE =====");
		System.out.println("  _____ ");
		System.out.println(" | HELLO |");
		System.out.println(" |______|");
	}

	static void showAppName() {
		System.out.println("name of an application");
		System.out.println("Myntra");
	}

	static void showCompanyDetails() {
		System.out.println("company details");
		String comapanyname = "IBM";
		String Roll = "Java full stack";
		int compackage = 100000;

		System.out.println("comapanyname:" + comapanyname);
		System.out.println("Roll:" + Roll);
		System.out.println("compackage:" + compackage);
	}

	static void showCourseCompletion() {
        System.out.println("Congratulations! You have completed the course.");
    }

	static void printJavaRules() {
		System.out.println("===== Java Rules =====");
		System.out.println("1. Java is case-sensitive.");
		System.out.println("2. Every statement usually ends with a semicolon (;).");
		System.out.println("3. Use curly braces {} to define a block.");
		System.out.println("4. The main method is the program entry point.");
		System.out.println("5. Class names usually start with an uppercase letter.");
	}

	static void showDailySchedule() {
		System.out.println("1:20:" + "java full stack");
		System.out.println("3:30:" + "sql");
	}

	public static void main(String[] args) {

		showSuccessMessage();
		printTriangle();
		printRectangle();
		printHollowSquare();
		printNumberTable();
		printAsciiMessage();
		showAppName();
		showCompanyDetails();
		showCourseCompletion();
		printJavaRules();
		showDailySchedule();

	}

}
