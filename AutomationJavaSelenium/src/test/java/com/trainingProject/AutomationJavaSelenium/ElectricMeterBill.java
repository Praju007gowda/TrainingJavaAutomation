package com.trainingProject.AutomationJavaSelenium;

import java.util.Scanner;

public class ElectricMeterBill {

	public static void main(String[] args) {
		
		double bill = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the total units shown:");
		int total_units = sc.nextInt();
		int tu=total_units;
		System.out.println(tu);

		for(int i=1;i<=tu &tu>0;i++) {
			for(int fu=1;fu<=50;fu++) {
				bill=bill+1;
				tu--;
			}

			System.out.println("first 50 units bill: "+bill);
			System.out.println("Remaining units: "+tu);
			
			if(tu<=0)
				break;
			double sb=0;
			for(int su=1;su<=50&tu>0;su++) {
				bill=bill+1.60;
				sb=sb+1.60;
				tu--;
			}

			
			System.out.println("Second level bill: "+sb);
			System.out.println("Remaining units: "+tu);
			
			double tb=0;
			for(int thU=1;thU<=100&tu>0;thU++) {
				bill=bill+2;
				tb=tb+2;
				tu--;
			}
			
			System.out.println("Third level bill: "+tb);
			System.out.println("Remaining units: "+tu);
			                    
			double fb=0;
			for(int fU=1;fU<=300&tu>0;fU++) {
				bill=bill+3.50;
				fb=fb+3.50;
				tu--;
			}
			
			System.out.println("Fourth level bill: "+fb);
			System.out.println("Remaining units: "+tu);
			
			double finalb=0;
			for(int lU=1;tu>0;lU++) {
				bill=bill+5.75;
				finalb=finalb+5.75;
				tu--;
			}
			
			System.out.println("Final level bill: "+finalb);
			System.out.println("Remaining units: "+tu);
		}
		
		System.out.println("Total Bill to Pay: "+bill);
		
		
	}
}
		
		

