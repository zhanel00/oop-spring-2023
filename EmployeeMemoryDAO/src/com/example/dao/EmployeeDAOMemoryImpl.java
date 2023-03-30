package com.example.dao;

import com.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOMemoryImpl implements EmployeeDAO {

    public EmployeeDAOMemoryImpl() {

    }

    private static Employee[] employeeArray = new Employee[10];

    // Save our Employee record
    public void add(Employee emp) {
        employeeArray[emp.getId()] = emp;
    }

    public void update(Employee emp) {
        employeeArray[emp.getId()] = emp;
    }

    // Delete our employee record
    public void delete(int id) {
        employeeArray[id] = null;
    }

    // Find an Employee record using this ID
    public Employee findById(int id) {
        return employeeArray[id];
    }

    // Return an array of all of the Employee records
    // We are using a collection List object to store the results
    // This makes it easier to just add to the collection
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
}
