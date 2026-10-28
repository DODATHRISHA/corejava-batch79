package com.logicalstatements;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character ");
		char alphabetical = sc.next().charAt(0);

		switch (alphabetical) {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");

		}
		
		sc.close();

	}

}
