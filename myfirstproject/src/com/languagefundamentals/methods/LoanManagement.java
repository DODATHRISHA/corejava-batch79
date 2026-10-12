
package com.languagefundamentals.methods;

// simple interest formula :- SI = P * R * T / 100
// EMI --> P*R*(1+R)

public class LoanManagement {
	String customerName = "Trisha";
	int loanAmount = 100000;
	int interestRate = 10;
	int loanTenure = 5;

	public static void main(String[] args) {

//    	object creation
		LoanManagement l = new LoanManagement();

//    	print values
		System.out.println(l.calculateInterest(l.loanAmount, l.interestRate, l.loanTenure));
		System.out.println(l.calculateTotalAmount(l.loanAmount, l.interestRate));
		System.out.println(l.calculateMonthlyEMI(l.loanAmount, l.interestRate));
		l.displayLoanSummary();

	}

	double calculateInterest(int loanAmount, int interestRate, int loanTenure) {
		double SI = (loanAmount * interestRate * loanTenure) / 100.0;
		return SI;

	}

	double calculateTotalAmount(int loanAmount, int interestRate) {
		double total = loanAmount + calculateInterest(loanAmount, interestRate, loanTenure);
		return total;
	}

	double calculateMonthlyEMI(int loanAmount, int interestRate) {
		double total = calculateTotalAmount(loanAmount, interestRate);
		double EMI = total / (loanTenure * 12);
		return EMI;
	}

	void displayLoanSummary() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Loan Amount: " + loanAmount);
		System.out.println("Interest Rate: " + interestRate + "%");
		System.out.println("Loan Tenure: " + loanTenure + " years");
		System.out.println("Simple Interest: " + calculateInterest(loanAmount, interestRate, loanTenure));
		System.out.println("Total Amount: " + calculateTotalAmount(loanAmount, interestRate));
	}

}

