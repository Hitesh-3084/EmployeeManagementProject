package com.employee;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class EmployeeService {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> arrayList = new ArrayList<>();
	
	// Function to add an employee details
	public void addEmployee() {
		System.out.println("Enter Employee Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee phone no: ");
		String phoneno = sc.nextLine();
		sc.nextLine();
		
		float salary = 0.0f;
		boolean validInput = false;

		while (!validInput) {
			System.out.println("Enter Employee salary: ");
			if (sc.hasNextFloat()) {
				salary = sc.nextFloat();
				validInput = true; // Input is valid, exit the loop
			} else {
				System.out.println("Invalid input. Please enter a valid float.");
				sc.next(); // Clear invalid input
			}
		}
		sc.nextLine();
		
		System.out.println("Enter Employee role: ");
		String role = sc.nextLine();
		sc.nextLine();
		
		Employee employee = new Employee(id, name, phoneno, salary, role);
		arrayList.add(employee);
		System.out.println("Employee added successfully..");
	}
	
	// Function to display details of employee
	public void listEmployee() {
		if(arrayList.isEmpty()) {
			System.out.println("Record not found..");
		}else {
			for(Employee employee : arrayList) {
				System.out.println(employee);
			}
		}
	}
	
	
	// Function to delete record of an employee
	public void deleteEmployee() {
		System.out.println("Enter Employee id: ");
		int id = sc.nextInt();
		
	   Employee employee = findEmployeeById(id);
	   if(arrayList.remove(employee)) {
		   System.out.println("Employee Record Delete Successfully..");
	   }else {
		   System.out.println("Employee Record NOT Delete Successfully..");
	   }
	}
	
	private Employee findEmployeeById(int id) {
		
		for(Employee employee : arrayList) {
			if(employee.getId()==id) {
				return employee;
			}
		}
		return null;
	}
	
	// Function to update details of an employee
	public void updateEmployee() {
		System.out.println("Enter Employee id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		Employee employee = findEmployeeById(id);
		if(employee!=null) {
			
		
		System.out.println("Enter new employee name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter new employee phone no: ");
		String phoneno = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter new employee salary: ");
		float salary = sc.nextFloat();
		
		employee.setName(name);
		employee.setPhoneno(phoneno);
		employee.setSalary(salary);
		
		System.out.println("Employee details updated successfully...");
		}else {
			System.out.println("Employee details not updated successfully..");
		}
	}

}