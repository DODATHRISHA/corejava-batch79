package com.languagefundamentals.methods;

//totalBill = price * quantity
//(price * discountPercentage) / 100
//finalPrice = price - discount
//annualSalary = monthlySalary * 12
//hours = days * 24

public class Type16Methods {
	 static void showBill() {
		 int price = 800;
		 int quantity = 5;
		 int Bill =  price*quantity;
		 System.out.println("Bill:"+Bill);
	 }
	 
	 static void showDiscount() {
		 int price = 1000;
		 int Discount = 50;
		 int d = (price *Discount)/100;
		 System.out.println("Discount:"+d);
	 }
	 static void showFinalPrice() {
		 int price = 1000;
		 int Discount = 50;
		 int finalPrice = price-Discount;
		 System.out.println("FinalPrice:"+finalPrice);
	 }
	 static void showAnnualSalary() {
		 int monthlySalary = 200000;
		 int AnnualSalary = monthlySalary * 12;
		 System.out.println("AnnualSalary:"+AnnualSalary);
	 }
	 
	 static void showAgeAfterYears() {
		 int age = 6;
		 int AgeAfterYears = age + 12;
		 System.out.println("AgeAfterYears:"+AgeAfterYears);
	 }
	 
	 static void showDaysToHours() {
		 int days = 7;
		 int DaysToHours = days*24;
		 System.out.println("DaysToHours:"+DaysToHours);
	 }
	 
	 static void showHoursToMinutes() {
		 int hours = 24;
		 int HoursToMinutes = hours*60;
		 System.out.println("HoursToMinutes:"+HoursToMinutes);
	 }

	public static void main(String[] args) {
		
		showBill();
		showDiscount();
		showFinalPrice();
		showAnnualSalary();
		showAgeAfterYears();
		showDaysToHours();
		showHoursToMinutes();

	}

}
