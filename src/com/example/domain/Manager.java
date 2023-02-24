package com.example.domain;

import java.text.NumberFormat;

public class Manager extends Employee {
    private String deptName;

    public Manager(int id, String name, String ssn, double salary, String deptName) {
        super(id, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public String toString() {
        return  super.toString() + "\nDepartment:        " + getDeptName();
    }
}
