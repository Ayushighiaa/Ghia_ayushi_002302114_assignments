/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ayushighia
 */
public class Address {
    
    private String HomeAddress;
    private String WorkAddress;

    public String getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(String HomeAddress) {
        this.HomeAddress = HomeAddress;
    }

    public String getWorkAddress() {
        return WorkAddress;
    }

    public void setWorkAddress(String WorkAddress) {
        this.WorkAddress = WorkAddress;
    }
 
    
    
    public Address(Person person){}
}
