package com.gayathri.assignment.employees;

public class Developer extends Employee{
	private String projectName;
	private String programmingLanguage;
	public Developer(int id, String name, double salary, String programmingLanguage, String projectName) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
        this.projectName = projectName;
    }
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	@Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Project Name: " + projectName);
    }
}
