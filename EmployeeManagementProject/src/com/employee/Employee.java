package com.employee;

public class Employee {
	
	private int id;
	private String name;
	private String phoneno;;
	private float salary;
	private String role;
	
	
	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Employee(int id, String name, String phoneno,float salary,String role) {
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.salary = salary;
		this.role = role;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone no=" + phoneno +
                ", salary=" + salary +'\'' +
                ", role=" + role +
                '}';
    }

}
