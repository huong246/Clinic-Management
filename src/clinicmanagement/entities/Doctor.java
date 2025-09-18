/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.entities;
 
import java.time.LocalDate;
import java.util.Date;
 

/**
 *
 * @author nguye
 */
public class Doctor {
    private int doctorId;
    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private int departmentId;
    private String specialization;
    private Gender gender;
    public Doctor()
    {
        
    }
    public Doctor(String fullName, String email, String specialization, int departmentId, Gender gender, String phoneNumber, LocalDate dateOfBirth) 
    {
        this.fullName = fullName;
        this.email = email;
        this.specialization = specialization;
        this.departmentId = departmentId;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }
    public int getDoctorId()
    {
        return this.doctorId;
    }
    public void setDoctorId(int id)
    {
        this.doctorId = id;
        
    }
    public void setFullName(String fullName)
    {
        this.fullName = fullName;     
    }            
    public String getFullName()
    {
        return this.fullName;
    }
    public void setEmail(String email)
    {
        this.email = email;
        
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setDateOfBirth(LocalDate dateOfbirth)
    {
        this.dateOfBirth = dateOfbirth;
        
    }
    public LocalDate getDateOfBirth()
    {
        return this.dateOfBirth;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public void setDepartmentId(int departmentId)
    {
        this.departmentId = departmentId;
        
    }
    public int getDepartmentId()
    {
        return this.departmentId;
    }
    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
        
    }
    public String getSpecialization()
    {
        return this.specialization;
    }
    public void setGender(Gender gender)
    {
        this.gender = gender;
        
    }
    public Gender getGender()
    {
        return this.gender;
    }     

}
