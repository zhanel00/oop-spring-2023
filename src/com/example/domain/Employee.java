package com.example.domain;

public class Employee {
    private int id;
    private String name;
    private String ssn;
    private double salary;
    public Employee(int id, String name, String ssn, double salary) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase) {
        this.salary += increase;
    }
}
