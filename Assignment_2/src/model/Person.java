/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ayushighia
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private int ssn;
    private double age;
    private String gender;
    private String email;
    private Address address;
    private ArrayList<Address> addresses;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 public ArrayList<Address> getAddresses() {
        return addresses;
    }

    // Setter for all addresses
    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    // Convenience methods to get Home and Work addresses
    public Address getHomeAddress() {
        if (addresses != null && !addresses.isEmpty()) {
            return addresses.get(0);  // Assuming the home address is at index 0
        }
        return null;  // Return null if not available
    }

    public Address getWorkAddress() {
        if (addresses != null && addresses.size() > 1) {
            return addresses.get(1);  // Assuming the work address is at index 1
        }
        return null;  // Return null if not available
    }
    
   

   
    
}
