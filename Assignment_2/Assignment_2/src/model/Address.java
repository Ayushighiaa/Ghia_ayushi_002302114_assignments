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
    
    private String hStreet;
    private String hUnitNum;
    private String hCity;
    private String hState;
    private long hZipCode;
    private double hPhone;
    private String wStreet;
    private String wUnitNum;
    private String wCity;
    private String wState;
    private long wZipCode;
    private double wPhone;

    public String gethStreet() {
        return hStreet;
    }

    public void sethStreet(String hStreet) {
        this.hStreet = hStreet;
    }

    public String gethUnitNum() {
        return hUnitNum;
    }

    public void sethUnitNum(String hUnitNum) {
        this.hUnitNum = hUnitNum;
    }

    public String gethCity() {
        return hCity;
    }

    public void sethCity(String hCity) {
        this.hCity = hCity;
    }

    public String gethState() {
        return hState;
    }

    public void sethState(String hState) {
        this.hState = hState;
    }

    public long gethZipCode() {
        return hZipCode;
    }

    public void sethZipCode(long hZipCode) {
        this.hZipCode = hZipCode;
    }

    public double gethPhone() {
        return hPhone;
    }

    public void sethPhone(double hPhone) {
        this.hPhone = hPhone;
    }

    public String getwStreet() {
        return wStreet;
    }

    public void setwStreet(String wStreet) {
        this.wStreet = wStreet;
    }

    public String getwUnitNum() {
        return wUnitNum;
    }

    public void setwUnitNum(String wUnitNum) {
        this.wUnitNum = wUnitNum;
    }

    public String getwCity() {
        return wCity;
    }

    public void setwCity(String wCity) {
        this.wCity = wCity;
    }

    public String getwState() {
        return wState;
    }

    public void setwState(String wState) {
        this.wState = wState;
    }

    public long getwZipCode() {
        return wZipCode;
    }

    public void setwZipCode(long wZipCode) {
        this.wZipCode = wZipCode;
    }

    public double getwPhone() {
        return wPhone;
    }

    public void setwPhone(double wPhone) {
        this.wPhone = wPhone;
    }
    
}