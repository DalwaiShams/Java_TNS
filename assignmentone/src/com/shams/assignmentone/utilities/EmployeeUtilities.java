package com.shams.assignmentone.utilities;

import com.shams.assignmentone.employees.Employee;

public class EmployeeUtilities {
    // Print employee details
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }
    public static void updateSalary(Employee employee, double newSalary) {
        employee.setSalary(newSalary);
    }
}
