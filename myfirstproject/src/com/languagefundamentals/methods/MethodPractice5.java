package com.languagefundamentals.methods;

public class MethodPractice5 {

	int getNumber() {
		return 100;
	}

	int getSum() {
		return 25 + 35;
	}

	int getProduct() {
		return 10 * 5;
	}

	int getAge() {
		return 18;
	}

	int getPrice() {
		return 500;
	}

	String getName() {
		return "trisha";
	}

	double getPiValue() {
		return 3.14;
	}

	int getLargestNumber() {
		int h = 20;
		int i = 30;
		int j = 90;
		int largest;

		if (h > i && h > j) {
			largest = h;
		} else if (i > h && i > j) {
			largest = i;
		} else {
			largest = j;
		}

		return largest;
	}

	int getArea() {
		int length = 10;
		int breadth = 5;
		int Area = length * breadth;
		return Area;

	}

	double getAverage() {
		int marksa = 60;
		int marksb = 50;
		int marksc = 60;
		double Average = (60 + 50 + 60) / 3.0;
		return Average;

	}

	public static void main(String[] args) {
		MethodPractice5 m = new MethodPractice5();

		int a = m.getNumber();
		int b = m.getSum();
		int c = m.getProduct();
		int d = m.getAge();
		int e = m.getPrice();
		String f = m.getName();
		double g = m.getPiValue();
		int largest = m.getLargestNumber();
		int Area = m.getArea();
		double Average = m.getAverage();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("product price of:" + e);
		System.out.println(f);
		System.out.println(g);
		System.out.println("Largest number: " + largest);
		System.out.println("area of rectangle: " + Area);
		System.out.println("average: " + Average);

	}
}
		

	
