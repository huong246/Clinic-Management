/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.dao;
import clinicmanagement.entities.Gender;
import clinicmanagement.entities.Patient;
import clinicmanagement.utils.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nguye
 */
public class PatientDAO {
    public static List<Patient> getAllPatients() {
        List<Patient> patientList = new ArrayList<>();
        String sql = "SELECT id, full_name, email, phone_number, address, gender, date_of_birth, blood_group FROM patients";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Patient patient = new Patient();
                patient.setId(rs.getInt("id"));
                patient.setFullName(rs.getString("full_name"));
                patient.setEmail(rs.getString("email"));
                patient.setPhoneNumber(rs.getString("phone_number"));
                patient.setAddress(rs.getString("address"));
                /*
                if (rs.getString("gender") != null) {
                    patient.setGender(Gender.valueOf(rs.getString("gender").toUpperCase()));
                }                   
                Date dobSql = rs.getDate("date_of_birth");
                if (dobSql != null) {
                    patient.setDateOfBirth(dobSql.toLocalDate());
                }
                if (rs.getString("blood_group") != null) {
                    String bloodGroupStr = rs.getString("blood_group").replace("+", "_POSITIVE").replace("-", "_NEGATIVE");
                    patient.setBloodGroup(BloodGroup.valueOf(bloodGroupStr));
                } */
                patientList.add(patient);
            }
        } catch (SQLException e) {
            System.err.println("Lỗi khi truy vấn danh sách bệnh nhân: " + e.getMessage());
            e.printStackTrace();
        }
        return patientList;
    }
}
