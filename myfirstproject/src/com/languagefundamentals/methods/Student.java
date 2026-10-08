package com.languagefundamentals.methods;

import java.util.Scanner;

public class Student {
	int stundentid;
	String studentname;
	String collage;
	int phonenumber;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student id:");
		int stundentid = sc.nextInt();
		
		System.out.println("Enter student name:");
		String studentname = sc.next();
		
		System.out.println("Enter student collage:");
		String collage = sc.next();
		
		System.out.println("Enter student phonenumber:");
		int phonenumber = sc.nextInt();

		System.out.println(stundentid);
		System.out.println(studentname);
		System.out.println(collage);
		System.out.println(phonenumber);

	}

}
