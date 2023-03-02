package com.trainingProject.AutomationJavaSelenium;

public class asciiCharacter {

	public static void main(String[] args) {

		int i=1;
		while(i<=65) {
			for (int j=1;j<=65;j++) {
				
				System.out.print((char)j+" ");
				i++;
				if(j%10==0)
					System.out.println();
			}
			
		}
		
	}
}
