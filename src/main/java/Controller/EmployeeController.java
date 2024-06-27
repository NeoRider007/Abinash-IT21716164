/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Employee;
import DataBase.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeController {
    Employee EmployeeObj;

    public Employee addEmployee(String EMPID, String EmployeeName, String Title) {
        EmployeeObj = new Employee(EMPID, EmployeeName, Title);

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO employees (EMPID, EmployeeName, Title) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, EMPID);
                pstmt.setString(2, EmployeeName);
                pstmt.setString(3, Title);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return EmployeeObj;
    }

    public void updateEmployee(String EMPID, String EmployeeName, String Title) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE employees SET EmployeeName = ?, Title = ? WHERE EMPID = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, EmployeeName);
                pstmt.setString(2, Title);
                pstmt.setString(3, EMPID);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(String EMPID) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM employees WHERE EMPID = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, EMPID);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
