package com.example;

import java.sql.*;
import java.util.Date;

public class SimpleJDBCExample {

    public static void main(String[] args) throws ClassNotFoundException {
        // Create the "url"
        // assume database server is running on the localhost
        String url = "jdbc:postgresql://localhost:5432/EmployeeDB";
        String username = "postgres";
        String password = "182769";

        // Create a simple query
        String query = "select * from EMPLOYEE";
//        query = "INSERT INTO Employee VALUES (205, 'Bill', 'Murray', '1950-09-21', 150000)";

        // A try-with-resources example
        // Connection and Statement implement java.lan.AutoCloseable
//        Class.forName("org.postgresql.Driver");
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int empID = rs.getInt("ID");
                String first = rs.getString("FIRSTNAME");
                String last = rs.getString("LASTNAME");
                Date birth_date = rs.getDate("BIRTHDATE");
                float salary = rs.getFloat("SALARY");
                System.out.println("Employee ID:   " + empID + "\n"
                        + "Employee Name: " + first.trim() + " " + last.trim() + "\n"
                        + "Birth Date:    " + birth_date + "\n"
                        + "Salary:        " + salary + "\n");

            }
        } catch (SQLException e) {
            System.out.println("Exception creating connection: " + e);
            System.exit(0);
        }
        // No need to close the Connection and Statement objects, the compiler
        // will generate these for us and call the close() statement on this
        // objects in the order we obtained them in the try
    }
}