package com.trainingProject.AutomationJavaSelenium;

import com.trainingProject.AutomationJavaSelenium.Circle;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle("red");
		Circle c2 = new Circle("Blue",3.0);
		
		System.out.println(c1.getArea());
		System.out.println(c1.getRadius());
		System.out.println(c2.getArea());
		System.out.println(c2.getRadius());
		//c1.setColor("Blue");
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());


	}

}
