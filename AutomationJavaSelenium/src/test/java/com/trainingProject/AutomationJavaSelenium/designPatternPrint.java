package com.trainingProject.AutomationJavaSelenium;

import java.util.Scanner;

public class designPatternPrint {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        
		for (int i=0;i<rows;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	scanner.close();
}
}
