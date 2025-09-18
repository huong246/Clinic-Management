/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicmanagement.entities;

import java.time.LocalDate;

/**
 *
 * @author nguye
 */
public class Patient {
    private int id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String address;
    private Gender gender;
    private LocalDate dateOfBirth;
    private BloodGroup bloodGroup;
    public Patient()
    {
    }
    public Patient(String fullName, String email, String phoneNumber, String address, Gender gender, BloodGroup bloodGroup, LocalDate dateOfBirth)
    {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.dateOfBirth = dateOfBirth;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }       
}
