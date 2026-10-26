package com.logicalstatements;
import java.util.Scanner;

public class check {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
	    int number = sc.nextInt();
	    sc.nextLine();

	    System.out.println("Enter your name:");
	    String name = sc.nextLine();
		
		if(number<0) {
			System.out.println("negitive");
		}else if(number>0){
			System.out.println("positive");
		}else {
			System.out.println("zero");
		}
		
		if(name.length()<=15) {
			System.out.println("passport eligible");
		}else {
			System.out.println("not eligible");
		}

	}

}
