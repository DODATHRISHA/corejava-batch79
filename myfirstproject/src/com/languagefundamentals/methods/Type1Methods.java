package com.languagefundamentals.methods;

public class Type1Methods {

	static void display() {
		System.out.println("Hello java");
	}

	static void welcome() {
		System.out.println("Welcome to Java Programming");
	}

	static void showName() {
		System.out.println("Thrisha");
	}

	static void showCity() {
		System.out.println("HYD");
	}

	static void showCollege() {
		System.out.println("CMR COLLAGE");
	}

	static void showCourse() {
		System.out.println("JAVA");
	}

	static void showDetails() {
		String name = "Trisha";
		String course = "JFS";
		String city = "HYD";
		System.out.println("Name:" + name);
		System.out.println("course:" + course);
		System.out.println("city:" + city);
	}

	static void printStars() {
		System.out.println("*****");
	}

	static void printLine() {
		System.out.println("--------------");
	}

	static void showMessage() {
		System.out.println("Practice makes progress");
	}

	static void printNumbers() {
		for (int i = 1; i <= 10; i++)
			System.out.println(i);
	}

	static void printEvenNumbers() {
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("even num:" + i);
			}
		}
	}

	static void printOddNumbers() {
		for (int i = 1; i <= 19; i++) {
			if (i % 2 != 0) {
				System.out.println("odd numbers:" + i);
			}
		}
	}

	static void printTable() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(5 + "*" + i + "=" + (5 * i));
		}
	}

	static void printSquares() {
		for(int i=1;i<=10;i++) {
		   System.out.println(i+"square:"+(i*i));	
		}
	}

	static void printCubes() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+"cube"+(i*i*i));
		}
	}

	static void showJavaTopics() {
		System.out.println("java topic1:" + "java introduction");
		System.out.println("java topic2:" + "jvm architure");
		System.out.println("java topic3:" + "fundamentals");
		System.out.println("java topic4:" + "iterals");
		System.out.println("java topic5:" + "methods");
	}

	static void showMenu() {
		String foodname = "biryani";
		int price = 140;
		String location = "hyd";
		System.out.println("Food Menu");
		System.out.println("foodname:" + foodname);
		System.out.println("price :" + price);
		System.out.println("location:" + location);
	}

	static void showPattern() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void showSeparator() {
		System.out.println("============");
	}

	public static void main(String[] args) {

//		calling methods
		display();
		welcome();
		showName();
		showCity();
		showCollege();
		showCourse();
		showDetails();
		printStars();
		 printLine();
		showMessage();
		printNumbers();
		printEvenNumbers();
		printOddNumbers();
		printTable();
		printSquares();
		printCubes();
		showJavaTopics();
		showMenu();
		showPattern();
		showSeparator();

	}

}
