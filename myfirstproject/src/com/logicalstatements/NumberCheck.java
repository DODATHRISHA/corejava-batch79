package com.logicalstatements;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		 int a = sc.nextInt();
		 
		 System.out.println("enter a number");
		 int b = sc.nextInt();
		 
		 String result = (a > 0) ?  "positive" : "negative";
		 System.out.println(result);
		 
		 String result2 = (b %2 == 0) ?  "Even" : "Odd";
		 System.out.println(result2);
		 
		 

	}

}
