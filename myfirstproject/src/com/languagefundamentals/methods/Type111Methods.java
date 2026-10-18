package com.languagefundamentals.methods;

public class Type111Methods {

	static void printReverseNumber() {
		int a = 5;
		int b = 8;
		System.out.println(b);
		System.out.println(a);
	}

	static void printReverseNumber1() {
		int num = 123456789;
		while (num > 0) {
			System.out.println(num % 10);
			num = num / 10;
		}
	}
	
	static void Fibonacci() {
		int a = 0;
		int b = 1;
		for(int i=1;i<=10;i++) {
			System.out.println(a);
			int c = a+b;
			a = b;
			b = c;
				
		}
	}

	static void printReverseNumber2() {
		int n = 10;
		int u = 20;
		int m = 60;
		int b = 59;
		System.out.println(b + "\n" + m + "\n" + u + "\n" + n);

	}

	static void checkPalindrome() {
		int a = 121;
		if (a == 121) {
			System.out.println("Palindrome");
		} else {
			System.out.println("no Palindrome");
		}
	}
	
	static void checkPalindrome1() {
		int a = 567;
		int rev = 0;
		int temp = a;
		while(temp>0) {
			rev = rev*10+temp%10;
			temp = temp/10;
		}
		if(a == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("no Palindrome");
		}
	}
	static void checkPrime() {
		int a = 1;
		if(a==2||a == 3||a == 4||a== 7) {
			System.out.println("Primenumber");
		}else {
			System.out.println("no Primenumber");
		}
		
	}
	
	static void checkPrime1() {
		int a = 5;
		int count = 0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime number");
		}else {
			System.out.println("no Primenumber");
		}
	}
	
	static void printPrimes2() {
		for(int i=1;i<=50;i++) {
		  int  count = 0;
		  
		  for(int j=1;j<=i;j++) {
			  if(i%j==0) {
				  count++;
			  }
		  }
		  if(count==2) {
			  System.out.println("prime number");
		  }else {
				System.out.println("no Primenumber");
		  }
		}
	}

	public static void main(String[] args) {
		printReverseNumber();
		printReverseNumber1();
		printReverseNumber2();
		checkPalindrome();
		checkPalindrome1();
		checkPrime();
		checkPrime1();
		printPrimes2();
		Fibonacci();

	}

}
