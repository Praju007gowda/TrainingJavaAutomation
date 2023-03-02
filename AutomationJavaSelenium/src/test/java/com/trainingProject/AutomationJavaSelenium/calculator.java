package com.trainingProject.AutomationJavaSelenium;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operation;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter the Number to do operation i.e 1 :'add' 2:'subtract' 3:'multiply' and 4:'division'");
		int op = sc.nextInt();
		sc.close();
		
		if(op == 1)
			System.out.println(addition(num1, num2)); 
		else if(op==2)
			System.out.println(subtraction(num1,num2)); 
		else if(op==3)
			System.out.println(multiply(num1,num2));
		else if(op==4)
			System.out.println(division(num1,num2));
		
		else 
			System.out.println("Enter a valid number for operation");
	
	}

	private static int division(int num1, int num2) {
		try {
			int div = num1/num2;
			return 0;
		}
		catch(Exception e) {
			
		}
		return num1/num2;
	
	}

	private static int multiply(int num1, int num2) {
		return num1*num2;
	}

	private static int subtraction(int num1, int num2) {
		return num1 -num2;
	}

	private static int addition(int num1, int num2) {
		return num1+num2;
	}

}
