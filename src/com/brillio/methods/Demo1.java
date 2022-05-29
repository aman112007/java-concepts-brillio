package com.brillio.methods;

import com.brillio.area.Area;

public class Demo1 {

	
	public static void main(String[] args) {
		
		Area obj= new Area();
		
		int radius =10;
		
		double result = obj.areaOfCircle(10);
		System.out.println(result);
		
		result =obj.areaOfCircle(30);
		System.out.println(result);
		
		result = Area.areaOfTriangle(10.2, 12.2);
		System.out.println(result);
		
		String authorName=Area.getAuthorName();
		System.out.println(authorName);
		
		Area.printClassDescription();
		
		
	}
	

}
