package com.brillio.area;

public class Area {

	public  double areaOfCircle(int r) {
		double area=3.14*r*r;
		return area;
	}
	
	public static double areaOfTriangle(double base, double height) {
		return (base *height)/2;
	}
	
	public static String getAuthorName() {
		String name = "Aman";
		return name ;
	}
	
	public static void printClassDescription() 
	{
		System.out.println("hello");
	}
}
