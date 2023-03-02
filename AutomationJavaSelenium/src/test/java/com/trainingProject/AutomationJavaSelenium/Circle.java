/**
 * 
 */
package com.trainingProject.AutomationJavaSelenium;

/**
 * @author Prajwal.Raju
 *
 */
public class Circle {
	private double radius=1.0;
	private String color="red";
	/**
	 * 
	 */
	public Circle(String color) {
		// TODO Auto-generated constructor stub
		this.color=color;
	}
	
	public Circle(String color,double radius) {
		// TODO Auto-generated constructor stub
		this.radius= radius;
		this.color= color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return 3.147*radius*radius;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
