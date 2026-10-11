package com.languagefundamentals.methods;

//with return type with parameter
// find areas of triangle,circle,square,rectangle
//triangle : 0.5*base*height
//circle : PI * r * r
//square : base*base
//rectangle : length*breadth

public class Calculation {

	double areatriangle(int base, int height) {
		double area1 = 0.5 * base * height;
		return area1;
	}

	double areacircle(int radius) {
		double area2 = Math.PI * radius * radius;
		return area2;
	}

	int areasquare(int a) {
		int area3 = a * a;
		return area3;
	}

	int arearectangle(int length, int breadth) {
		int area4 = length * breadth;
		return area4;
	}

	public static void main(String[] args) {
		Calculation c = new Calculation();

		System.out.println("Area of triangle: " + c.areatriangle(23, 67));
		System.out.println("Area of circle: " + c.areacircle(6));
		System.out.println("Area of square: " + c.areasquare(6));
		System.out.println("Area of rectangle: " + c.arearectangle(6, 9));

	}

}
