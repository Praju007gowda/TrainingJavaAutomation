package com.trainingProject.AutomationJavaSelenium;

import java.util.Scanner;

public class sIandCICalculator {

	public static void main(String argu[ ]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Deposit Amount:");
		double deposit = sc.nextDouble();
		
		System.out.println("Enter RI: ");
		float rI = sc.nextFloat();
		
		System.out.println("Enter Years: ");
		int years = sc.nextInt();
		
		double si =  (deposit * rI * years) / 100;
		System.out.println("Simple Interest is: "+si);
		double cI = deposit * Math.pow(1.0+rI/100.0,years) - deposit;
		System.out.println("Compound Interestis: "+cI);
	}
}

