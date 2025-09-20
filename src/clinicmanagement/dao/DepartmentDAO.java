/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.dao;

import clinicmanagement.entities.Department;
import clinicmanagement.utils.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author nguye
 */
public class DepartmentDAO {
    public boolean add(Department department)
    {
        String sql = "INSERT INTO departments ( department_name, description, consultation_fee) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, department.getDepartmentName());
            ps.setString(2, department.getDescription());
            ps.setBigDecimal(3, department.getConsultationFee());  
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }      
    }         
    public static List<Department> getAllDepartment() {
        List<Department> departmentList = new ArrayList<>();
        String sql = "SELECT department_id, department_name, description, consultation_fee FROM departments";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Department department = new Department();
                department.setDepartmentId(rs.getInt("department_id"));
                department.setDepartmentName(rs.getString("department_name"));
                department.setDescription(rs.getString("description"));
                department.setConsultationFee(rs.getBigDecimal("consultation_fee")); 
                departmentList.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        return departmentList;
    } 
    public boolean deleteDepartment(int departmentId) throws SQLException
    {
        String sql = "DELETE FROM departments WHERE department_id = ?";
        try(Connection conn = DatabaseConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql))
        {
            ps.setInt(1, departmentId);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected >0;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public List<Department> searchByName(String name) {
        List<Department> departmentList = new ArrayList<>();
        String sql = "SELECT * FROM departments WHERE department_name LIKE ?";
        try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + name + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Department doctor = new Department();
                    doctor.setDepartmentId(rs.getInt("department_id"));
                    doctor.setDepartmentName(rs.getString("department_name"));
                    doctor.setDescription(rs.getString("description"));
                    doctor.setConsultationFee(rs.getBigDecimal("consultation_fee"));
                    departmentList.add(doctor);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departmentList;
    }
    public Department getDepartmentById(int departmentId) throws SQLException
    {
        String sql = "SELECT * FROM departments WHERE department_id =?";
        try(Connection conn = DatabaseConnection.getConnection(); 
            PreparedStatement ps = conn.prepareStatement(sql))
        {
            ps.setInt(1, departmentId);
            try(ResultSet rs = ps.executeQuery())
            {
                if(rs.next())
                {
                    Department department = new Department();
                    department.setDepartmentId(rs.getInt("department_id"));
                    department.setDepartmentName(rs.getString("department_name"));
                    department.setDescription(rs.getString("description"));
                    department.setConsultationFee(rs.getBigDecimal("consultation_fee"));
                    return department;
                }
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public boolean updateDepartment(Department department)
    {
        String sql = "UPDATE departments SET department_name =?, description =?, consultation_fee =? WHERE department_id =?";
         try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) 
         {
             ps.setString(1, department.getDepartmentName());
             ps.setString(2, department.getDescription());
             ps.setBigDecimal(3, department.getConsultationFee());
             ps.setInt(4, department.getDepartmentId());

             int rowsAffected = ps.executeUpdate();
             return rowsAffected > 0;
         } catch (SQLException e) {
             e.printStackTrace();
             return false;
         }
    }
                  
}
