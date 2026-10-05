package com.java;

public class LiteralDemo1 {
	int marksA = 156;
	int marksB = 678;
	int marksc = 123;
	int marksd = 456;
	int markse = 12;
	int marksf = 66;
	int marksg = 88;
	int marksh = 68;
	
	
	int total;
	int Subtraction;
	int Multiplication;
	int Division;
	
	void LiteralDemo1total() {
		total=marksA+marksB;
	}
	
	void LiteralDemo1total1() {
		Subtraction =marksc-marksd;
	}
	
	void LiteralDemo1total2() {
		Multiplication =markse*marksf;
	}
	
	void LiteralDemo1total3() {
		Division =marksg/marksh;
	}

	public static void main(String[] args) {
		LiteralDemo1 l = new LiteralDemo1();
		l.LiteralDemo1total();
		l.LiteralDemo1total1();
		l.LiteralDemo1total2();
		l.LiteralDemo1total3();
		 
	
		System.out.println("Total Marks:"+l.total);
		System.out.println("Total Marks:"+l.Subtraction);
		System.out.println("Total Marks:"+l.Multiplication);
		System.out.println("Total Marks:"+l.Division);
		

	}

}
