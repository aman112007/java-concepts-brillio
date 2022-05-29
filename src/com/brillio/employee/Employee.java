package com.brillio.employee;

public class Employee {

	public int empid;
	public String empName;
	public double empSal;
	public static String companyName;


	
	public void printEmployeeDetails() {
		
		
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(empSal);
		System.out.println(Employee.companyName);
		System.out.println("------------------------");
	}
}

