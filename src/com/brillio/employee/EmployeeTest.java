package com.brillio.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee.companyName = "Brillio";
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		
		emp1.empid = 101;
		emp1.empName = "John";
		emp1.empSal = 5000;
		
		emp2.empid = 102;
		emp2.empName = "Peter";
		emp2.empSal = 6000;
	
		
		emp2.printEmployeeDetails();
		emp1.printEmployeeDetails();
		emp3.printEmployeeDetails();
		System.out.println("------------------------");
		System.out.println("###################");
		

	}

}
