package com.languagefundamentals.methods;

import java.util.Scanner;

public class Employeesalaryinfo {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Employeesalaryinfo f = new Employeesalaryinfo();

		System.out.println("main method started");

		double basic = f.getbasic();
		double HRA = f.getHouseRenTAllowance();
		double lta = f.getleaveTraveleAssistence();
		double mc = f.getmealcoupons();
		double pf = f.getPF();
		double gt = f.getGratiuity();

		System.out.println("total fixed compensation:" + basic + HRA + lta + mc + pf + gt);

		System.out.println("main method ended");

	}

	double getbasic() {
		System.out.println("enter basic salary");
		double basic = sc.nextDouble();
		return basic;

	}

	double getHouseRenTAllowance() {
		System.out.println("enter HRA");
		double HRA = sc.nextDouble();
		return HRA;
	}

	double getleaveTraveleAssistence() {
		System.out.println("enter LTA");
		double LTA = sc.nextDouble();
		return LTA;
	}

	double getmealcoupons() {
		System.out.println("enter MC");
		double MC = sc.nextDouble();
		return MC;
	}

	double getPF() {
		System.out.println("enter PF");
		double PF = sc.nextDouble();
		return PF;
	}

	double getGratiuity() {
		System.out.println("enter Gratiuity");
		double Gratiuity = sc.nextDouble();
		return Gratiuity;
	}

}
