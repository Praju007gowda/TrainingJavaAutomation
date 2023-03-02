package com.trainingProject.AutomationJavaSelenium;

import java.util.ArrayList;

public class arrayListExample {
	
	static ArrayList <String> arl = new ArrayList<String>();
	
	public static void main(String[] args) {
		System.out.println("Entering array list elements:");
		arl.add("First string");
		arl.add("second string");
		arl.add("third string");
		arl.add("fourth string");
		arl.add("fifth string");
		arl.add("sixth String");

		System.out.println("Printing the arrayList:");
		for(String st:arl) {
			System.out.print(st+"    ");
		}
		System.out.println("\ninserting to arraylist:");
		arl.add(0, "inserted using index value 0");
		for(String st:arl) {
			System.out.print(st+"    ");
		}
		System.out.println("\nRemoving from array list with index 2:");
		arl.remove(2);
		for(String st:arl) {
			System.out.print(st+"    ");
		}
		System.out.print("\nRetreiving element by index 4: ");
		String rele4 = arl.remove(4);
		System.out.print(rele4);
		System.out.println("\nEmptying Array list and printing:");
		arl.removeAll(arl);
		
		for(String st:arl) {
			System.out.println(st);
		}
	}
}
