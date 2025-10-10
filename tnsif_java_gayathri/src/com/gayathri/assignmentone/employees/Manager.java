package com.gayathri.assignmentone.employees;

public class Manager extends Employee{
    private String dept;
    private int teamSize;
    public Manager(int id, String name, double salary, int teamSize, String department) {
        super(id, name, salary);
        this.teamSize = teamSize;
        this.dept = department;
    }
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	@Override
	public void displayInfo() {
	    super.displayInfo();
	    System.out.println("Department: " + dept);
	    System.out.println("Team Size: " + teamSize);
	}
}
