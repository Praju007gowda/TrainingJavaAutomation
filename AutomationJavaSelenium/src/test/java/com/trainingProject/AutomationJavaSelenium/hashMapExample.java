package com.trainingProject.AutomationJavaSelenium;

import java.util.HashMap;
import java.util.Map;

public class hashMapExample {

	public static void main(String[] args) {

		HashMap<Integer,String> map=new HashMap<Integer,String>();    
		   map.put(1,"Mango");    
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   System.out.println("The count of elements is "+map.size());
		   
		   HashMap<Integer, String> second_Map = new HashMap<Integer,String>();
		   second_Map.putAll(map);
		   System.out.println(second_Map);
		   System.out.println("Removing 3rd element:");
		   second_Map.remove(3);
		   System.out.println(second_Map);
		   System.out.println("Checking if 3rd element is present: "+second_Map.containsKey(3));

		   
	}

}
