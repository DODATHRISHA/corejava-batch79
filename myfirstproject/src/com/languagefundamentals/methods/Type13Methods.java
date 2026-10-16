package com.languagefundamentals.methods;

public class Type13Methods {
	
	static void printNumberPattern() {
		System.out.println("printNumberPattern");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void printReverseNumbers() {
		System.out.println("printReverseNumbers");
		for(int i=20;i>=1;i--) {
			System.out.println(i);
		}
	}
	
	static void  printFirstTenCubes(){
		System.out.println("printFirstTenCubes");
		for(int i=1;i<=10;i++) {
			System.out.println(i*i*i);
		}
	}
	
	static void showStudentCard() {
		System.out.println("==========");
		System.out.println("student information card");
		System.out.println("===========");
	}
	
	static void showEmployeeCard() {
		System.out.println("===========");
		System.out.println("employee information card");
		System.out.println("============");
	}
	
	static void showBankMenu() {
		int accountnum = 1234568999;
		String name = "trisha";
	    int accountAmount = 6000;
	    
	    System.out.println("accountnum:"+accountnum);
	    System.out.println("name:"+name);
	    System.out.println("accountAmount:"+accountAmount);
	}

	public static void main(String[] args) {
		printNumberPattern();
		printFirstTenCubes();
		printReverseNumbers();
		showStudentCard();
		showBankMenu();

	}

}
