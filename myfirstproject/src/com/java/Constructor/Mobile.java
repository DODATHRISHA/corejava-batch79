package com.java.Constructor;

import java.util.Scanner;

public class Mobile{

    String model;
    int quantity;
    double price;
    double deliveryCharge;
    double mobileCost;
    double finalBill;

    // Constructor 1
    Mobile() {
        this("", 0);
    }

    // Constructor 2
    Mobile(String model, int quantity) {
        this(model, quantity, 0.0);
    }

    // Constructor 3
    Mobile(String model, int quantity, double price) {
        this(model, quantity, price, 0.0);
    }

    // Constructor 4
    Mobile(String model, int quantity, double price,
               double deliveryCharge) {

        this.model = model;
        this.quantity = quantity;
        this.price = price;
        this.deliveryCharge = deliveryCharge;

        mobileCost = price * quantity;
        finalBill = mobileCost + deliveryCharge;
    }

    void displayBill() {
        System.out.println("\n----- MOBILE BILL -----");
        System.out.println("Mobile Model: " + model);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Mobile Cost: " + mobileCost);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Final Bill: " + finalBill);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile model: ");
        String model = sc.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter delivery charge: ");
        double deliveryCharge = sc.nextDouble();

        Mobile m = new Mobile(
            model, quantity, price, deliveryCharge
        );

        m.displayBill();

        sc.close();
    }
}


