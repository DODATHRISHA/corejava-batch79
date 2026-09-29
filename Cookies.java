package com.java;

public class Cookies {

    // prices
    int chocolateprice = 15;
    int cookiesprice = 10;

    // buy
    int chocolate = 10;
    int cookies = 5;

    // Total money
    int totalmoney = 450;

    // Calculation
    int totalamount = chocolateprice * chocolate + cookiesprice * cookies;
    int remainingamount = totalmoney - totalamount;

    public static void main(String[] args) {
        Cookies c = new Cookies();

        System.out.println("The remaining amount is: " + c.remainingamount);
    }
}

