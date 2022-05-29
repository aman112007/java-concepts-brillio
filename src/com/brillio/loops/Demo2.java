package com.brillio.loops;

public class Demo2 {

	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,40,50,60,70,12,34,56};
		
		for(int a : numbers)
		{
			if(a==50)
			{
				System.out.println(a);
				break;
			}
			
		}

	}

}
