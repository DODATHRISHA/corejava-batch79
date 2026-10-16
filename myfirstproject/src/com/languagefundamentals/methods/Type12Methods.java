package com.languagefundamentals.methods;

public class Type12Methods {

	static void printCountdown() {
		System.out.println("printCountdown");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}

	static void printAlphabets() {
		System.out.println("printAlphabets");
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}
	}

	static void printSmallAlphabets() {
		System.out.println("printSmallAlphabets");
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
		}

	}

	static void printVowels() {
		System.out.println("printVowels");
		char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < vowels.length; i++) {
			System.out.println(vowels[i]);
		}
	}

	static void printDays() {
		System.out.println("printDays");
		String[] printDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		for (int i = 0; i < printDays.length; i++) {
			System.out.println(printDays[i]);
		}
	}

	static void printMonths() {
		System.out.println("printMonths");
		String[] printMonths = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		for (int i = 0; i < printMonths.length; i++) {
			System.out.println(printMonths[i]);
		}
	}

	static void showWelcomeBanner() {
		System.out.println("===============");
		System.out.println("welcome banner");
		System.out.println("===============");
	}

	static void showExitMessage() {
		System.out.println("Thank you for visiting");
	}

	static void printMultiplesOfThree() {
		System.out.println("printMultiplesOfThree()");
		for (int i = 1; i <= 10; i++) {
			System.out.println(3 * i);

		}
	}

	static void printMultiplesOfFive() {
		System.out.println("printMultiplesOfFive");
		for (int i = 1; i <= 10; i++) {
			System.out.println(5 * i);
		}
	}

	public static void main(String[] args) {
		printCountdown();
		printAlphabets();
		printSmallAlphabets();
		printVowels();
		printDays();
		printMonths();
		showWelcomeBanner();
		showExitMessage();
		printMultiplesOfThree();
		printMultiplesOfFive();

	}

}
