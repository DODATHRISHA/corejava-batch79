package com.languagefundamentals.methods;

public class Type19Methods {

	static void checkPass() {
		int marks = 50;
		if (marks >= 50) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	static void showGrade() {
		int marks = 50;
		if (marks >= 50) {
			System.out.println("grade B");
		} else if (marks < 50) {
			System.out.println("grade A");
		}
	}

	static void checkVowel() {
		char[] a = { 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	static void checkUppercase() {
		char c = 'A';
		if (c >= 'A' & c <= 'Z') {
			System.out.println("Uppercase");
		} else {
			System.out.println("lowecase");
		}
	}

	static void checkLowercase() {
		char c = 'a';
		if (c >= 'a' && c <= 'z') {
			System.out.println("Lowercase");
		} else {
			System.out.println("Not Lowercase");
		}
	}

	static void checkDivisibleByBoth() {
		int a = 15;

		if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("Divisible by both 3 and 5");
		} else {
			System.out.println("Not divisible by both 3 and 5");
		}
	}
	
	static void printOneToHundred() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
	
	static void printEvenToHundred() {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	static void printOddToHundred() {
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	static void printTableOfTen() {
		for(int i=1;i<=10;i++) {
			System.out.println(10+"*"+i+"="+(10*i));
		}
	}

	public static void main(String[] args) {
		checkPass();
		showGrade();
		checkVowel();
		checkUppercase();
		checkLowercase();
		checkDivisibleByBoth();
		checkDivisibleByBoth();
		printOneToHundred();
		printEvenToHundred();
		printOddToHundred();
		printTableOfTen();

	}

}
