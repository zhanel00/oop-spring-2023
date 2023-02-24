package com.example;

import com.example.business.EmployeeStockPlan;
import com.example.domain.*;

import java.sql.SQLOutput;

public class EmployeeTest {
    public static void main(String args[]) {
        Engineer engineer = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager manager = new Manager(207, "Barbara Johnson", "054-12-2367",109_501.36,"US Marketing");
        Admin admin = new Admin(304, "Bill Monroe", "108-23-6509", 72_002.34);
        Director director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
        EmployeeStockPlan esp = new EmployeeStockPlan();
        printEmployee(director);
        admin.raiseSalary(200);
        System.out.println(admin.getSalary());
        System.out.println();
        printEmployee(engineer, esp);
        printEmployee(manager, esp);
        printEmployee(admin, esp);
        printEmployee(director, esp);
    }

    public static void printEmployee(Employee employee) {
        System.out.println("Employee type:     " + employee.getClass().getSimpleName());
        System.out.println(employee.toString());
    }

    public static void printEmployee(Employee employee, EmployeeStockPlan esp) {
        printEmployee(employee);
        System.out.println("Stock Options:     " + esp.grantStock(employee));
    }
}


