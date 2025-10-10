package com.gayathri.assignmentone.employees;

public class Employee {
	private String name;
	private int employeeId;
	private double salary;
	public Employee(int id, String name, double salary) {
        this.employeeId = id;
        this.name = name;
        this.salary = salary;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
	
}
