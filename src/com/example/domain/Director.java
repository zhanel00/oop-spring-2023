package com.example.domain;

public class Director extends Manager {
    private double budget;
    public Director(int id, String name, String ssn, double salary, String deptName, double budget) {
        super(id, name, ssn, salary, deptName);
        this.budget = budget;
    }
    public double getBudget() {
        return this.budget;
    }

    public String toString() {
        return super.toString() + "\nBudget:            " + getBudget();
    }
}
