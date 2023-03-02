package com.trainingProject.AutomationJavaSelenium;
import java.util.*;  

public class arraySingersExc {
	
	        public static void main(String [] args)  
	        {  
	          ArrayList<String> al=new ArrayList<String>();  
	          int male =0;
	          int female=0;
	            
	          al.add("Sonu Nigam (m)");    
	          al.add("Vijay Prakash (m)");    
	          al.add("Shreya Ghoshal (f)");    
	            
	          for(String ele:al){
	            if (ele.contains("(m)"))
	            {male++;}
	            else {female++;}        
	          }

	          System.out.println("There are "+ male +" male singers");
	          System.out.println("There are " + female + " female singers");
	       }  
	    } 
	

