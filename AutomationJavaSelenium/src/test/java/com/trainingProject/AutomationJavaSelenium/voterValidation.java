package com.trainingProject.AutomationJavaSelenium;

import java.util.Scanner;

public class voterValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		if (age>=18)
			System.out.println("Valid Voter");
		else
			System.out.println("Not allowed to vote");
	}

}

