package com.logicalstatements;

import java.util.Scanner;
public class MenuDriven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			if(a%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		case 2:
			System.out.println("square:"+a*a);
			
		case 3:
			System.out.println("cube:"+a*a*a);
		}


	}

}
