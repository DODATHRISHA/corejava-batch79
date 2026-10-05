package com.java;

public class LiteralsDemo2 {
	
//	normal values
	int a = 10;
	int b = 101;
	
//	octal values start with 0 the range of 0 to 7 and the base is 8
	int c = 0123;
	int c1 = 0124;
//	octal not consider  that showing error like unsolved
//	int c2 = 0178;
	
//	Hexa-decimal:any number start with 0x and 0X will consider as a Hexa-decimal
//    the base is 16 and range is 0 to 9
	int d = 0x123;
	int d1 = 0x125;
	int d3 = 0xAD;
	
	float f1 = 123;
	float f2 = 0123;
	float f3 = 0x123;
//	float f4 = 0123.5; by default it consider double
	float f5 = 0123.5F;
//	float f6 = 0x123.5F;For hexadecimal floating-point numbers 
//	p and an exponent number are compulsory.
	float f7 = 0345F;
	float f8 = 0x345F;
	float f9 = 567F;
	float f10 = 123.9F;
	float f11 = 0456F;


	public static void main(String[] args) {
		LiteralsDemo2 l = new LiteralsDemo2();
		System.out.println("a:"+l.a);
		System.out.println("b:"+l.b);
		
		System.out.println("c:"+l.c);
		System.out.println("c1:"+l.c1);
		
		System.out.println("d:"+l.d);
		System.out.println("d1:"+l.d1);
		System.out.println("d3:"+l.d3);
		
		System.out.println("f1:"+l.f1);
		System.out.println("f2:"+l.f2);
		System.out.println("f3:"+l.f3);
		System.out.println("f5:"+l.f5);
		System.out.println("f7:"+l.f7);
		System.out.println("f8:"+l.f8);
		System.out.println("f9:"+l.f9);
		System.out.println("f10:"+l.f10);
		System.out.println("f11:"+l.f11);

	}

}
