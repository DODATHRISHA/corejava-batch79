
package com.logicalstatements;

import java.util.Scanner;

public class Checkvoting1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("if you are indian enter true for yes false for no");
		boolean indianCitizen = sc.nextBoolean();

		System.out.println("enter your age");
		int age = sc.nextInt();

		System.out.println("enter your voterid");
		int voterid = sc.nextInt();

		int check;

		if (indianCitizen == true && age >= 18 && voterid > 0) {
			check = 4;
		} else if (indianCitizen == true && age >= 18) {
			check = 1;
		} else {
			check = 2;
		}

		switch (check) {

		case 1:
			System.out.println("eligible");
			break;

		case 2:
			System.out.println("not eligible");
			break;

		case 3:
			System.out.println("not eligible");
			break;

		case 4:
			System.out.println("eligible");
			break;
		}

		sc.close();
	}
}
