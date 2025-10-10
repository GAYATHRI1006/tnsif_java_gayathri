package com.gayathri.assignmentone;
import com.gayathri.assignmentone.employees.*;
import com.gayathri.assignmentone.utilities.*;
public class AssignmentMain {
	public static void main(String[] args) {
        // Create Manager and Developer objects
        Manager manager = new Manager(101, "Priya", 85000, 5, "HR");
        Developer developer = new Developer(102, "Rahul", 65000, "Java", "Inventory System");

        // Create EmployeeUtilities object
        EmployeeUtilities util = new EmployeeUtilities();

        // Use simple print methods
        System.out.println("=== Manager Info ===");
        util.printEmployee(manager);

        System.out.println("\n=== Developer Info ===");
        util.printEmployee(developer);

        System.out.println("\n=== Print Only Names ===");
        util.printEmployeeName(manager);
        util.printEmployeeName(developer);

        System.out.println("\n=== Print With Line ===");
        util.printWithLine(manager);
        util.printWithLine(developer);
    }
}
