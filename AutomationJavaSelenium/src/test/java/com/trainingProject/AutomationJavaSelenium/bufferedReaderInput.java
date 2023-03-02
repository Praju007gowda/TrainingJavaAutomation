package com.trainingProject.AutomationJavaSelenium;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReaderInput {
	
public static  void main(String[] args) throws IOException
	    {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        String name = bufferedReader.readLine();

	        int number = Integer.parseInt(bufferedReader.readLine());                                              

	        double d = Double.parseDouble(bufferedReader.readLine());

	        System.out.println(name);

	        System.out.println(number);

	        System.out.println(d);

	    }
	}


