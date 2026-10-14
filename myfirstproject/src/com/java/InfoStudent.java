
package com.java;

public class InfoStudent {

	static int count = 0;

	InfoStudent() {
		count++;
	}

	public static void main(String[] args) {

		InfoStudent s1 = new InfoStudent();
		InfoStudent s2 = new InfoStudent();
		InfoStudent s3 = new InfoStudent();
		InfoStudent s4 = new InfoStudent();

		System.out.println("Total number of objects created: " + count);
	}
}
