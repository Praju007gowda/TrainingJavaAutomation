package com.trainingProject.AutomationJavaSelenium;

import java.util.Random;
import java.util.Scanner;

public class randNumSelect {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(1,50);
		System.out.println("Random number generated is: "+num);
		
	}

}
