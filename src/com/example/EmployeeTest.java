package com.example;

import com.example.domain.*;

public class EmployeeTest {
    public static void main(String args[]) {
        Manager manager = new Manager(207, "Barbara Johnson", "054-12-2367",109_501.36,"US Marketing");
        Admin admin = new Admin(304, "Bill Monroe", "108-23-6509", 72_002.34);
        Director director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
        printEmployee(director);
        admin.raiseSalary(200);
        System.out.println(admin.getSalary());
    }

    public static void printEmployee(Employee employee) {
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("SSN: " + employee.getSsn());
        System.out.println("Salary: " + employee.getSalary());

    }
}


