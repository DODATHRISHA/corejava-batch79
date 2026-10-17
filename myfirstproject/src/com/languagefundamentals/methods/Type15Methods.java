package com.languagefundamentals.methods;
//Formula: Simple Interest = (principal * rate * time) / 100
//Percentage = (obtainedMarks * 100) / totalMarks
public class Type15Methods {
	
	static void showAddition() {
		int i =  10;
		int b = 30;
		System.out.println(i+b);		 
	}
	
	static void showSubtraction() {
		int i =  10;
		int b = 30;
		System.out.println(i-b);
	}
	
	static void showMultiplication() {
		int i =  8;
		int b = 3;
		System.out.println(i*b);
	}
	static void showDivision() {
		int i =  8;
		int b = 3;
		System.out.println(i/b);
	}
	static void showRemainder() {
		int i =  8;
		int b = 3;
		System.out.println(i%b);
	}
	static void showSquare() {
		int i =  8;
		System.out.println(i*i);
	}
	static void showCube() {
		int b = 3;
		System.out.println(b*b*b);
	}
	
	static void showRectangleArea() {
		int length =  8;
		int breadth = 3;
		System.out.println("RectangleArea:"+length*breadth);
	}
	static void showRectanglePerimeter() {
		int length =  8;
		int breadth = 3;
		int total = 2*(length*breadth);
		System.out.println("showRectanglePerimeter:"+total);
		
	}
	
	static void showSquareArea() {
		int side = 9; 
		
		System.out.println("SquareArea:"+side*side);
	}
	
	static void showSquarePerimeter() {
		int side = 8;
		int area = 4* side;
		System.out.println("SquarePerimeter:"+area);
	}
	
	static void showCircleArea() {
	    double radius = 5;
	    double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
	}
	
	 static void showCircleCircumference() {
	    double radius = 5;
	    double circumference = 2 * Math.PI * radius;

	    System.out.println("Circle Circumference: " + circumference);
	}
	 
	 static void showSimpleInterest() {
		 int principle = 200000;
		 int rate = 5;
		 int time = 2;
		 double SimpleInterest = (principle*rate* time)/100;
		 System.out.println("showSimpleInterest:"+SimpleInterest);
	 }
	 
	 static void showAverage() {
		 int marks1 = 80;
		 int marks2 = 70;
		 int marks3 = 60;
		int  Average = (marks1+marks2+marks3)/3;
		System.out.println("Average:"+Average);
	 }
	 
	 static void showTotalMarks() {
		 int marks1 = 80;
		 int marks2 = 70;
		 int marks3 = 60;
		 int marks4 = 70;
		 int marks5 = 60;
		 int TotalMarks = marks1+marks2+ marks3+marks4+ marks5;
		 System.out.println("TotalMarks:"+TotalMarks);
		 
	 }
	 static void showPercentage() {
		 int  obtainedMarks = 480;
		 int  totalmarks  =370;
		 double Percentage = (obtainedMarks * 100)/totalmarks;
		 System.out.println("Percentage:"+Percentage);
		 
	 }

	public static void main(String[] args) {
		showAddition();
		showSubtraction();
		showMultiplication();
		showDivision();
		showRemainder();
		 showSquare();
		 showCube();
		 showRectangleArea();
		 showRectanglePerimeter();
		 showSquareArea();
		 showSquarePerimeter();
		 showCircleArea();
		 showCircleCircumference() ;
		 showAverage();
		 showTotalMarks();
		 showPercentage();
		

	}

}
