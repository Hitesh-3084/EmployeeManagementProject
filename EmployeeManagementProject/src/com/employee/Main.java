package com.employee;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		EmployeeService employeeService = new EmployeeService();
		
		while(true) {
			System.out.println("1. Add Employee Details");
			System.out.println("2. Employee Details");
			System.out.println("3. Delete Employee Record");
			System.out.println("4. Update Employee Details");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				employeeService.addEmployee();
				break;
				
			case 2:
				employeeService.listEmployee();
				break;
				
			case 3:
				employeeService.deleteEmployee();
				break;
				
			case 4:
				employeeService.updateEmployee();
				break;
				
			case 5:
				System.out.println("Exiting...");
				sc.close();
				break;
				
			default:
				System.out.println("Invalid choice..");
				break;
			}
			
		}
	}

}
