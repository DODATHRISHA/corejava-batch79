package com.languagefundamentals.methods;

public class Type112Methods {
	
	static void printDigitSum() {
		int num = 1234;
		int sum = 0;
		while(num>0) {
			int digit = num % 10;
			sum = sum+digit;
			num = num/10;
		}
		
		System.out.println(sum);
		
	}
	
	static void printDigitCount() {
		int num = 1234;
		int count = 0;
		while(num>0) {
			count++;
			num = num/10;
		}
		System.out.println(count);
	}
	
	static void printPerfectNumberCheck() {
		int num = 6;
		int sum = 0;
		 for(int i=1;i<num;i++) {
			 if(num%i==0) {
				sum= sum+i; 
			 }
		 }
		 if(sum==num) {
			 System.out.println("perfect num");
		 }else {
			 System.out.println("not perfect");
		 }
	}
	
	static void printArmstrongCheck() {
		int num = 153;
		int temp = num;
		int sum = 0;
		while(num>0) {
			int digit = num % 10;
			sum = sum+(digit*digit*digit);
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong Number");
		}else{
			System.out.println("mot Armstrong Number");
		}
	}
	
	static void printMultiplicationPattern() {
	    for (int i = 1; i <= 5; i++) {
	        for (int j = 1; j <= 5; j++) {
	            System.out.print(i * j + "\t");
	        }
	        System.out.println();
	    }
	}

	public static void main(String[] args) {
		printDigitSum();
		printDigitCount();
		printPerfectNumberCheck();
		printArmstrongCheck() ;
		printMultiplicationPattern();

	}

}
