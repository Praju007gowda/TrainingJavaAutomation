package com.trainingProject.AutomationJavaSelenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileScanner {
	
	static int i=0;
	static String[] line = new String[3]; 
	
	public static void main(String[] args) {

		try  
		{  
		File file=new File("C:\\Users\\Prajwal.raju\\eclipse-workspace\\AutomationJavaSelenium\\data\\in.txt");    //creates a new file instance  
		FileReader fr=new FileReader(file);     
		BufferedReader br=new BufferedReader(fr);  
		
		
		while((line[i]=br.readLine())!=null & i<3) {
					
			//System.out.println(line[i]);
			i++;
		}
		}
		catch(Exception e) {
		}
		
		
		System.out.println("The integer read is: "+line[0]);
		System.out.println("The floating point number is: "+line[1]);
		System.out.println("The String read is "+line[2]);
		System.out.println("Hi "+line[2]+",the sum of "+line[0]+" and "+line[1]+" is "+(Integer.valueOf(line[0])+(Float.valueOf(line[1]).floatValue())));
		
	}
}
