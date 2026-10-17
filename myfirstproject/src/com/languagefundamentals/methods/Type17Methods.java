package com.languagefundamentals.methods;

//fahrenheit = (celsius * 9 / 5) + 32;
//celsius = (fahrenheit - 32) * 5 / 9
//speed = distance / time
//profit = sellingPrice - costPrice
//ratio = number1 / number2
//power = voltage * current

public class Type17Methods {
	
	static void showMinutesToSeconds() {
		int minutes = 60;
		int MinutesToSeconds = minutes*60;
		System.out.println(" MinutesToSeconds:"+ MinutesToSeconds);
				
	}
	
	static void showKilometersToMeters() {
		int Kilometers = 3;
		int KilometersToMeters = Kilometers*1000;
		System.out.println("KilometersToMeters:"+KilometersToMeters);
	}
	
	static void showMetersToCentimeters() {
		int Meters = 2;
		int MetersToCentimeters = Meters*100;
		System.out.println("MetersToCentimeters:"+MetersToCentimeters);
	}
	
	static void showCelsiusToFahrenheit() {
		int Celsius = 3;
		int CelsiusToFahrenheit = (Celsius*9/5)+32;
		System.out.println("CelsiusToFahrenheit:"+CelsiusToFahrenheit);
	}
	static void showFahrenheitToCelsius() {
		int Fahrenheit = 64;
		int FahrenheitToCelsius = (Fahrenheit - 32)* 5 / 9;
		System.out.println("FahrenheitToCelsius:"+FahrenheitToCelsius);
	}
	
	static void showSpeed() {
		int distance = 100;
		int time = 2;
		int Speed = distance/time ;
		System.out.println("Speed:"+Speed);
	}
	
	static void showDistance() {
		int speed = 50;
		int time = 2;
		int Distance =  speed*time;
		System.out.println("Distance:"+Distance);
	}
	
	static void showTime() {
		int distance = 100;
		int speed = 50;
		int Time = distance/ speed;
		System.out.println("Time:"+Time);
	}
	static void showProfit() {
		int sellingPrice = 1000;
		int costPrice = 800;
		int Profit = sellingPrice-costPrice;
		System.out.println(" Profit:"+ Profit);
	}
	
	static void showLoss() {
		int cost = 1000;
		int sellingPrice = 800;
		int Loss = cost - sellingPrice;
		System.out.println("Loss:"+Loss);
	}
	
	static  void showRatio() {
		double number1=49;
		double number2=89;
		double Ratio = number1/number2;
		System.out.println("Ratio:"+Ratio);
	}
	
	static void showPower() {
		int voltage = 8;
		int current = 7;
		int Power =voltage*current;
		System.out.println("Power:"+Power);
	}
	static void showTotalItems() {
		int boxes1 = 3;
		int boxes2 =4;
		int boxes3 = 6;
		int TotalItems =  boxes1+ boxes2+ boxes3;
		System.out.println("TotalItems:"+TotalItems);
	}
	
	static void showElectricityBill() {
		int units = 180;
		int rate = 5;
		int ElectricityBill = units/ rate ;
		System.out.println("ElectricityBill:"+ElectricityBill);
	}
	
	static void showFuelCost() {
		
	}

	public static void main(String[] args) {
		showMinutesToSeconds();
		showKilometersToMeters();
		showMetersToCentimeters();
		showCelsiusToFahrenheit();
		showFahrenheitToCelsius();
		showSpeed();
		showDistance();
		showTime();
		showProfit();
		showLoss();
		showRatio();
		showPower();
		showTotalItems();
		showElectricityBill();
	}

}
