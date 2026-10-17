package com.languagefundamentals.methods;

public class Type110Methods {
	
	static void printTablesOneToFive() {
		for(int i=1;i<=10;i++) {
			System.out.println(1+"*"+i+"="+(1*i));
			System.out.println(2+"*"+i+"="+(2*i));
			System.out.println(3+"*"+i+"="+(3*i));
			System.out.println(4+"*"+i+"="+(4*i));
			System.out.println(5+"*"+i+"="+(5*i));
		}
	}
	
	static void printSumOneToTen() {
	    int sum = 0;

	    for (int i = 1; i <= 10; i++) {
	        sum = sum + i;
	    }

	    System.out.println("Sum: " + sum);
	}
	
	static void printFactorialFive() {
	    int factorial = 1;
        for (int i = 1; i <= 5; i++) {
	        factorial = factorial * i;
	    }
       System.out.println(factorial);
	}
	
	static void printDigits() {
		int a = 12345;
		while (a > 0) {
	        int digit = a % 10;
	        System.out.println(digit);
	        a = a / 10;
		}
	}
	static void printReverseNumber() {
	    int number = 12345;
	    int reverse = 0;

	    while (number > 0) {
	        int digit = number % 10;
	        reverse = reverse * 10 + digit;
	        number = number / 10;
	    }

	    System.out.println("Reverse number: " + reverse);
	}

	public static void main(String[] args) {
		printTablesOneToFive();
		printSumOneToTen();
		printFactorialFive();
		printDigits();
		printReverseNumber();

	}

}
