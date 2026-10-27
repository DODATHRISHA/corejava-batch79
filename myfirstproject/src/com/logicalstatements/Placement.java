package com.logicalstatements;

import java.util.Scanner;

public class Placement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Are you attending classes regularly?");
		boolean AreyouattendingclassesRegularly = sc.nextBoolean();

		System.out.println("are you attending lab sessions daily");
		boolean areyouattendinglabsession = sc.nextBoolean();

		System.out.println("are you completing every week exams without fail");
		boolean areyoucompletingeveryweekexams = sc.nextBoolean();

		System.out.println("are you attending mock every week");
		boolean areyouattendingmockeveryweek = sc.nextBoolean();

		if (AreyouattendingclassesRegularly && areyouattendinglabsession && areyoucompletingeveryweekexams
				&& areyouattendingmockeveryweek) {
			System.out.println("You may get a job within 6 months if you continue working consistently");
		} else {
			System.out.println("You need to improve your consistency.");
		}

		sc.close();

	}

}
