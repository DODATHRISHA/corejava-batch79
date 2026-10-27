
package com.logicalstatements;

import java.util.Scanner;

public class Agecheck {

	public static void main(String[] args) {

		System.out.println("Welcome to Vcube Matrimonial");

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello, can you enter your full name?");
		String fullname = sc.nextLine();

		System.out.println("Nice to meet you, Ms. " + fullname);

		System.out.println("Can you please enter your assets?");
		double assets = sc.nextDouble();

		if (assets >= 50000000.00) {

			System.out.println("Oh!! Nice to meet you");
			System.out.println("Can you please enter your salary?");
			double salary = sc.nextDouble();

			if (salary >= 2500000.00) {

				System.out.println("Good to know!! Let's start the conversation!");
				System.out.println("Enter your age");
				int age = sc.nextInt();

				if (age >= 25 && age <= 29) {

					System.out.println("Your age is matching. We have a few more questions.");

					System.out.println("Enter your height in feet");
					float height = sc.nextFloat();

					System.out.println("Enter your weight");
					double weight = sc.nextDouble();

					if ((height >= 5.6 && height < 6.1) && (weight >= 65 && weight <= 75)) {

						System.out.println("Good to know!! We are almost good.");

						System.out.println("Do you have siblings? Enter true or false");
						boolean sibStatus = sc.nextBoolean();

						if (sibStatus) {
							System.out.println("Thank God!! We will come back later.");
						} else {
							System.out.println("Oh my God!");
						}

					} else {
						System.out.println("Sorry!! Height or weight is not matching.");
					}

				} else {
					System.out.println("Your age is not matching.");
				}

			} else {
				System.out.println("Your profile is not matching with my daughter's profile!");
			}

		} else {
			System.out.println("Your assets are not matching.");
		}

		sc.close();
	}
}

