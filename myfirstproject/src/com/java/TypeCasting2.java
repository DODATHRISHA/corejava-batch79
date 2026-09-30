package com.java;

public class TypeCasting2 {
	
//	CHAR-->INT-->DOUBLE
	static char ch = 'A';
    static int number = ch;       // char → int
	static double value = number; // int → double
	
//	int--> char --> int
	static int a = 'b';
	static char a1 = (char) a; // int → char
	static int a2 = a1;        // char → int
	
//	double-->int-->char
	static double b = 97.33;  
	static int b1 = (int) b;   // double → int
	static char b2 = (char) b1; // int → char

	public static void main(String[] args) {

        System.out.println("Character: " + ch);
        System.out.println("Integer: " + number);
        System.out.println("Double: " + value);
        
        System.out.println("Integer: " + a);
        System.out.println("character: " + a1);
        System.out.println("Integer: " + a2);
        
        System.out.println("Double: " + b);
        System.out.println("Integer: " + b1);
        System.out.println("Character: " + b2);

	}

}
