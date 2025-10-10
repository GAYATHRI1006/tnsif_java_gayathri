package com.gayathri.assignmentone.utilities;
import com.gayathri.assignmentone.employees.*;
public class EmployeeUtilities {

    // Public method to print employee details
    public void printEmployee(Employee emp) {
        System.out.println("---- Employee Details ----");
        emp.displayInfo();  // Calls Employee/Manager/Developer displayInfo() method
    }

    // Another simple public method
    public void printEmployeeName(Employee emp) {
        System.out.println("Employee Name: " + emp.getName());
    }

    // Protected method example
    protected void printEmployeeId(Employee emp) {
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }

    // Private method example
    private void printLine() {
        System.out.println("---------------------------");
    }

    // Public method using private method internally
    public void printWithLine(Employee emp) {
        printLine();
        emp.displayInfo();
        printLine();
    }
}
